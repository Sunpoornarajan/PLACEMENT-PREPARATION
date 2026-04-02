package com.example.vehicleparkinglot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Vehicle {
    @Id
    String vehicle_id;

    int user_id;
    String Model;
    String Type;
    int Slot_id;

    @Override
    public String toString() {
        return "Vehicle{" +
                "user_id=" + user_id +
                ", vehicle_id='" + vehicle_id + '\'' +
                ", Model='" + Model + '\'' +
                ", Type='" + Type + '\'' +
                ", Slot_id=" + Slot_id +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getSlot_id() {
        return Slot_id;
    }

    public void setSlot_id(int slot_id) {
        Slot_id = slot_id;
    }

    public Vehicle( String vehicle_id,int user_id, String model, String type, int slot_id) {
        this.user_id = user_id;
        this.vehicle_id = vehicle_id;
        Model = model;
        Type = type;
        Slot_id = slot_id;
    }

    public Vehicle() {

    }
}
