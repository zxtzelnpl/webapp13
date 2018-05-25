package com.zxt.trade;

import com.zxt.user.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service("tradeService")
public class TradeService {
    @Resource
    private TradeDao tradeDao;
    @Resource
    private UserDao userDao;

    public void addTrade(TradeModel tradeModel){

        int from = tradeModel.getTradeFrom();
        int to = tradeModel.getTradeTo();
        BigDecimal money = tradeModel.getTradeMoney();

        this.userDao.addMoney(money,from);
        this.userDao.reduceMoney(money,to);
        this.tradeDao.insertOneTrade(tradeModel);
    }
}
