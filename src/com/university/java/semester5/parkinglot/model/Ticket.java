package com.university.java.semester5.parkinglot.model;

public class Ticket {
    private final String id;
    private final int floorNumber;
    private final String spotId;
    private final VehicleType vehicleType;
    private final long entryTime;

    public Ticket(String id, int floorNumber, String spotId, VehicleType vehicleType, long entryTime) {
        this.id = id;
        this.floorNumber = floorNumber;
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.entryTime = entryTime;
    }

    public String getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public long getEntryTime() {
        return entryTime;
    }
}
