package com.qing.design_pattern.behavior.strategy;

public class MainTest {
    public static void main(String[] args) {
        TeamRng teamRng = new TeamRng();
        teamRng.setRngStrategy(new KeepDogStrategy());
        teamRng.startGame();
    }
}
