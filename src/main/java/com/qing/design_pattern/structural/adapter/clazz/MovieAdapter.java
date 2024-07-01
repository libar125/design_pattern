package com.qing.design_pattern.structural.adapter.clazz;


import com.qing.design_pattern.structural.adapter.Player;
import com.qing.design_pattern.structural.adapter.Translator;

public class MovieAdapter implements Player {

    //适配者
    private Translator translator;

    //被适配目标对象
    private Player player;//


    public MovieAdapter(Player target,Translator adaptee){
        this.player = target;
        this.translator = adaptee;
    }


    @Override
    public String play(String movieName) {
        player.play(movieName);
        return translator.translate(movieName);
    }
}
