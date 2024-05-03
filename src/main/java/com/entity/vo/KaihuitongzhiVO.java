package com.entity.vo;

import com.entity.KaihuitongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 会议
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaihuitongzhi")
public class KaihuitongzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 会议标题
     */

    @TableField(value = "kaihuitongzhi_name")
    private String kaihuitongzhiName;


    /**
     * 会议类型
     */

    @TableField(value = "kaihuitongzhi_types")
    private Integer kaihuitongzhiTypes;


    /**
     * 会议详情
     */

    @TableField(value = "kaihuitongzhi_content")
    private String kaihuitongzhiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "kaihuitongzhi_delete")
    private Integer kaihuitongzhiDelete;


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
	 * 设置：会议标题
	 */
    public String getKaihuitongzhiName() {
        return kaihuitongzhiName;
    }


    /**
	 * 获取：会议标题
	 */

    public void setKaihuitongzhiName(String kaihuitongzhiName) {
        this.kaihuitongzhiName = kaihuitongzhiName;
    }
    /**
	 * 设置：会议类型
	 */
    public Integer getKaihuitongzhiTypes() {
        return kaihuitongzhiTypes;
    }


    /**
	 * 获取：会议类型
	 */

    public void setKaihuitongzhiTypes(Integer kaihuitongzhiTypes) {
        this.kaihuitongzhiTypes = kaihuitongzhiTypes;
    }
    /**
	 * 设置：会议详情
	 */
    public String getKaihuitongzhiContent() {
        return kaihuitongzhiContent;
    }


    /**
	 * 获取：会议详情
	 */

    public void setKaihuitongzhiContent(String kaihuitongzhiContent) {
        this.kaihuitongzhiContent = kaihuitongzhiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKaihuitongzhiDelete() {
        return kaihuitongzhiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setKaihuitongzhiDelete(Integer kaihuitongzhiDelete) {
        this.kaihuitongzhiDelete = kaihuitongzhiDelete;
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
