package com.example.baosha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.baosha.pojo.Goods;
import com.example.baosha.vo.GoodsVo;

import java.util.List;

/**
 * <p>
 * 服务类
 */
public interface IGoodsService extends IService<Goods> {

    /**
     * 功能描述: 获取商品列表
     */
    List<GoodsVo> findGoodsVo();


    /**
     * 功能描述: 获取商品详情
     */
    GoodsVo findGoodsVoByGoodsId(Long goodsId);
}
