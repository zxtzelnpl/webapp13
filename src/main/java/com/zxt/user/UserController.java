package com.zxt.user;


import com.zxt.mybean.MyBeanImp;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping("/user_one")
    public String user_one(Model model,HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        ApplicationContext context1 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        MyBeanImp myBeanImp = (MyBeanImp) context1.getBean("myBeanImp");
        myBeanImp.sayName();
        model.addAttribute("user",myBeanImp.getList().get(0));
        return "user_one";
    }
}
