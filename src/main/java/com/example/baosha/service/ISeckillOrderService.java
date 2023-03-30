package com.example.baosha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.baosha.pojo.SeckillOrder;
import com.example.baosha.pojo.User;

/**
 * <p>
 *  服务类
 *
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

	/**
	 * 功能描述: 获取秒杀结果
	 *
	 * @param:
	 * @return:orderId:成功，-1：秒杀失败，0：排队中

	 */
	Long getResult(User user, Long goodsId);
}
