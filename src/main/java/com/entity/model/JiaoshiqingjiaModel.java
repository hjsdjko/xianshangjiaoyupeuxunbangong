package com.entity.model;

import com.entity.JiaoshiqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教师请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoshiqingjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 请假标题
     */
    private String jiaoshiqingjiaName;


    /**
     * 请假缘由
     */
    private String jiaoshiqingjiaText;


    /**
     * 请假类型
     */
    private Integer jiaoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaoshiqingjiaTime;


    /**
     * 请假天数
     */
    private Integer jiaoshiqingjiaNumber;


    /**
     * 申请状态
     */
    private Integer jiaoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    private String jiaoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiaoshiqingjiaShenheTime;


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
	 * 获取：请假标题
	 */
    public String getJiaoshiqingjiaName() {
        return jiaoshiqingjiaName;
    }


    /**
	 * 设置：请假标题
	 */
    public void setJiaoshiqingjiaName(String jiaoshiqingjiaName) {
        this.jiaoshiqingjiaName = jiaoshiqingjiaName;
    }
    /**
	 * 获取：请假缘由
	 */
    public String getJiaoshiqingjiaText() {
        return jiaoshiqingjiaText;
    }


    /**
	 * 设置：请假缘由
	 */
    public void setJiaoshiqingjiaText(String jiaoshiqingjiaText) {
        this.jiaoshiqingjiaText = jiaoshiqingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getJiaoshiqingjiaTypes() {
        return jiaoshiqingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setJiaoshiqingjiaTypes(Integer jiaoshiqingjiaTypes) {
        this.jiaoshiqingjiaTypes = jiaoshiqingjiaTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getJiaoshiqingjiaTime() {
        return jiaoshiqingjiaTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setJiaoshiqingjiaTime(Date jiaoshiqingjiaTime) {
        this.jiaoshiqingjiaTime = jiaoshiqingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getJiaoshiqingjiaNumber() {
        return jiaoshiqingjiaNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setJiaoshiqingjiaNumber(Integer jiaoshiqingjiaNumber) {
        this.jiaoshiqingjiaNumber = jiaoshiqingjiaNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getJiaoshiqingjiaYesnoTypes() {
        return jiaoshiqingjiaYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setJiaoshiqingjiaYesnoTypes(Integer jiaoshiqingjiaYesnoTypes) {
        this.jiaoshiqingjiaYesnoTypes = jiaoshiqingjiaYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getJiaoshiqingjiaYesnoText() {
        return jiaoshiqingjiaYesnoText;
    }


    /**
	 * 设置：处理意见
	 */
    public void setJiaoshiqingjiaYesnoText(String jiaoshiqingjiaYesnoText) {
        this.jiaoshiqingjiaYesnoText = jiaoshiqingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getJiaoshiqingjiaShenheTime() {
        return jiaoshiqingjiaShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setJiaoshiqingjiaShenheTime(Date jiaoshiqingjiaShenheTime) {
        this.jiaoshiqingjiaShenheTime = jiaoshiqingjiaShenheTime;
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
