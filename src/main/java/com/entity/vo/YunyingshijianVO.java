package com.entity.vo;

import com.entity.YunyingshijianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 运营事件
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yunyingshijian")
public class YunyingshijianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 运营事件标题
     */

    @TableField(value = "yunyingshijian_name")
    private String yunyingshijianName;


    /**
     * 运营事件类型
     */

    @TableField(value = "yunyingshijian_types")
    private Integer yunyingshijianTypes;


    /**
     * 运营事件详情
     */

    @TableField(value = "yunyingshijian_content")
    private String yunyingshijianContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "yunyingshijian_delete")
    private Integer yunyingshijianDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：运营事件标题
	 */
    public String getYunyingshijianName() {
        return yunyingshijianName;
    }


    /**
	 * 获取：运营事件标题
	 */

    public void setYunyingshijianName(String yunyingshijianName) {
        this.yunyingshijianName = yunyingshijianName;
    }
    /**
	 * 设置：运营事件类型
	 */
    public Integer getYunyingshijianTypes() {
        return yunyingshijianTypes;
    }


    /**
	 * 获取：运营事件类型
	 */

    public void setYunyingshijianTypes(Integer yunyingshijianTypes) {
        this.yunyingshijianTypes = yunyingshijianTypes;
    }
    /**
	 * 设置：运营事件详情
	 */
    public String getYunyingshijianContent() {
        return yunyingshijianContent;
    }


    /**
	 * 获取：运营事件详情
	 */

    public void setYunyingshijianContent(String yunyingshijianContent) {
        this.yunyingshijianContent = yunyingshijianContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYunyingshijianDelete() {
        return yunyingshijianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYunyingshijianDelete(Integer yunyingshijianDelete) {
        this.yunyingshijianDelete = yunyingshijianDelete;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
