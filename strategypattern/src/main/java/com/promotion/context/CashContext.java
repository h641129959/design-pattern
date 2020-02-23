package com.promotion.context;

import com.promotion.strategy.CashNormal;
import com.promotion.strategy.CashRate;
import com.promotion.strategy.CashStrategy;

/**
 * Created by huangWei on 2020/2/23.
 */
public class CashContext {

    CashStrategy cashStrategy;

    public CashContext(String cashStrategy) {
        switch (cashStrategy) {
            case "NORMAL":
                this.cashStrategy = new CashNormal();
                break;
            case "RATE":
                this.cashStrategy = new CashRate();
                break;
            default:
        }
    }

    public double getResult(double money) {
        return cashStrategy.getResult(money);
    }
}
