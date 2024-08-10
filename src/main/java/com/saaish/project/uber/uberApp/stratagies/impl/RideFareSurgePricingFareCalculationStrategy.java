package com.saaish.project.uber.uberApp.stratagies.impl;

import com.saaish.project.uber.uberApp.dto.RideRequestDto;
import com.saaish.project.uber.uberApp.stratagies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
