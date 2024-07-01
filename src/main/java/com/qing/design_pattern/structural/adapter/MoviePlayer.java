package com.qing.design_pattern.structural.adapter;

 public class  MoviePlayer implements Player{
    public String play(String movieName){
        System.out.println("正经播放器 正在播放");
        return movieName+",你好 我是光头强";
    }
}
