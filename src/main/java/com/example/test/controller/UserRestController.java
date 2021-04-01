package com.example.test.controller;

import com.example.test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Resource
    private UserService userService;

    @GetMapping("{id}")
    public String getUsername(@PathVariable Long id) {
        return userService.getUserName(id);
    }
}
