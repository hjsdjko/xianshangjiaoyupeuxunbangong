
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 教师请假
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiaoshiqingjia")
public class JiaoshiqingjiaController {
    private static final Logger logger = LoggerFactory.getLogger(JiaoshiqingjiaController.class);

    private static final String TABLE_NAME = "jiaoshiqingjia";

    @Autowired
    private JiaoshiqingjiaService jiaoshiqingjiaService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表非注册的service
    //注册表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private JiaoshiService jiaoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("教师".equals(role))
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = jiaoshiqingjiaService.queryPage(params);

        //字典表数据转换
        List<JiaoshiqingjiaView> list =(List<JiaoshiqingjiaView>)page.getList();
        for(JiaoshiqingjiaView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiaoshiqingjiaEntity jiaoshiqingjia = jiaoshiqingjiaService.selectById(id);
        if(jiaoshiqingjia !=null){
            //entity转view
            JiaoshiqingjiaView view = new JiaoshiqingjiaView();
            BeanUtils.copyProperties( jiaoshiqingjia , view );//把实体数据重构到view中
            //级联表 教师
            //级联表
            JiaoshiEntity jiaoshi = jiaoshiService.selectById(jiaoshiqingjia.getJiaoshiId());
            if(jiaoshi != null){
            BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "jiaoshiId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setJiaoshiId(jiaoshi.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoshiqingjiaEntity jiaoshiqingjia, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiaoshiqingjia:{}",this.getClass().getName(),jiaoshiqingjia.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("教师".equals(role))
            jiaoshiqingjia.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiaoshiqingjiaEntity> queryWrapper = new EntityWrapper<JiaoshiqingjiaEntity>()
            .eq("jiaoshi_id", jiaoshiqingjia.getJiaoshiId())
            .eq("jiaoshiqingjia_name", jiaoshiqingjia.getJiaoshiqingjiaName())
            .eq("jiaoshiqingjia_types", jiaoshiqingjia.getJiaoshiqingjiaTypes())
            .eq("jiaoshiqingjia_number", jiaoshiqingjia.getJiaoshiqingjiaNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoshiqingjiaEntity jiaoshiqingjiaEntity = jiaoshiqingjiaService.selectOne(queryWrapper);
        if(jiaoshiqingjiaEntity==null){
            jiaoshiqingjia.setInsertTime(new Date());
            jiaoshiqingjia.setJiaoshiqingjiaYesnoTypes(1);
            jiaoshiqingjia.setCreateTime(new Date());
            jiaoshiqingjiaService.insert(jiaoshiqingjia);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoshiqingjiaEntity jiaoshiqingjia, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,jiaoshiqingjia:{}",this.getClass().getName(),jiaoshiqingjia.toString());
        JiaoshiqingjiaEntity oldJiaoshiqingjiaEntity = jiaoshiqingjiaService.selectById(jiaoshiqingjia.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("教师".equals(role))
//            jiaoshiqingjia.setJiaoshiId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<JiaoshiqingjiaEntity> queryWrapper = new EntityWrapper<JiaoshiqingjiaEntity>()
            .notIn("id",jiaoshiqingjia.getId())
            .andNew()
            .eq("jiaoshi_id", jiaoshiqingjia.getJiaoshiId())
            .eq("jiaoshiqingjia_name", jiaoshiqingjia.getJiaoshiqingjiaName())
            .eq("jiaoshiqingjia_types", jiaoshiqingjia.getJiaoshiqingjiaTypes())
            .eq("insert_time", jiaoshiqingjia.getInsertTime())
            .eq("jiaoshiqingjia_time", jiaoshiqingjia.getJiaoshiqingjiaTime())
            .eq("jiaoshiqingjia_number", jiaoshiqingjia.getJiaoshiqingjiaNumber())
            .eq("jiaoshiqingjia_shenhe_time", jiaoshiqingjia.getJiaoshiqingjiaShenheTime())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoshiqingjiaEntity jiaoshiqingjiaEntity = jiaoshiqingjiaService.selectOne(queryWrapper);
        if(jiaoshiqingjiaEntity==null){
            jiaoshiqingjiaService.updateById(jiaoshiqingjia);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody JiaoshiqingjiaEntity jiaoshiqingjiaEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,jiaoshiqingjiaEntity:{}",this.getClass().getName(),jiaoshiqingjiaEntity.toString());

        JiaoshiqingjiaEntity oldJiaoshiqingjia = jiaoshiqingjiaService.selectById(jiaoshiqingjiaEntity.getId());//查询原先数据

//        if(jiaoshiqingjiaEntity.getJiaoshiqingjiaYesnoTypes() == 2){//通过
//            jiaoshiqingjiaEntity.setJiaoshiqingjiaTypes();
//        }else if(jiaoshiqingjiaEntity.getJiaoshiqingjiaYesnoTypes() == 3){//拒绝
//            jiaoshiqingjiaEntity.setJiaoshiqingjiaTypes();
//        }
        jiaoshiqingjiaEntity.setJiaoshiqingjiaShenheTime(new Date());//审核时间
        jiaoshiqingjiaService.updateById(jiaoshiqingjiaEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<JiaoshiqingjiaEntity> oldJiaoshiqingjiaList =jiaoshiqingjiaService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        jiaoshiqingjiaService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JiaoshiqingjiaEntity> jiaoshiqingjiaList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JiaoshiqingjiaEntity jiaoshiqingjiaEntity = new JiaoshiqingjiaEntity();
//                            jiaoshiqingjiaEntity.setJiaoshiId(Integer.valueOf(data.get(0)));   //教师 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaName(data.get(0));                    //请假标题 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaText(data.get(0));                    //请假缘由 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaTypes(Integer.valueOf(data.get(0)));   //请假类型 要改的
//                            jiaoshiqingjiaEntity.setInsertTime(date);//时间
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaTime(sdf.parse(data.get(0)));          //请假时间 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaNumber(Integer.valueOf(data.get(0)));   //请假天数 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaYesnoText(data.get(0));                    //处理意见 要改的
//                            jiaoshiqingjiaEntity.setJiaoshiqingjiaShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            jiaoshiqingjiaEntity.setCreateTime(date);//时间
                            jiaoshiqingjiaList.add(jiaoshiqingjiaEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        jiaoshiqingjiaService.insertBatch(jiaoshiqingjiaList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = jiaoshiqingjiaService.queryPage(params);

        //字典表数据转换
        List<JiaoshiqingjiaView> list =(List<JiaoshiqingjiaView>)page.getList();
        for(JiaoshiqingjiaView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiaoshiqingjiaEntity jiaoshiqingjia = jiaoshiqingjiaService.selectById(id);
            if(jiaoshiqingjia !=null){


                //entity转view
                JiaoshiqingjiaView view = new JiaoshiqingjiaView();
                BeanUtils.copyProperties( jiaoshiqingjia , view );//把实体数据重构到view中

                //级联表
                    JiaoshiEntity jiaoshi = jiaoshiService.selectById(jiaoshiqingjia.getJiaoshiId());
                if(jiaoshi != null){
                    BeanUtils.copyProperties( jiaoshi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setJiaoshiId(jiaoshi.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoshiqingjiaEntity jiaoshiqingjia, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jiaoshiqingjia:{}",this.getClass().getName(),jiaoshiqingjia.toString());
        Wrapper<JiaoshiqingjiaEntity> queryWrapper = new EntityWrapper<JiaoshiqingjiaEntity>()
            .eq("jiaoshi_id", jiaoshiqingjia.getJiaoshiId())
            .eq("jiaoshiqingjia_name", jiaoshiqingjia.getJiaoshiqingjiaName())
            .eq("jiaoshiqingjia_text", jiaoshiqingjia.getJiaoshiqingjiaText())
            .eq("jiaoshiqingjia_types", jiaoshiqingjia.getJiaoshiqingjiaTypes())
            .eq("jiaoshiqingjia_number", jiaoshiqingjia.getJiaoshiqingjiaNumber())
            .eq("jiaoshiqingjia_yesno_types", jiaoshiqingjia.getJiaoshiqingjiaYesnoTypes())
            .eq("jiaoshiqingjia_yesno_text", jiaoshiqingjia.getJiaoshiqingjiaYesnoText())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoshiqingjiaEntity jiaoshiqingjiaEntity = jiaoshiqingjiaService.selectOne(queryWrapper);
        if(jiaoshiqingjiaEntity==null){
            jiaoshiqingjia.setInsertTime(new Date());
            jiaoshiqingjia.setJiaoshiqingjiaYesnoTypes(1);
            jiaoshiqingjia.setCreateTime(new Date());
        jiaoshiqingjiaService.insert(jiaoshiqingjia);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}
