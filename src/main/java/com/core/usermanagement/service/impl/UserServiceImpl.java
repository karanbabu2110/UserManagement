package com.core.usermanagement.service.impl;

import com.core.usermanagement.model.Profile;
import com.core.usermanagement.model.User;
import com.core.usermanagement.repository.UserRepository;
import com.core.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public User registerUser(User user) {
        // Encrypt password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User updateProfile(Long userId, Profile profile) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.getProfile().setFirstName(profile.getFirstName());
            user.getProfile().setLastName(profile.getLastName());
            user.getProfile().setPhoneNumber(profile.getPhoneNumber());
            user.getProfile().setLocation(profile.getLocation());
            return userRepository.save(user);
        }
        return null;
    }

    // Implement other methods as needed
}
