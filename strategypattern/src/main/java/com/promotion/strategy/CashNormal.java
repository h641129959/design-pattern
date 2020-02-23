package com.promotion.strategy;

/**
 * Created by huangWei on 2020/2/23.
 */
public class CashNormal extends CashStrategy {

    @Override
    public double getResult(double money) {
        System.out.println("普通算法");
        return 0;
    }
}
