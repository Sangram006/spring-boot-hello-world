package com.lets.koder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lets.koder.controller.UserController;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class UserServiceApplicationTests {

    @Autowired
    private UserController helloWorldController;

    @Test
    void contextLoads() {
        // to ensure that controller is getting created inside the application context
        assertNotNull(helloWorldController);
    }

}
