package com.zxt.imooc.two;

public class InjectionServiceImplForConstructor implements InjectionService {
    private InjectionDao injectionDao;

    // 构造器注入
    public InjectionServiceImplForConstructor(InjectionDao injectionDao){
        this.injectionDao = injectionDao;
    }

    public void save(String arg){
        //模拟业务操作
        System.out.println("Service接受参数:"+arg);
        arg=arg+":"+this.hashCode();
        injectionDao.save(arg);
    }
}
