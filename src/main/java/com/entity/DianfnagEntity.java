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
 * 电访信息
 *
 * @author 
 * @email
 */
@TableName("dianfnag")
public class DianfnagEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DianfnagEntity() {

	}

	public DianfnagEntity(T t) {
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
     * 标题
     */
    @ColumnInfo(comment="标题",type="varchar(200)")
    @TableField(value = "dianfnag_name")

    private String dianfnagName;


    /**
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 教师
     */
    @ColumnInfo(comment="教师",type="int(11)")
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 本周电访次数
     */
    @ColumnInfo(comment="本周电访次数",type="int(11)")
    @TableField(value = "dianfnag_cishu")

    private Integer dianfnagCishu;


    /**
     * 本周电访时间
     */
    @ColumnInfo(comment="本周电访时间",type="int(11)")
    @TableField(value = "dianfnag_shijian")

    private Integer dianfnagShijian;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="text")
    @TableField(value = "dianfnag_text")

    private String dianfnagText;


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

    @Override
    public String toString() {
        return "Dianfnag{" +
            ", id=" + id +
            ", dianfnagName=" + dianfnagName +
            ", yonghuId=" + yonghuId +
            ", jiaoshiId=" + jiaoshiId +
            ", dianfnagCishu=" + dianfnagCishu +
            ", dianfnagShijian=" + dianfnagShijian +
            ", dianfnagText=" + dianfnagText +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
