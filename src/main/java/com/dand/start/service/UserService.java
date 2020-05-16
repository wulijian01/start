package com.dand.start.service;

import com.dand.start.dao.UserDao;
import com.dand.start.entity.User;
import com.dand.start.vo.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(String name) {
        User user1 =  userDao.findByUserName(name);
        return user1;
    }

}
