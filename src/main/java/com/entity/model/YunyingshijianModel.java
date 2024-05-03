package com.entity.model;

import com.entity.YunyingshijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 运营事件
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YunyingshijianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 运营事件标题
     */
    private String yunyingshijianName;


    /**
     * 运营事件类型
     */
    private Integer yunyingshijianTypes;


    /**
     * 运营事件详情
     */
    private String yunyingshijianContent;


    /**
     * 逻辑删除
     */
    private Integer yunyingshijianDelete;


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
	 * 获取：运营事件标题
	 */
    public String getYunyingshijianName() {
        return yunyingshijianName;
    }


    /**
	 * 设置：运营事件标题
	 */
    public void setYunyingshijianName(String yunyingshijianName) {
        this.yunyingshijianName = yunyingshijianName;
    }
    /**
	 * 获取：运营事件类型
	 */
    public Integer getYunyingshijianTypes() {
        return yunyingshijianTypes;
    }


    /**
	 * 设置：运营事件类型
	 */
    public void setYunyingshijianTypes(Integer yunyingshijianTypes) {
        this.yunyingshijianTypes = yunyingshijianTypes;
    }
    /**
	 * 获取：运营事件详情
	 */
    public String getYunyingshijianContent() {
        return yunyingshijianContent;
    }


    /**
	 * 设置：运营事件详情
	 */
    public void setYunyingshijianContent(String yunyingshijianContent) {
        this.yunyingshijianContent = yunyingshijianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYunyingshijianDelete() {
        return yunyingshijianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYunyingshijianDelete(Integer yunyingshijianDelete) {
        this.yunyingshijianDelete = yunyingshijianDelete;
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
