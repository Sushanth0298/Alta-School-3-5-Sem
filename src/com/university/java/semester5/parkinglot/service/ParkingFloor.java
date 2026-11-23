package com.university.java.semester5.parkinglot.service;



import com.university.java.semester5.parkinglot.model.ParkingSpot;
import com.university.java.semester5.parkinglot.model.SpotType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParkingFloor {
    private final int floorNumber;
    private final List<ParkingSpot> spots;
    private final Set<String> occupiedSpotIds;

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
        this.occupiedSpotIds = new HashSet<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getAvailableSpotCount(SpotType spotType) {
        int count = 0;
        for (ParkingSpot spot : spots) {
            if (spot.getSpotType() == spotType && !occupiedSpotIds.contains(spot.getId())) {
                count++;
            }
        }
        return count;
    }

    public ParkingSpot findAvailableSpot(SpotType spotType) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotType() == spotType && !occupiedSpotIds.contains(spot.getId())) {
                return spot;
            }
        }
        return null;
    }

    public void occupy(String spotId) {
        occupiedSpotIds.add(spotId);
    }

    public void release(String spotId) {
        occupiedSpotIds.remove(spotId);
    }
}
