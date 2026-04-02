package com.example.vehicleparkinglot.Service;

import com.example.vehicleparkinglot.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

        @Autowired
        VehicleServices vehi;
        @Autowired
        ParkingLotServices park;
    public void Parkvehicle(User user,int slot_id) {
        park.Parkvehicle(user.getVehicle_id(),slot_id);
        vehi.AddDetails(user.getVehicle_id(),user.getUser_id(),user.getModel(),user.getType(),slot_id);
    }
}
