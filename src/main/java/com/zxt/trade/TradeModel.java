package com.zxt.trade;

import java.io.Serializable;
import java.math.BigDecimal;

public class TradeModel implements Serializable{

    private int tradeId;
    private int tradeFrom;
    private int tradeTo;
    private int tradeDate;
    private BigDecimal tradeMoney;

    public int getTradeId() {
        return tradeId;
    }

    public int getTradeFrom() {
        return tradeFrom;
    }

    public int getTradeTo() {
        return tradeTo;
    }

    public int getTradeDate() {
        return tradeDate;
    }

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeId(int tradeId) {
        this.tradeId = tradeId;
    }

    public void setTradeFrom(int tradeFrom) {
        this.tradeFrom = tradeFrom;
    }

    public void setTradeTo(int tradeTo) {
        this.tradeTo = tradeTo;
    }

    public void setTradeDate(int tradeDate) {
        this.tradeDate = tradeDate;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
    }
}
