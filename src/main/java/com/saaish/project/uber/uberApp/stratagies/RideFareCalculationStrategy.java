package com.saaish.project.uber.uberApp.stratagies;

import com.saaish.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
