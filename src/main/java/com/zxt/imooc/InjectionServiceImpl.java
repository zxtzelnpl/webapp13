package com.zxt.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService{

//    @Autowired
    private InjectionDao injectionDao;

    @Autowired
    public InjectionServiceImpl(InjectionDao injectionDao){
        this.injectionDao = injectionDao;
    }

//    @Autowired
//    public void setInjectionDao(InjectionDao injectionDao){
//        this.injectionDao = injectionDao;
//    }

    public void save(String arg){
        //模拟业务操作
        System.out.println("Service接受参数:"+arg);
        arg=arg+":"+this.hashCode();
        injectionDao.save(arg);
    }
}
