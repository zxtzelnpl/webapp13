package com.zxt.trade;

import com.zxt.user.UserDao;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Transactional
@Service("tradeService")
public class TradeService {
    @Resource
    private TradeDao tradeDao;
    @Resource
    private UserDao userDao;
    @Resource
    private DataSourceTransactionManager transactionManager;

    public void addTrade(TradeModel tradeModel) throws Exception
    {


        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        try{
            int from = tradeModel.getTradeFrom();
            int to = tradeModel.getTradeTo();
            BigDecimal money = tradeModel.getTradeMoney();

            this.userDao.addMoney(money,to);
            this.userDao.reduceMoney(money,from);
            this.tradeDao.insertOneTrade(tradeModel);
            if(to == 12){
                throw new Exception("d");
            }
            transactionManager.commit(status);
        }
        catch(Exception e){
            e.printStackTrace();
            transactionManager.rollback(status);
            throw e;
        }


        System.out.println("transactionManager:"+transactionManager.hashCode());
    }

}
