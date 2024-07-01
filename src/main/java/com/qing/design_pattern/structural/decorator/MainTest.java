package com.qing.design_pattern.structural.decorator;

public class MainTest {
    public static void main(String[] args) {
        LiveStreamDecorator liveStreamDecorator = new HandsomeBoyDecorator(new LibarLiveStream());
        liveStreamDecorator.tiktok();
    }
}
