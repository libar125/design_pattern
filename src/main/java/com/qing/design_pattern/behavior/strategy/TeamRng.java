package com.qing.design_pattern.behavior.strategy;

public class TeamRng {

    //抽取游戏策略算法，并进行引用
    private RngStrategy rngStrategy;

    public void setRngStrategy(RngStrategy rngStrategy) {
        this.rngStrategy = rngStrategy;
    }

    public void startGame(){
        System.out.println("游戏开始.....");
        //游戏策略
        rngStrategy.warStrategy();
        System.out.println("win......");
    }

}
