package com.entity.vo;

import com.entity.JiaoshiqingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教师请假
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoshiqingjia")
public class JiaoshiqingjiaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 请假标题
     */

    @TableField(value = "jiaoshiqingjia_name")
    private String jiaoshiqingjiaName;


    /**
     * 请假缘由
     */

    @TableField(value = "jiaoshiqingjia_text")
    private String jiaoshiqingjiaText;


    /**
     * 请假类型
     */

    @TableField(value = "jiaoshiqingjia_types")
    private Integer jiaoshiqingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiaoshiqingjia_time")
    private Date jiaoshiqingjiaTime;


    /**
     * 请假天数
     */

    @TableField(value = "jiaoshiqingjia_number")
    private Integer jiaoshiqingjiaNumber;


    /**
     * 申请状态
     */

    @TableField(value = "jiaoshiqingjia_yesno_types")
    private Integer jiaoshiqingjiaYesnoTypes;


    /**
     * 处理意见
     */

    @TableField(value = "jiaoshiqingjia_yesno_text")
    private String jiaoshiqingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiaoshiqingjia_shenhe_time")
    private Date jiaoshiqingjiaShenheTime;


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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：请假标题
	 */
    public String getJiaoshiqingjiaName() {
        return jiaoshiqingjiaName;
    }


    /**
	 * 获取：请假标题
	 */

    public void setJiaoshiqingjiaName(String jiaoshiqingjiaName) {
        this.jiaoshiqingjiaName = jiaoshiqingjiaName;
    }
    /**
	 * 设置：请假缘由
	 */
    public String getJiaoshiqingjiaText() {
        return jiaoshiqingjiaText;
    }


    /**
	 * 获取：请假缘由
	 */

    public void setJiaoshiqingjiaText(String jiaoshiqingjiaText) {
        this.jiaoshiqingjiaText = jiaoshiqingjiaText;
    }
    /**
	 * 设置：请假类型
	 */
    public Integer getJiaoshiqingjiaTypes() {
        return jiaoshiqingjiaTypes;
    }


    /**
	 * 获取：请假类型
	 */

    public void setJiaoshiqingjiaTypes(Integer jiaoshiqingjiaTypes) {
        this.jiaoshiqingjiaTypes = jiaoshiqingjiaTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：请假时间
	 */
    public Date getJiaoshiqingjiaTime() {
        return jiaoshiqingjiaTime;
    }


    /**
	 * 获取：请假时间
	 */

    public void setJiaoshiqingjiaTime(Date jiaoshiqingjiaTime) {
        this.jiaoshiqingjiaTime = jiaoshiqingjiaTime;
    }
    /**
	 * 设置：请假天数
	 */
    public Integer getJiaoshiqingjiaNumber() {
        return jiaoshiqingjiaNumber;
    }


    /**
	 * 获取：请假天数
	 */

    public void setJiaoshiqingjiaNumber(Integer jiaoshiqingjiaNumber) {
        this.jiaoshiqingjiaNumber = jiaoshiqingjiaNumber;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getJiaoshiqingjiaYesnoTypes() {
        return jiaoshiqingjiaYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setJiaoshiqingjiaYesnoTypes(Integer jiaoshiqingjiaYesnoTypes) {
        this.jiaoshiqingjiaYesnoTypes = jiaoshiqingjiaYesnoTypes;
    }
    /**
	 * 设置：处理意见
	 */
    public String getJiaoshiqingjiaYesnoText() {
        return jiaoshiqingjiaYesnoText;
    }


    /**
	 * 获取：处理意见
	 */

    public void setJiaoshiqingjiaYesnoText(String jiaoshiqingjiaYesnoText) {
        this.jiaoshiqingjiaYesnoText = jiaoshiqingjiaYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getJiaoshiqingjiaShenheTime() {
        return jiaoshiqingjiaShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setJiaoshiqingjiaShenheTime(Date jiaoshiqingjiaShenheTime) {
        this.jiaoshiqingjiaShenheTime = jiaoshiqingjiaShenheTime;
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
