package com.zxt.imooc.five;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {

    public void before(){
        System.out.println("Mooc aspect before");
    }

    public void after(){
        System.out.println("Mooc aspect after");
    }

    public void afterReturning(){
        System.out.println("Mooc aspect afterReturning");
    }

    public void afterThrowing(){
        System.out.println("Mooc aspect afterThrowing");
    }

    public Object around(ProceedingJoinPoint pjp){
        Object obj = null;
        try{
            System.out.println("MoocAspect around 1");
            obj = pjp.proceed();
            System.out.println("MoocAspect around 2");
        }catch(Throwable e){
            e.printStackTrace();
        }
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times){
        System.out.println(bizName+" "+times);
        Object obj = null;
        try{
            System.out.println("MoocAspect aroundInit 1");
            obj = pjp.proceed();
            System.out.println("MoocAspect aroundInit 2");
        }catch(Throwable e){
            e.printStackTrace();
        }
        return obj;
    }
}
