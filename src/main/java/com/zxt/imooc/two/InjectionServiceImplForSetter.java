package com.zxt.imooc.two;


public class InjectionServiceImplForSetter implements InjectionService{

    private InjectionDao injectionDao;

    public InjectionServiceImplForSetter(){
    }

    // 设值注入
    public void setInjectionDao(InjectionDao injectionDao){
        this.injectionDao = injectionDao;
    }


    public void save(String arg){
        //模拟业务操作
        System.out.println("Service接受参数:"+arg);
        arg=arg+":"+this.hashCode();
        injectionDao.save(arg);
    }
}
