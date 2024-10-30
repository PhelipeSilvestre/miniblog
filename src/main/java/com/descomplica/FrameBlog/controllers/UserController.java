package com.descomplica.FrameBlog.controllers;

import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    private @ResponseBody User save(@RequestBody User user) {
        return userService.save(user);

    }

}
