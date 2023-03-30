package com.example.baosha.controller;


import com.example.baosha.pojo.User;
import com.example.baosha.service.IOrderService;
import com.example.baosha.vo.OrderDetailVo;
import com.example.baosha.vo.RespBean;
import com.example.baosha.vo.RespBeanEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 前端控制器
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService orderService;

	/**
	 * 功能描述: 订单详情
	 *

	 */
	@RequestMapping("/detail")
	@ResponseBody
	public RespBean detail(User user, Long orderId) {
		if (user == null) {
			return RespBean.error(RespBeanEnum.SESSION_ERROR);
		}
		OrderDetailVo detail = orderService.detail(orderId);
		return RespBean.success(detail);
	}

}
