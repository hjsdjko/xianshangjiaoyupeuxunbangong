package com.entity.model;

import com.entity.KaihuitongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 会议
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaihuitongzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 会议标题
     */
    private String kaihuitongzhiName;


    /**
     * 会议类型
     */
    private Integer kaihuitongzhiTypes;


    /**
     * 会议详情
     */
    private String kaihuitongzhiContent;


    /**
     * 逻辑删除
     */
    private Integer kaihuitongzhiDelete;


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
	 * 获取：会议标题
	 */
    public String getKaihuitongzhiName() {
        return kaihuitongzhiName;
    }


    /**
	 * 设置：会议标题
	 */
    public void setKaihuitongzhiName(String kaihuitongzhiName) {
        this.kaihuitongzhiName = kaihuitongzhiName;
    }
    /**
	 * 获取：会议类型
	 */
    public Integer getKaihuitongzhiTypes() {
        return kaihuitongzhiTypes;
    }


    /**
	 * 设置：会议类型
	 */
    public void setKaihuitongzhiTypes(Integer kaihuitongzhiTypes) {
        this.kaihuitongzhiTypes = kaihuitongzhiTypes;
    }
    /**
	 * 获取：会议详情
	 */
    public String getKaihuitongzhiContent() {
        return kaihuitongzhiContent;
    }


    /**
	 * 设置：会议详情
	 */
    public void setKaihuitongzhiContent(String kaihuitongzhiContent) {
        this.kaihuitongzhiContent = kaihuitongzhiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getKaihuitongzhiDelete() {
        return kaihuitongzhiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setKaihuitongzhiDelete(Integer kaihuitongzhiDelete) {
        this.kaihuitongzhiDelete = kaihuitongzhiDelete;
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
