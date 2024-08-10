package com.saaish.project.uber.uberApp.services.impl;

import com.saaish.project.uber.uberApp.dto.DriverDto;
import com.saaish.project.uber.uberApp.dto.SignUpDto;
import com.saaish.project.uber.uberApp.dto.UserDto;
import com.saaish.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
