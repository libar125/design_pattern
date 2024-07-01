package com.qing.design_pattern.structural.adapter.clazz;

import com.qing.design_pattern.structural.adapter.MoviePlayer;
import com.qing.design_pattern.structural.adapter.Player;
import com.qing.design_pattern.structural.adapter.Zh_JpTranslator;

public class MainTest {
    public static void main(String[] args) {

//        MoviePlayer moviePlayer = new MoviePlayer();
//        String content = moviePlayer.play("熊出没");
//        System.out.println(content);


        MovieAdapter movieAdapter = new MovieAdapter(new MoviePlayer(),new Zh_JpTranslator());
        String content1 = movieAdapter.play("喜洋洋与灰太狼");
        System.out.println(content1);
    }
}
