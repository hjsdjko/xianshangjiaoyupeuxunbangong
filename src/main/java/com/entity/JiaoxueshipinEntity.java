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
 * 备课信息
 *
 * @author 
 * @email
 */
@TableName("jiaoxueshipin")
public class JiaoxueshipinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoxueshipinEntity() {

	}

	public JiaoxueshipinEntity(T t) {
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
     * 备课信息标题
     */
    @ColumnInfo(comment="备课信息标题",type="varchar(200)")
    @TableField(value = "jiaoxueshipin_name")

    private String jiaoxueshipinName;


    /**
     * 备课信息照片
     */
    @ColumnInfo(comment="备课信息照片",type="varchar(200)")
    @TableField(value = "jiaoxueshipin_photo")

    private String jiaoxueshipinPhoto;


    /**
     * 备课资料
     */
    @ColumnInfo(comment="备课资料",type="varchar(200)")
    @TableField(value = "jiaoxueshipin_file")

    private String jiaoxueshipinFile;


    /**
     * 备课类型
     */
    @ColumnInfo(comment="备课类型",type="int(11)")
    @TableField(value = "jiaoxueshipin_types")

    private Integer jiaoxueshipinTypes;


    /**
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="上课时间",type="timestamp")
    @TableField(value = "jiaoxueshipin_time")

    private Date jiaoxueshipinTime;


    /**
     * 备课详情
     */
    @ColumnInfo(comment="备课详情",type="text")
    @TableField(value = "jiaoxueshipin_content")

    private String jiaoxueshipinContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "jiaoxueshipin_delete")

    private Integer jiaoxueshipinDelete;


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
        return "Jiaoxueshipin{" +
            ", id=" + id +
            ", jiaoxueshipinName=" + jiaoxueshipinName +
            ", jiaoxueshipinPhoto=" + jiaoxueshipinPhoto +
            ", jiaoxueshipinFile=" + jiaoxueshipinFile +
            ", jiaoxueshipinTypes=" + jiaoxueshipinTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", jiaoxueshipinTime=" + DateUtil.convertString(jiaoxueshipinTime,"yyyy-MM-dd") +
            ", jiaoxueshipinContent=" + jiaoxueshipinContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jiaoxueshipinDelete=" + jiaoxueshipinDelete +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
