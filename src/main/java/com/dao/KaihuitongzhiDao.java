package com.dao;

import com.entity.KaihuitongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaihuitongzhiView;

/**
 * 会议 Dao 接口
 *
 * @author 
 */
public interface KaihuitongzhiDao extends BaseMapper<KaihuitongzhiEntity> {

   List<KaihuitongzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
