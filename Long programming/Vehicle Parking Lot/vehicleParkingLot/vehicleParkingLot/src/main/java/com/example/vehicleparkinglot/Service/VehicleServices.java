package com.example.vehicleparkinglot.Service;

import com.example.vehicleparkinglot.Models.Slot;
import com.example.vehicleparkinglot.Models.Vehicle;
import com.example.vehicleparkinglot.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices {
    @Autowired
    VehicleRepository repo;

    public VehicleServices() {

    }

    public void AddDetails(String vehicle_id, int user_id, String model, String type, int slot_id) {
        Vehicle vehi=new Vehicle(vehicle_id,user_id,model,type,slot_id);
          repo.save(vehi);
    }

    public void removeVehicle(int slot_id) {
        repo.deleteVehicle(slot_id);
    }
}
