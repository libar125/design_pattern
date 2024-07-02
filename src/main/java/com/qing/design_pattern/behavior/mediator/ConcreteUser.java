package com.qing.design_pattern.behavior.mediator;

public class ConcreteUser extends User {

    public ConcreteUser(String name, ChatRoom chatRoom) {
        super(name, chatRoom);
    }



    @Override
    void receive(String message) {

    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(message, this);
    }

}
