package com.example.baosha.service;

import com.example.baosha.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.baosha.vo.LoginVo;
import com.example.baosha.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yzhuanz
 * @since 2023-03-23
 */
public interface IUserService extends IService<User> {

    public RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response);
}
