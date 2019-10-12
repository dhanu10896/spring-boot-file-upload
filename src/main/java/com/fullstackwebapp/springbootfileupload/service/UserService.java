package com.fullstackwebapp.springbootfileupload.service;

import com.fullstackwebapp.springbootfileupload.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}