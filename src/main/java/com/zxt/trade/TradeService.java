package com.zxt.trade;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("tradeService")
public class TradeService {
    @Resource
    private TradeDao tradeDao;

    public void addTrade(TradeModel trade){
        this.tradeDao.insertOneTrade(trade);
    }
}
