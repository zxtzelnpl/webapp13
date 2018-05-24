package com.zxt.user;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "user")
public class UserController<T> implements ApplicationContextAware {

    @Resource
    private UserService userService;
    private String page_add = "user_add";
    private ApplicationContext applicationContext = null;


    @RequestMapping(value = "/add_page")
    public String page(){
        return page_add;
    }


    /*AJAX请求
     * POST 方法
     * 数据：application/json
     * */
    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public @ResponseBody
    UserModel user_add(@RequestBody UserModel userModel) {
        userService.addUser(userModel);
        return userModel;
    }


    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        applicationContext = ac;
    }
}
