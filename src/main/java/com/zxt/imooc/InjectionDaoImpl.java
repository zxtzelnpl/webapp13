package com.zxt.imooc;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDaoImpl implements InjectionDao {

    public void save(String arg){
        //模拟数据库保存操作
        System.out.println("保存数据："+arg);
    }
}
