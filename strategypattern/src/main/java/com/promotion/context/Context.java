package com.promotion.context;


import com.promotion.strategy.Strategy;

/**
 * Created by huangWei on 2020/2/23.
 */
public class Context {

    Strategy strategy;

    public Context (Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
