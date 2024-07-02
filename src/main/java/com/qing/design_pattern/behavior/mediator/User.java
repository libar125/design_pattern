package com.qing.design_pattern.behavior.mediator;

public abstract class User {
    protected String name;
    protected ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    abstract void receive(String message);
}
