package com.qing.design_pattern.behavior.state;

public class MainTest {
    public static void main(String[] args) {
            VideoContext videoContext = new VideoContext();
            videoContext.setvideoState(VideoContext.PLAY_STATE);
            System.out.println("当前视频状态 : " + videoContext.getvideoState().getClass().getSimpleName());

            videoContext.pause();
            System.out.println("当前视频状态 : " + videoContext.getvideoState().getClass().getSimpleName());

            videoContext.speed();
            System.out.println("当前视频状态 : " + videoContext.getvideoState().getClass().getSimpleName());

            videoContext.stop();
            System.out.println("当前视频状态 : " + videoContext.getvideoState().getClass().getSimpleName());

            videoContext.speed();
            System.out.println("当前视频状态 : " + videoContext.getvideoState().getClass().getSimpleName());
    }
}
