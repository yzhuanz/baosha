package com.example.baosha.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.baosha.mapper.GoodsMapper;
import com.example.baosha.pojo.Goods;
import com.example.baosha.service.IGoodsService;
import com.example.baosha.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类

 *
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

	/**
	 * 功能描述: 获取商品列表
	 */
	@Override
	public List<GoodsVo> findGoodsVo() {
		return goodsMapper.findGoodsVo();
	}



	/**
	 * 功能描述: 获取商品详情
	 */
	@Override
	public GoodsVo findGoodsVoByGoodsId(Long goodsId) {
		return goodsMapper.findGoodsVoByGoodsId(goodsId);
	}
}
