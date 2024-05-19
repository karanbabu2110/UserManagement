package com.core.usermanagement.controller;

import com.core.usermanagement.model.Profile;
import com.core.usermanagement.model.User;
import com.core.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PutMapping("/updateProfile/{userId}")
    public User updateProfile(@PathVariable Long userId, @RequestBody Profile profile) {
        return userService.updateProfile(userId, profile);
    }

    // Add more endpoints for password reset, profile retrieval, etc.
}
