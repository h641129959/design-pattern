package com.promotion.strategy;

import com.promotion.context.CashContext;

public class CashStrategyTest {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext("NORMAL");
        cashContext.getResult(1);
    }

}
