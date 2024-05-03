package com.entity.model;

import com.entity.DianfnagEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 电访信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DianfnagModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String dianfnagName;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 本周电访次数
     */
    private Integer dianfnagCishu;


    /**
     * 本周电访时间
     */
    private Integer dianfnagShijian;


    /**
     * 备注
     */
    private String dianfnagText;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：标题
	 */
    public String getDianfnagName() {
        return dianfnagName;
    }


    /**
	 * 设置：标题
	 */
    public void setDianfnagName(String dianfnagName) {
        this.dianfnagName = dianfnagName;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
	 * 获取：本周电访次数
	 */
    public Integer getDianfnagCishu() {
        return dianfnagCishu;
    }


    /**
	 * 设置：本周电访次数
	 */
    public void setDianfnagCishu(Integer dianfnagCishu) {
        this.dianfnagCishu = dianfnagCishu;
    }
    /**
	 * 获取：本周电访时间
	 */
    public Integer getDianfnagShijian() {
        return dianfnagShijian;
    }


    /**
	 * 设置：本周电访时间
	 */
    public void setDianfnagShijian(Integer dianfnagShijian) {
        this.dianfnagShijian = dianfnagShijian;
    }
    /**
	 * 获取：备注
	 */
    public String getDianfnagText() {
        return dianfnagText;
    }


    /**
	 * 设置：备注
	 */
    public void setDianfnagText(String dianfnagText) {
        this.dianfnagText = dianfnagText;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
