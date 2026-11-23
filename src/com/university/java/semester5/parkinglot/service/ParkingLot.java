package com.university.java.semester5.parkinglot.service;


import com.university.java.semester5.parkinglot.model.ParkingSpot;
import com.university.java.semester5.parkinglot.model.SpotType;
import com.university.java.semester5.parkinglot.model.Ticket;
import com.university.java.semester5.parkinglot.model.VehicleType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private final List<ParkingFloor> floors;
    private final Map<String, Ticket> activeTickets;
    private final Map<VehicleType, Long> hourlyRates;

    public ParkingLot(List<ParkingFloor> floors, Map<VehicleType, Long> hourlyRates) {
        this.floors = floors;
        this.hourlyRates = hourlyRates;
        this.activeTickets = new HashMap<>();
    }

    public Ticket enter(VehicleType vehicleType) {
        SpotType requiredSpotType = mapVehicleTypeToSpotType(vehicleType);

        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.findAvailableSpot(requiredSpotType);
            if (spot != null) {
                floor.occupy(spot.getId());

                String ticketId = UUID.randomUUID().toString();
                long entryTime = System.currentTimeMillis();
                Ticket ticket = new Ticket(ticketId, floor.getFloorNumber(), spot.getId(), vehicleType, entryTime);

                activeTickets.put(ticketId, ticket);
                return ticket;
            }
        }
        throw new RuntimeException("No available spots for vehicle type " + vehicleType);
    }

    public long exit(String ticketId) {
        if (ticketId == null || ticketId.isEmpty()) {
            throw new RuntimeException("Invalid ticket ID");
        }

        Ticket ticket = activeTickets.get(ticketId);
        if (ticket == null) {
            throw new RuntimeException("Ticket not found or already used");
        }

        long exitTime = System.currentTimeMillis();
        long fee = computeFee(ticket.getEntryTime(), exitTime, ticket.getVehicleType());

        for (ParkingFloor floor : floors) {
            if (floor.getFloorNumber() == ticket.getFloorNumber()) {
                floor.release(ticket.getSpotId());
            }
        }
        activeTickets.remove(ticketId);

        return fee;
    }

    public int getAvailableSpotCount(SpotType spotType) {
        int total = 0;
        for (ParkingFloor floor : floors) {
            total += floor.getAvailableSpotCount(spotType);
        }
        return total;
    }

    private SpotType mapVehicleTypeToSpotType(VehicleType vehicleType) {
        if (vehicleType == VehicleType.MOTORCYCLE) return SpotType.MOTORCYCLE;
        if (vehicleType == VehicleType.CAR) return SpotType.CAR;
        if (vehicleType == VehicleType.LARGE) return SpotType.LARGE;
        throw new RuntimeException("Unknown vehicle type");
    }

    private long computeFee(long entryTime, long exitTime, VehicleType vehicleType) {
        long millisPerHour = 1000L * 60 * 60;
        long durationMillis = exitTime - entryTime;
        long durationHours = durationMillis / millisPerHour;

        if (durationMillis % millisPerHour > 0) {
            durationHours++;
        }

        return durationHours * hourlyRates.get(vehicleType);
    }
}
