package com.core.usermanagement.service;

import com.core.usermanagement.model.Profile;
import com.core.usermanagement.model.User;

public interface UserService {
    User registerUser(User user);
    User updateProfile(Long userId, Profile profile);
    // Add more methods for password reset, profile retrieval, etc.
}
