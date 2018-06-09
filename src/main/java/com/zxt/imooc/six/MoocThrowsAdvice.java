package com.zxt.imooc.six;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

public class MoocThrowsAdvice implements ThrowsAdvice{
    public void afterThrowing(RemoteException ex) throws Throwable{
        System.out.println("MoocThrowsAdvice afterThrowing 1");
    }

    public void afterThrowing(Method method, Object[] args, Object target, RemoteException ex) throws Throwable{
        System.out.println("MoocThrowsAdvice afterThrowing 2:" + method.getName()+ "      "+ target.getClass().getName());
    }
}
