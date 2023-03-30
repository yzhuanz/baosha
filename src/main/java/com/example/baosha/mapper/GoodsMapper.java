package com.example.baosha.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.baosha.pojo.Goods;
import com.example.baosha.vo.GoodsVo;

import java.util.List;


public interface GoodsMapper extends BaseMapper<Goods> {

    /**
     * 功能描述: 获取商品列表

     */
    List<GoodsVo> findGoodsVo();

    /**
     * 功能描述: 获取商品详情

     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
