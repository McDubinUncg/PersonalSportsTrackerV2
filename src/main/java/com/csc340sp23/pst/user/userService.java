package com.csc340sp23.pst.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userRepository repo;

    void saveUser(User user) {
        repo.saveUser(user);
    }
}
