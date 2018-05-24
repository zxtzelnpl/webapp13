package com.zxt.user;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserControllerTest implements ApplicationContextAware {
    @Resource
    private UserService userService;
    private ApplicationContext applicationContext = null;

    /*
     * 这边值用于临时测试
     * */
    @RequestMapping(value="test/{id}")
    public @ResponseBody
    UserModel test_id(@PathVariable int id) {
        UserModel um = userService.getUserById(id);
        return um;
    }

    /*
     * 这边值用于临时测试
     * */
    @RequestMapping(value="test/all")
    public @ResponseBody
    List<UserModel> test_all() {
        List<UserModel> um = userService.getAllUsers();
        return um;
    }

    /*
     * 这边值用于临时测试
     * */
    @RequestMapping(value="test2")
    public @ResponseBody
    UserModel test2() {
        UserModel um = (UserModel) applicationContext.getBean("userModel2");
        return um;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        applicationContext = ac;
    }
}
