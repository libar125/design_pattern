package com.qing.design_pattern.behavior.state;

public class VideoContext {

    /**
     * 当前的状态
     */
    private VideoState videoState;

    public final static PlayState PLAY_STATE = new PlayState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static StopState STOP_STATE = new StopState();

    public VideoState getvideoState() {
        return videoState;
    }

    /**
     * 将传入的 videoState , 赋值给当前的 videoState videoState 成员
     *      除此之外 , 还要设置 videoState 的上下文 , 即该类本身
     *      将当前的环境 videoContext , 通知到各个状态实现类
     * @param videoState
     */
    public void setvideoState(VideoState videoState) {
        this.videoState = videoState;
        this.videoState.setVedioContext(this);
    }

    public void play() {
        this.videoState.play();
    }

    public void pause() {
        this.videoState.pause();
    }

    public void speed() {
        this.videoState.speed();
    }

    public void stop() {
        this.videoState.stop();
    }
}
