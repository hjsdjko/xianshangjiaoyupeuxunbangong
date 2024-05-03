package com.entity.model;

import com.entity.JiaoxueshipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 备课信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoxueshipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 备课信息标题
     */
    private String jiaoxueshipinName;


    /**
     * 备课信息照片
     */
    private String jiaoxueshipinPhoto;


    /**
     * 备课资料
     */
    private String jiaoxueshipinFile;


    /**
     * 备课类型
     */
    private Integer jiaoxueshipinTypes;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaoxueshipinTime;


    /**
     * 备课详情
     */
    private String jiaoxueshipinContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 逻辑删除
     */
    private Integer jiaoxueshipinDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：备课信息标题
	 */
    public String getJiaoxueshipinName() {
        return jiaoxueshipinName;
    }


    /**
	 * 设置：备课信息标题
	 */
    public void setJiaoxueshipinName(String jiaoxueshipinName) {
        this.jiaoxueshipinName = jiaoxueshipinName;
    }
    /**
	 * 获取：备课信息照片
	 */
    public String getJiaoxueshipinPhoto() {
        return jiaoxueshipinPhoto;
    }


    /**
	 * 设置：备课信息照片
	 */
    public void setJiaoxueshipinPhoto(String jiaoxueshipinPhoto) {
        this.jiaoxueshipinPhoto = jiaoxueshipinPhoto;
    }
    /**
	 * 获取：备课资料
	 */
    public String getJiaoxueshipinFile() {
        return jiaoxueshipinFile;
    }


    /**
	 * 设置：备课资料
	 */
    public void setJiaoxueshipinFile(String jiaoxueshipinFile) {
        this.jiaoxueshipinFile = jiaoxueshipinFile;
    }
    /**
	 * 获取：备课类型
	 */
    public Integer getJiaoxueshipinTypes() {
        return jiaoxueshipinTypes;
    }


    /**
	 * 设置：备课类型
	 */
    public void setJiaoxueshipinTypes(Integer jiaoxueshipinTypes) {
        this.jiaoxueshipinTypes = jiaoxueshipinTypes;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：上课时间
	 */
    public Date getJiaoxueshipinTime() {
        return jiaoxueshipinTime;
    }


    /**
	 * 设置：上课时间
	 */
    public void setJiaoxueshipinTime(Date jiaoxueshipinTime) {
        this.jiaoxueshipinTime = jiaoxueshipinTime;
    }
    /**
	 * 获取：备课详情
	 */
    public String getJiaoxueshipinContent() {
        return jiaoxueshipinContent;
    }


    /**
	 * 设置：备课详情
	 */
    public void setJiaoxueshipinContent(String jiaoxueshipinContent) {
        this.jiaoxueshipinContent = jiaoxueshipinContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getJiaoxueshipinDelete() {
        return jiaoxueshipinDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setJiaoxueshipinDelete(Integer jiaoxueshipinDelete) {
        this.jiaoxueshipinDelete = jiaoxueshipinDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
