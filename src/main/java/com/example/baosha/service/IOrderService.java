package com.example.baosha.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.baosha.pojo.Order;
import com.example.baosha.pojo.User;
import com.example.baosha.vo.GoodsVo;
import com.example.baosha.vo.OrderDetailVo;


/**
 * <p>
 * 服务类

 */
public interface IOrderService extends IService<Order> {

    /**
     * 功能描述: 秒杀
     */
    Order seckill(User user, GoodsVo goods);


    /**
     * 功能描述: 订单详情
     */
    OrderDetailVo detail(Long orderId);

    /**
     * 功能描述: 获取秒杀地址
     *
     */
    String createPath(User user, Long goodsId);

    /**
     * 校验秒杀地址
     *
     * @param user
     * @param goodsId
     * @param path
     * @return
     */
    boolean checkPath(User user, Long goodsId, String path);


    /**
     * 功能描述: 校验验证码

     */
    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
