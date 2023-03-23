package com.example.baosha.controller;

import com.example.baosha.service.IUserService;
import com.example.baosha.vo.LoginVo;
import com.example.baosha.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

	@Autowired
	private IUserService userService;

	/**
	 * 功能描述: 跳转登录页面
	 *
	 * @param:
	 * @return:
	 *
	 * 乐字节：专注线上IT培训
	 * 答疑老师微信：lezijie
	 *
	 * @since: 1.0.0
	 * @Author: zhoubin
	 */
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "login";
	}

	/**
	 * 功能描述: 登录功能
	 *
	 * @param:
	 * @return:
	 *
	 * 乐字节：专注线上IT培训
	 * 答疑老师微信：lezijie
	 *
	 * @since: 1.0.0
	 * @Author: zhoubin
	 */
	@RequestMapping("/doLogin")
	@ResponseBody
	public RespBean doLogin(@Valid LoginVo loginVo, HttpServletRequest request, HttpServletResponse response){
		return userService.doLogin(loginVo,request,response);
	}

}