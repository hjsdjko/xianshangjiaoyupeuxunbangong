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
 * 会议
 *
 * @author 
 * @email
 */
@TableName("kaihuitongzhi")
public class KaihuitongzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaihuitongzhiEntity() {

	}

	public KaihuitongzhiEntity(T t) {
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
     * 会议标题
     */
    @ColumnInfo(comment="会议标题",type="varchar(200)")
    @TableField(value = "kaihuitongzhi_name")

    private String kaihuitongzhiName;


    /**
     * 会议类型
     */
    @ColumnInfo(comment="会议类型",type="int(11)")
    @TableField(value = "kaihuitongzhi_types")

    private Integer kaihuitongzhiTypes;


    /**
     * 会议详情
     */
    @ColumnInfo(comment="会议详情",type="text")
    @TableField(value = "kaihuitongzhi_content")

    private String kaihuitongzhiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "kaihuitongzhi_delete")

    private Integer kaihuitongzhiDelete;


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

    @Override
    public String toString() {
        return "Kaihuitongzhi{" +
            ", id=" + id +
            ", kaihuitongzhiName=" + kaihuitongzhiName +
            ", kaihuitongzhiTypes=" + kaihuitongzhiTypes +
            ", kaihuitongzhiContent=" + kaihuitongzhiContent +
            ", kaihuitongzhiDelete=" + kaihuitongzhiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
