package com.zjh.mall.portal.controller;

import com.zjh.mall.common.api.CommonResult;
import com.zjh.mall.portal.domain.HomeContentResult;
import com.zjh.mall.portal.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "HomeController", description = "首页内容管理")
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @ApiOperation("首页内容信息展示")
    @GetMapping("/content")
    @ResponseBody
    public CommonResult<HomeContentResult> content(){
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }
}
