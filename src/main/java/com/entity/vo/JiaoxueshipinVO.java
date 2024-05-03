package com.entity.vo;

import com.entity.JiaoxueshipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 备课信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaoxueshipin")
public class JiaoxueshipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 备课信息标题
     */

    @TableField(value = "jiaoxueshipin_name")
    private String jiaoxueshipinName;


    /**
     * 备课信息照片
     */

    @TableField(value = "jiaoxueshipin_photo")
    private String jiaoxueshipinPhoto;


    /**
     * 备课资料
     */

    @TableField(value = "jiaoxueshipin_file")
    private String jiaoxueshipinFile;


    /**
     * 备课类型
     */

    @TableField(value = "jiaoxueshipin_types")
    private Integer jiaoxueshipinTypes;


    /**
     * 教师
     */

    @TableField(value = "jiaoshi_id")
    private Integer jiaoshiId;


    /**
     * 上课时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiaoxueshipin_time")
    private Date jiaoxueshipinTime;


    /**
     * 备课详情
     */

    @TableField(value = "jiaoxueshipin_content")
    private String jiaoxueshipinContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 逻辑删除
     */

    @TableField(value = "jiaoxueshipin_delete")
    private Integer jiaoxueshipinDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：备课信息标题
	 */
    public String getJiaoxueshipinName() {
        return jiaoxueshipinName;
    }


    /**
	 * 获取：备课信息标题
	 */

    public void setJiaoxueshipinName(String jiaoxueshipinName) {
        this.jiaoxueshipinName = jiaoxueshipinName;
    }
    /**
	 * 设置：备课信息照片
	 */
    public String getJiaoxueshipinPhoto() {
        return jiaoxueshipinPhoto;
    }


    /**
	 * 获取：备课信息照片
	 */

    public void setJiaoxueshipinPhoto(String jiaoxueshipinPhoto) {
        this.jiaoxueshipinPhoto = jiaoxueshipinPhoto;
    }
    /**
	 * 设置：备课资料
	 */
    public String getJiaoxueshipinFile() {
        return jiaoxueshipinFile;
    }


    /**
	 * 获取：备课资料
	 */

    public void setJiaoxueshipinFile(String jiaoxueshipinFile) {
        this.jiaoxueshipinFile = jiaoxueshipinFile;
    }
    /**
	 * 设置：备课类型
	 */
    public Integer getJiaoxueshipinTypes() {
        return jiaoxueshipinTypes;
    }


    /**
	 * 获取：备课类型
	 */

    public void setJiaoxueshipinTypes(Integer jiaoxueshipinTypes) {
        this.jiaoxueshipinTypes = jiaoxueshipinTypes;
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
	 * 设置：上课时间
	 */
    public Date getJiaoxueshipinTime() {
        return jiaoxueshipinTime;
    }


    /**
	 * 获取：上课时间
	 */

    public void setJiaoxueshipinTime(Date jiaoxueshipinTime) {
        this.jiaoxueshipinTime = jiaoxueshipinTime;
    }
    /**
	 * 设置：备课详情
	 */
    public String getJiaoxueshipinContent() {
        return jiaoxueshipinContent;
    }


    /**
	 * 获取：备课详情
	 */

    public void setJiaoxueshipinContent(String jiaoxueshipinContent) {
        this.jiaoxueshipinContent = jiaoxueshipinContent;
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
	 * 设置：逻辑删除
	 */
    public Integer getJiaoxueshipinDelete() {
        return jiaoxueshipinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJiaoxueshipinDelete(Integer jiaoxueshipinDelete) {
        this.jiaoxueshipinDelete = jiaoxueshipinDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
