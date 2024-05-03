package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 运营事件
 *
 * @author 
 * @email
 */
@TableName("yunyingshijian")
public class YunyingshijianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YunyingshijianEntity() {

	}

	public YunyingshijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 运营事件标题
     */
    @ColumnInfo(comment="运营事件标题",type="varchar(200)")
    @TableField(value = "yunyingshijian_name")

    private String yunyingshijianName;


    /**
     * 运营事件类型
     */
    @ColumnInfo(comment="运营事件类型",type="int(11)")
    @TableField(value = "yunyingshijian_types")

    private Integer yunyingshijianTypes;


    /**
     * 运营事件详情
     */
    @ColumnInfo(comment="运营事件详情",type="text")
    @TableField(value = "yunyingshijian_content")

    private String yunyingshijianContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "yunyingshijian_delete")

    private Integer yunyingshijianDelete;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Yunyingshijian{" +
            ", id=" + id +
            ", yunyingshijianName=" + yunyingshijianName +
            ", yunyingshijianTypes=" + yunyingshijianTypes +
            ", yunyingshijianContent=" + yunyingshijianContent +
            ", yunyingshijianDelete=" + yunyingshijianDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
