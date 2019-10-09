package com.fuhang.controller;


import com.fuhang.entity.User;
import com.fuhang.service.UserService;
import com.fuhang.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 用户基本信息表 前端控制器
 * </p>
 *
 * @author yuan
 * @since 2019-09-30
 */
@Api(description = "用户接口")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getUser")
    public @ResponseBody User getUser() {
        User user = userService.getById("1");
        return user;
    }

    @RequestMapping("/getUserById")
    public @ResponseBody User getUserById(HttpServletRequest request) {
        String id = request.getParameter("id");
        User user = userService.getUserById(Long.parseLong(id));
        return user;
    }

}
