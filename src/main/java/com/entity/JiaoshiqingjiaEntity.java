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
 * 教师请假
 *
 * @author 
 * @email
 */
@TableName("jiaoshiqingjia")
public class JiaoshiqingjiaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoshiqingjiaEntity() {

	}

	public JiaoshiqingjiaEntity(T t) {
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
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(200)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 请假标题
     */
    @ColumnInfo(comment="请假标题",type="varchar(200)")
    @TableField(value = "jiaoshiqingjia_name")

    private String jiaoshiqingjiaName;


    /**
     * 请假缘由
     */
    @ColumnInfo(comment="请假缘由",type="text")
    @TableField(value = "jiaoshiqingjia_text")

    private String jiaoshiqingjiaText;


    /**
     * 请假类型
     */
    @ColumnInfo(comment="请假类型",type="int(11)")
    @TableField(value = "jiaoshiqingjia_types")

    private Integer jiaoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="请假时间",type="timestamp")
    @TableField(value = "jiaoshiqingjia_time")

    private Date jiaoshiqingjiaTime;


    /**
     * 请假天数
     */
    @ColumnInfo(comment="请假天数",type="int(200)")
    @TableField(value = "jiaoshiqingjia_number")

    private Integer jiaoshiqingjiaNumber;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "jiaoshiqingjia_yesno_types")

    private Integer jiaoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */
    @ColumnInfo(comment="处理意见",type="text")
    @TableField(value = "jiaoshiqingjia_yesno_text")

    private String jiaoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "jiaoshiqingjia_shenhe_time")

    private Date jiaoshiqingjiaShenheTime;


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

    @Override
    public String toString() {
        return "Jiaoshiqingjia{" +
            ", id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", jiaoshiqingjiaName=" + jiaoshiqingjiaName +
            ", jiaoshiqingjiaText=" + jiaoshiqingjiaText +
            ", jiaoshiqingjiaTypes=" + jiaoshiqingjiaTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jiaoshiqingjiaTime=" + DateUtil.convertString(jiaoshiqingjiaTime,"yyyy-MM-dd") +
            ", jiaoshiqingjiaNumber=" + jiaoshiqingjiaNumber +
            ", jiaoshiqingjiaYesnoTypes=" + jiaoshiqingjiaYesnoTypes +
            ", jiaoshiqingjiaYesnoText=" + jiaoshiqingjiaYesnoText +
            ", jiaoshiqingjiaShenheTime=" + DateUtil.convertString(jiaoshiqingjiaShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
