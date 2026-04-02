package com.example.vehicleparkinglot.Models;

import org.springframework.stereotype.Component;

@Component
public class User {
    int user_id;
    String name;
    String vehicle_id;
    String model;
    String type;
    int contact_no;
   public User(){

   }
    public User(int user_id, String name, String vehicle_id, String model, String type, int contact_no) {
        this.user_id = user_id;
        this.name = name;
        this.vehicle_id = vehicle_id;
        this.model = model;
        this.type = type;
        this.contact_no = contact_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }
}
