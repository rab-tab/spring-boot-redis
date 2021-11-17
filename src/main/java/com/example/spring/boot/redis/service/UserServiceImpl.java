package com.example.spring.boot.redis.service;

import com.example.spring.boot.redis.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public boolean saveUser(User user) {
        return false;
    }

    @Override
    public List<User> fetchAllUser() {
        return null;
    }

    @Override
    public User fetchUserById(Long id) {
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return false;
    }

    @Override
    public boolean updateUser(Long id, User user) {
        return false;
    }
}
