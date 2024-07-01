package com.qing.design_pattern.structural.adapter;

import cn.hutool.core.util.StrUtil;

public class Zh_JpTranslator implements Translator {
    @Override
    public String translate(String subtitle) {
        if (!StrUtil.isBlankIfStr(subtitle)){
            return "こんにちは、私はハゲ男です";
        }
        return "何を言ったか分かりません";
    }
}
