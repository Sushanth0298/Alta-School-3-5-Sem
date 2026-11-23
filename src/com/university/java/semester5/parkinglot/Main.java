package com.university.java.semester5.parkinglot;



import com.university.java.semester5.parkinglot.model.ParkingSpot;
import com.university.java.semester5.parkinglot.model.SpotType;
import com.university.java.semester5.parkinglot.model.Ticket;
import com.university.java.semester5.parkinglot.model.VehicleType;
import com.university.java.semester5.parkinglot.service.ParkingFloor;
import com.university.java.semester5.parkinglot.service.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Floor 1: 1 motorcycle, 1 car, 1 large | Floor 2: 1 motorcycle, 2 car
        List<ParkingSpot> floor1Spots = new ArrayList<>();
        floor1Spots.add(new ParkingSpot("F1-M1", SpotType.MOTORCYCLE));
        floor1Spots.add(new ParkingSpot("F1-C1", SpotType.CAR));
        floor1Spots.add(new ParkingSpot("F1-L1", SpotType.LARGE));

        List<ParkingSpot> floor2Spots = new ArrayList<>();
        floor2Spots.add(new ParkingSpot("F2-M1", SpotType.MOTORCYCLE));
        floor2Spots.add(new ParkingSpot("F2-C1", SpotType.CAR));
        floor2Spots.add(new ParkingSpot("F2-C2", SpotType.CAR));

        List<ParkingFloor> floors = new ArrayList<>();
        floors.add(new ParkingFloor(1, floor1Spots));
        floors.add(new ParkingFloor(2, floor2Spots));

        // Rates in cents per hour (2000 cents = 20.00)
        Map<VehicleType, Long> rates = new HashMap<>();
        rates.put(VehicleType.MOTORCYCLE, 1000L);
        rates.put(VehicleType.CAR, 2000L);
        rates.put(VehicleType.LARGE, 4000L);

        ParkingLot lot = new ParkingLot(floors, rates);

        System.out.println("=== 1. Cars enter ===");
        Ticket car1 = lot.enter(VehicleType.CAR);
        Ticket car2 = lot.enter(VehicleType.CAR);
        Ticket car3 = lot.enter(VehicleType.CAR);
        printTicket(car1);
        printTicket(car2);
        printTicket(car3);
        System.out.println("Free CAR spots: " + lot.getAvailableSpotCount(SpotType.CAR));

        System.out.println("\n=== 2. Fourth car is rejected ===");
        try {
            lot.enter(VehicleType.CAR);
        } catch (RuntimeException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        System.out.println("\n=== 3. Large vehicle enters ===");
        Ticket truck = lot.enter(VehicleType.LARGE);
        printTicket(truck);

        Thread.sleep(100); // simulate some parking time (rounds up to 1 hour)

        System.out.println("\n=== 4. Car exits and pays ===");
        long fee = lot.exit(car1.getId());
        System.out.println("Fee for car: " + fee + " cents");
        System.out.println("Free CAR spots: " + lot.getAvailableSpotCount(SpotType.CAR));

        System.out.println("\n=== 5. Truck exits and pays ===");
        System.out.println("Fee for truck: " + lot.exit(truck.getId()) + " cents");

        System.out.println("\n=== 6. Using the same ticket again ===");
        try {
            lot.exit(car1.getId());
        } catch (RuntimeException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        System.out.println("\n=== 7. Empty ticket ID ===");
        try {
            lot.exit("");
        } catch (RuntimeException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        System.out.println("\n=== 8. Freed car spot is reused ===");
        Ticket car4 = lot.enter(VehicleType.CAR);
        printTicket(car4);
    }

    private static void printTicket(Ticket t) {
        System.out.println("Ticket " + t.getId().substring(0, 8) + "... | " + t.getVehicleType()
                + " | floor " + t.getFloorNumber() + " | spot " + t.getSpotId());
    }
}
