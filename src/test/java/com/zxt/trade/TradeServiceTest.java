package com.zxt.trade;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;

@RunWith(BlockJUnit4ClassRunner.class)
public class TradeServiceTest extends UnitTestBase{

    private TradeService tradeService;
    private DataSourceTransactionManager transactionManager;

    public TradeServiceTest(){}

    @Test
    public void test(){
        tradeService = super.getBean("tradeService");
        System.out.println(tradeService.hashCode());
        transactionManager = super.getBean("transactionManager");
        System.out.println(transactionManager.hashCode());
    }
}
