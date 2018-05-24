package com.zxt.user;


import com.alibaba.fastjson.JSON;
import com.zxt.mybean.MyBeanImp;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
public class UserControllerBack implements ApplicationContextAware {

    private String page = "user_one";
    private ApplicationContext applicationContext = null;

    /*使用注解的方式创建bean*/
    @Bean(name="userModel2")
    public UserModel userModel2(){
        return new UserModel();
    }

    /*1、返回模版页面方式1*/
    /*2、通过getServletContext拿到Bean对象*/
    @RequestMapping("/user_one")
    public String user_one(Model model){
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        myBeanImp.sayName();
        model.addAttribute("user",myBeanImp.getList().get(0));
        return page;
    }

    /*1、返回模版页面方式1*/
    @RequestMapping("/user_two")
    public ModelAndView user_two(){
        ModelAndView mad =  new ModelAndView();
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        myBeanImp.sayName();
        mad.addObject("user",myBeanImp.getList().get(0));
        mad.setViewName(page);
        return mad;
    }

    /*1. 返回JSON数据1*/
    /*2. 需要jackson的包3个*/
    @RequestMapping("/user_json_one")
    public @ResponseBody MyBeanImp user_json_one(){
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        return myBeanImp;
    }

    /*1. 返回JSON数据1*/
    /*2. 需要下载阿里巴巴的数据包*/
    @RequestMapping("/user_json_two")
    public String user_json_two(HttpServletResponse response){
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        String data = JSON.toJSONString(myBeanImp);
        response.setContentType("text/html;charset=UTF-8");
        try{
            PrintWriter out = response.getWriter();
            out.println(data);
            out.flush();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

    /*AJAX请求
     * GET 方法
     * 路径传参
     * */
    @RequestMapping(value = "/user_ajax_one/{name}/{pwd}", method = RequestMethod.GET)
    public @ResponseBody
    UserModel user_ajax_one(@PathVariable String name,@PathVariable String pwd){
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        UserModel userModel = myBeanImp.getList().get(0);
        userModel.setUserName(name);
        userModel.setUserPassword(pwd);
        return userModel;
    }

    /*AJAX请求
     * GET 方法
     * Query传参
     * */
    @RequestMapping(value = "/user_ajax_two", method = RequestMethod.GET)
    public @ResponseBody
    UserModel user_ajax_two(@RequestParam("name") String name) {
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        UserModel userModel = myBeanImp.getList().get(0);
        userModel.setUserName(name);
        return userModel;
    }

    /*AJAX请求
     * POST 方法
     * 数据：application/x-www-form-urlencoded; charset=UTF-8
     * */
    @RequestMapping(value = "/user_ajax_three", method = RequestMethod.POST)
    public @ResponseBody
    UserModel user_ajax_three(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
        MyBeanImp myBeanImp = (MyBeanImp) applicationContext.getBean("myBeanImp");
        UserModel userModel = myBeanImp.getList().get(0);
        userModel.setUserName(name);
        userModel.setUserPassword(pwd);
        return userModel;
    }

    /*AJAX请求
     * POST 方法
     * 数据：application/json
     * */
    @RequestMapping(value = "/user_ajax_four", method = RequestMethod.POST)
    public @ResponseBody
    UserModel user_ajax_four(@RequestBody UserModel userModel) {
        return userModel;
    }

    /*
     * Form表单提交
     * GET 方法
     * */
    @RequestMapping(value = "/user_form", method = RequestMethod.GET)
    public String user_form_get(
            @RequestParam("userName") String userName,
            @RequestParam("userPassword") String userPassword,
            @RequestParam("userSex") String userSex,
            @RequestParam("userHome") String userHome,
            @RequestParam("userInfo") String userInfo,
            @RequestParam("userEmail") String userEmail,
            Model model
    ) {
        UserModel userModel = (UserModel) applicationContext.getBean("userModel1");
        userModel.setUserName(userName + "_get");
        userModel.setUserPassword(userPassword + "_get");
        userModel.setUserSex(userSex + "_get");
        userModel.setUserHome(userHome + "_get");
        userModel.setUserInfo(userInfo + "_get");
        userModel.setUserEmail(userEmail + "_get");
        model.addAttribute("user",userModel);
        return page;
    }

    /*
     * Form表单提交
     * POST 方法
     * */
    @RequestMapping(value = "/user_form", method = RequestMethod.POST)
    public String user_form_post(
            @RequestParam("userName") String userName,
            @RequestParam("userPassword") String userPassword,
            @RequestParam("userSex") String userSex,
            @RequestParam("userHome") String userHome,
            @RequestParam("userInfo") String userInfo,
            @RequestParam("userEmail") String userEmail,
            Model model
    ) {
        UserModel userModel = (UserModel) applicationContext.getBean("userModel1");
        userModel.setUserName(userName + "_post");
        model.addAttribute("user",userModel);
        return page;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        System.out.println("setApplicationContext has been called at line 97 of UserController.java");
        applicationContext = ac;
    }
}
