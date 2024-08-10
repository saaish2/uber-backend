package com.saaish.project.uber.uberApp.stratagies;

import com.saaish.project.uber.uberApp.dto.RideRequestDto;
import com.saaish.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
