package com.qing.design_pattern.structural.decorator;

public class HandsomeBoyDecorator implements LiveStreamDecorator{

    private LiveStream liveStream;

    public HandsomeBoyDecorator(LiveStream liveStream) {
        this.liveStream = liveStream;
    }


    @Override
    public void enableBeauty() {
        System.out.println("吴彦祖美颜模板");
    }

    @Override
    public void enableFilter() {
        System.out.println("古风滤镜");
    }

    @Override
    public void enableBuffing() {
        System.out.println("去黑头磨皮");
    }

    @Override
    public void tiktok() {
        enableBeauty();

        enableFilter();

        enableBuffing();

        liveStream.tiktok();
    }
}
