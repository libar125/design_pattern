package com.qing.design_pattern.behavior.state;

public abstract class VideoState {

    /**
     * 视频播放上下文
     *      声明为 protected , 子类可以拿到该成员变量
     */
    protected VideoContext videoContext;

    public void setVedioContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    /**
     * 播放
     *      对应播放状态
     */
    public abstract void play();

    /**
     * 停止
     *      对应停止状态
     */
    public abstract void pause();

    /**
     * 快进
     *      对应快进状态
     */
    public abstract void speed();

    /**
     * 停止
     *      对应停止状态
     */
    public abstract void stop();
}
