package com.ssafy.gumichelin.model.service;

import com.ssafy.gumichelin.model.mapper.UserMapper;
import com.ssafy.gumichelin.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // Singleton으로 생성
    private static UserServiceImpl instance =  new UserServiceImpl();

    private UserServiceImpl() {}

    public static UserServiceImpl getInstance() {
        return instance;
    }

    @Autowired
    private UserMapper userMapper;

    @Override
    public void join(User user) {
        userMapper.insert(user);
    }

    @Override
    public User login(String studentId, String pass) {
        User user = userMapper.select(studentId);
        if(user!=null && user.getPass().equals(pass)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public boolean isUsedId(String studentId) {
        return userMapper.select(studentId)!=null;
    }

    @Override
    public User selectUser(String studentId) {
        User user = userMapper.select(studentId);

        if(user!=null) {
            return user;
        } else {
            return null;
        }
    }
}
