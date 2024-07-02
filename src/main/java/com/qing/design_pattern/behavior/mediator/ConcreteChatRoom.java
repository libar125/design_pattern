package com.qing.design_pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatRoom implements ChatRoom {
    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (!u.equals(user)) {
                u.receive(message);
            }
        }
    }
    // 管理用户列表
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

}
