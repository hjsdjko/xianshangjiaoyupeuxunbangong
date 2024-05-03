package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.KaihuitongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 会议
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("kaihuitongzhi")
public class KaihuitongzhiView extends KaihuitongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 会议类型的值
	*/
	@ColumnInfo(comment="会议类型的字典表值",type="varchar(200)")
	private String kaihuitongzhiValue;




	public KaihuitongzhiView() {

	}

	public KaihuitongzhiView(KaihuitongzhiEntity kaihuitongzhiEntity) {
		try {
			BeanUtils.copyProperties(this, kaihuitongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 会议类型的值
	*/
	public String getKaihuitongzhiValue() {
		return kaihuitongzhiValue;
	}
	/**
	* 设置： 会议类型的值
	*/
	public void setKaihuitongzhiValue(String kaihuitongzhiValue) {
		this.kaihuitongzhiValue = kaihuitongzhiValue;
	}




	@Override
	public String toString() {
		return "KaihuitongzhiView{" +
			", kaihuitongzhiValue=" + kaihuitongzhiValue +
			"} " + super.toString();
	}
}
