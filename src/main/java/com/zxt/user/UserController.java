package com.zxt.user;


import com.zxt.mybean.MyBeanImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

@Controller
public class UserController<T> {

    @Autowired
    protected HttpServletRequest request;
    private String page = "user_one";

    /*1、返回模版页面方式1*/
    /*2、通过getServletContext拿到Bean对象*/
    @RequestMapping("/user_one")
    public String user_one(Model model){

        MyBeanImp myBeanImp = (MyBeanImp) getBean("myBeanImp");
        myBeanImp.sayName();
        model.addAttribute("user",myBeanImp.getList().get(0));
        return page;
    }

    /*1、返回模版页面方式1*/
    @RequestMapping("/user_two")
    public ModelAndView user_two(){
        ModelAndView mad =  new ModelAndView();
        MyBeanImp myBeanImp = (MyBeanImp) getBean("myBeanImp");
        myBeanImp.sayName();
        mad.addObject("user",myBeanImp.getList().get(0));
        mad.setViewName(page);
        return mad;
    }

    /*AJAX请求
    * GET 方法
    * 路径传参
    * */
    @RequestMapping(value = "/user_ajax_one/{name}", method = RequestMethod.GET)
    public @ResponseBody
    UserModel user_ajax_one(@PathVariable String name){
        MyBeanImp myBeanImp = (MyBeanImp) getBean("myBeanImp");
        UserModel userModel = myBeanImp.getList().get(0);
        userModel.setUserName(name);
        return userModel;
    }

    /*AJAX请求
     * POST 方法
     * 数据：application/x-www-form-urlencoded; charset=UTF-8
     * */
    @RequestMapping(value = "/ajax1/", method = RequestMethod.POST)
    public @ResponseBody
    UserModel test_post(
            @RequestParam("name") String name,
            @RequestParam("pwd") String pwd
    ) {
        MyBeanImp myBeanImp = (MyBeanImp) getBean("myBeanImp");
        UserModel userModel = myBeanImp.getList().get(0);
        userModel.setUserName(name);
        userModel.setUserPassword(pwd);
        return userModel;
    }



    private Object getBean(String name){
        ServletContext servletContext = request.getServletContext();
        ApplicationContext context1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        return context1.getBean(name);
    }
}
