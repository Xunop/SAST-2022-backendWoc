package com.sast.woc.controller;

import com.sast.woc.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xun
 * @create 2023/1/3 17:13
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    //请仿照 User 补充 Admin 的三层架构并完成接口

    /**
     * 根据用户名删除用户
     * @param userName 用户名
     * @return 删除成功返回 success
     */
    @RequestMapping("/del_user")
    public String delUser(String userName) {
        // todo 补全代码
        return "success";
    }

    /**
     * 根据用户名查找用户
     * @param userName 用户名
     * @return User
     */
    @GetMapping("/find_user_info")
    public User findUser(String userName) {
        // todo 补全代码，你需要去掉下面的 null
        return null;
    }
}
