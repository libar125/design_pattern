package com.qing.design_pattern.structural.decorator;

public interface LiveStreamDecorator extends LiveStream{

    void enableBeauty();

    void enableFilter();

    void enableBuffing();
}
