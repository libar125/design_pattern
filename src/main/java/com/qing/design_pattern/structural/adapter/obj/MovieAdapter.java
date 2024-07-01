package com.qing.design_pattern.structural.adapter.obj;

import com.qing.design_pattern.structural.adapter.Player;
import com.qing.design_pattern.structural.adapter.Zh_JpTranslator;

/**
 * 适配器继承被适配对象
 */
class MovieAdapter extends Zh_JpTranslator implements Player{

    private Player target;//被适配对象

    @Override
    public String play(String movieName) {
        target.play(movieName);
        return translate(movieName);
    }

}
