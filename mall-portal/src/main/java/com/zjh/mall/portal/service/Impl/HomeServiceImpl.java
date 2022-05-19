package com.zjh.mall.portal.service.Impl;

import com.zjh.mall.mapper.SmsHomeAdvertiseMapper;
import com.zjh.mall.model.SmsHomeAdvertise;
import com.zjh.mall.model.SmsHomeAdvertiseExample;
import com.zjh.mall.portal.dao.HomeDao;
import com.zjh.mall.portal.domain.HomeContentResult;
import com.zjh.mall.portal.domain.HomeFlashPromotion;
import com.zjh.mall.portal.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    private SmsHomeAdvertiseMapper advertiseMapper;
    @Autowired
    private HomeDao homeDao;
    @Override
    public HomeContentResult content() {
        HomeContentResult result = new HomeContentResult();
        //获取首页广告
        result.setAdvertiseList(getHomeAdvertiseList());
        //获取推荐品牌
        result.setBrandList(homeDao.getRecommendBrandList(0,6));
        //获取秒杀信息
        result.setHomeFlashPromotion(getHomeFlashPromotion());
        return result;
    }

    private HomeFlashPromotion getHomeFlashPromotion() {
        HomeFlashPromotion homeFlashPromotion = new HomeFlashPromotion();
        //获取当前秒杀活动
        Date now = new Date();
        getFlashPromotion(now)
        return homeFlashPromotion;
    }

    private List<SmsHomeAdvertise> getHomeAdvertiseList() {
        SmsHomeAdvertiseExample example = new SmsHomeAdvertiseExample();
        example.createCriteria().andTypeEqualTo(1).andSortEqualTo(1);
        example.setOrderByClause("sort desc");
        return advertiseMapper.selectByExample(example);
    }
}
