package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YunyingshijianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 运营事件
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yunyingshijian")
public class YunyingshijianView extends YunyingshijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 运营事件类型的值
	*/
	@ColumnInfo(comment="运营事件类型的字典表值",type="varchar(200)")
	private String yunyingshijianValue;




	public YunyingshijianView() {

	}

	public YunyingshijianView(YunyingshijianEntity yunyingshijianEntity) {
		try {
			BeanUtils.copyProperties(this, yunyingshijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 运营事件类型的值
	*/
	public String getYunyingshijianValue() {
		return yunyingshijianValue;
	}
	/**
	* 设置： 运营事件类型的值
	*/
	public void setYunyingshijianValue(String yunyingshijianValue) {
		this.yunyingshijianValue = yunyingshijianValue;
	}




	@Override
	public String toString() {
		return "YunyingshijianView{" +
			", yunyingshijianValue=" + yunyingshijianValue +
			"} " + super.toString();
	}
}
