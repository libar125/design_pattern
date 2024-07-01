package com.qing.design_pattern.structural.adapter.obj;

import com.qing.design_pattern.structural.adapter.MoviePlayer;
import com.qing.design_pattern.structural.adapter.Player;
import com.qing.design_pattern.structural.adapter.Zh_JpTranslator;
import com.qing.design_pattern.structural.adapter.clazz.MovieAdapter;

public class MainTest {
    public static void main(String[] args) {
        MovieAdapter movieAdapter = new MovieAdapter(new MoviePlayer(),new Zh_JpTranslator());
        String content1 = movieAdapter.play("喜洋洋与灰太狼");
        System.out.println(content1);
    }
}
