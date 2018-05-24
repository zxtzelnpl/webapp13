package com.zxt.trade;

import org.apache.ibatis.annotations.Insert;

public interface TradeDao {
    @Insert("insert into test_user_trade " +
            "(tradeFrom,tradeTo,tradeDate,tradeMoney) " +
            "VALUES " +
            "(#{tradeFrom},#{tradeTo},NOW(),#{tradeMoney})"
    )
    void insertOneTrade(TradeModel trade);
}
