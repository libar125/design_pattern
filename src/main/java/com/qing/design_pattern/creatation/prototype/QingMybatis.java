package com.qing.design_pattern.creatation.prototype;

import cn.hutool.core.util.ObjectUtil;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

public class QingMybatis {

    private  Cache<String, Object> cache = Caffeine.newBuilder()
            .maximumSize(10_000)
            .expireAfterWrite(5, TimeUnit.MINUTES)
            .build();

    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        if(ObjectUtil.isNull(cache.getIfPresent(username))){
            user = getUserFromDb(username);
            System.out.println("从数据库查到："+username);
        }else {
            //从缓存中直接拿，脏缓存问题
            //原型已经拿到，但是不能直接给。（本人）
            user = (User) cache.getIfPresent(username);
            System.out.println("从缓存中拿到的是："+user);
            user = (User) user.clone();
        }
        return user;
    }


    private User  getUserFromDb(String username) throws CloneNotSupportedException {
        User user = new User();
        user.setAge(1);
        user.setName(username);
        //在缓存中存入克隆对象
        cache.put(username,user.clone());
        return user;
    }
}
