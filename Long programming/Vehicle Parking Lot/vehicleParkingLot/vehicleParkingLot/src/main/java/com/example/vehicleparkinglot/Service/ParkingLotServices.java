package com.example.vehicleparkinglot.Service;

import com.example.vehicleparkinglot.Models.Slot;
import com.example.vehicleparkinglot.Repositories.ParkingSlotRepository;
import com.example.vehicleparkinglot.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotServices {
   @Autowired
   ParkingSlotRepository parkingrepo;
    @Autowired
   VehicleServices v;

    public String createSlotsBro() {
        for(int i=1;i<=100;i++){
            parkingrepo.CreateSlot(i,"Available","null");
        }
        return "Slot created";
    }

    public List<Slot> findSlots() {
       return parkingrepo.findAll();
    }
    public void Parkvehicle(String vehicleId,int slot_id) {
        parkingrepo.parkVehicle(vehicleId,slot_id);
    }
       public List<Slot> FindAvailableSlots() {
            return parkingrepo.findAvailableSlots();
        }

        public void removeVehicle(int slot_id) {
             parkingrepo.RemoveSlot(slot_id);
             v.removeVehicle(slot_id);
        }

}


