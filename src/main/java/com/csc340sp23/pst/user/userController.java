package com.csc340sp23.pst.user;

import com.login.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService service;

    @PostMapping("/create")
    public String createUser(User user) {
        service.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/new-user")
    public String newUserForm(Model model) {
        return "user/new-user";
    }
}
