package com.example.test.service;

import com.example.test.TestApplicationTests;
import org.junit.Test;

import javax.annotation.Resource;


import static org.junit.Assert.assertEquals;

public class UserServiceTest extends TestApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void getUsernameTest() {
        Long id = 1L;
        assertEquals(userService.getUserName(id), "Sora.Liu");
    }
}
