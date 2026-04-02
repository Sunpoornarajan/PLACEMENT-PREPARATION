package com.example.vehicleparkinglot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Slot {
    @Id
    int slot_id;
    String status;
    String vehicle_id;

    @Override
    public String toString() {
        return "Slot{" +
                "slot_id=" + slot_id +
                ", status='" + status + '\'' +
                ", vehicle_id='" + vehicle_id + '\'' +
                '}';
    }

    public Slot() {
    }

    public Slot(int slot_id, String status, String vehicle_id) {
        this.slot_id = slot_id;
        this.status = status;
        this.vehicle_id = vehicle_id;
    }

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }
}
