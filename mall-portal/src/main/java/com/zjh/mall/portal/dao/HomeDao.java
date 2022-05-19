package com.zjh.mall.portal.dao;

import com.zjh.mall.model.PmsBrand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HomeDao {
    /**
     * 获取推荐品牌
     */
    List<PmsBrand> getRecommendBrandList(@Param("offset") Integer offset, @Param("limit") Integer limit);
}
