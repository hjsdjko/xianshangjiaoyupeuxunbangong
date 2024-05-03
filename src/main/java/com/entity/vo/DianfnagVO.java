package com.entity.vo;

import com.entity.DianfnagEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电访信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dianfnag")
public class DianfnagVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "dianfnag_name")
    private String dianfnagName;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 本周电访次数
     */

    @TableField(value = "dianfnag_cishu")
    private Integer dianfnagCishu;


    /**
     * 本周电访时间
     */

    @TableField(value = "dianfnag_shijian")
    private Integer dianfnagShijian;


    /**
     * 备注
     */

    @TableField(value = "dianfnag_text")
    private String dianfnagText;


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
	 * 设置：标题
	 */
    public String getDianfnagName() {
        return dianfnagName;
    }


    /**
	 * 获取：标题
	 */

    public void setDianfnagName(String dianfnagName) {
        this.dianfnagName = dianfnagName;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
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
	 * 设置：本周电访次数
	 */
    public Integer getDianfnagCishu() {
        return dianfnagCishu;
    }


    /**
	 * 获取：本周电访次数
	 */

    public void setDianfnagCishu(Integer dianfnagCishu) {
        this.dianfnagCishu = dianfnagCishu;
    }
    /**
	 * 设置：本周电访时间
	 */
    public Integer getDianfnagShijian() {
        return dianfnagShijian;
    }


    /**
	 * 获取：本周电访时间
	 */

    public void setDianfnagShijian(Integer dianfnagShijian) {
        this.dianfnagShijian = dianfnagShijian;
    }
    /**
	 * 设置：备注
	 */
    public String getDianfnagText() {
        return dianfnagText;
    }


    /**
	 * 获取：备注
	 */

    public void setDianfnagText(String dianfnagText) {
        this.dianfnagText = dianfnagText;
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
