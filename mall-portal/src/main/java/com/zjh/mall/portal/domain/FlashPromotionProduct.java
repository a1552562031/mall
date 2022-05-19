package com.zjh.mall.portal.domain;

import com.zjh.mall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct {
    @ApiModelProperty("秒杀价格")
    private BigDecimal flashPromotionPrice;
    @ApiModelProperty("用于秒杀到数量")
    private Integer flashPromotionCount;
    @ApiModelProperty("秒杀限购数量")
    private Integer flashPromotionLimit;
}
