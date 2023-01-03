package com.sast.woc.controller;

import com.sast.woc.entity.User;
import com.sast.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xun
 * @create 2023/1/3 17:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * 以下是一个示例，以Get方法请求数据
     * @param value value
     * @return User
     */
    @GetMapping("/sample")
    public User sample(String value) {
        // 按住 Ctrl 键用鼠标点一下这个方法进里面看看吧。
        return userService.sample(value);
    }

    /**
     * 完成注册功能
     * 选做：对密码进行加密
     * @param user 用户实体类
     * @return 注册成功返回 success
     */
    @RequestMapping("/register")
    public String addUser(User user) {
        // todo 这里需要你补全
        return "success";
    }

    /**
     * 完成登录功能
     * @param userName 用户名
     * @param password 密码
     * @return 如果登录成功返回 {@code true}, 否则 {@code false}
     */
    @PostMapping("/login")
    public Boolean login(@RequestParam(defaultValue = "") String userName, @RequestParam(defaultValue = "") String password) {
        // todo 这里需要你补全
        return true;
    }
}
