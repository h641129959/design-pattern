package com.promotion.strategy;

import com.promotion.context.Context;
import com.promotion.strategy.ConreteStrategyA;

/**
 * Created by huangWei on 2020/2/23.
 */
public class StrategyTest {

    public static void main(String[] args) {
        Context context = new Context(new ConreteStrategyA());
        context.contextInterface();
    }
}
