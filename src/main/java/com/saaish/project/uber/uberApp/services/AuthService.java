package com.saaish.project.uber.uberApp.services;

import com.saaish.project.uber.uberApp.dto.DriverDto;
import com.saaish.project.uber.uberApp.dto.SignUpDto;
import com.saaish.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String username, String password);

    UserDto signup(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);
}
