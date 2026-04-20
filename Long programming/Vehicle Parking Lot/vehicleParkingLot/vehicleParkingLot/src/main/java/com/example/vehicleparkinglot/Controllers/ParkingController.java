package com.example.vehicleparkinglot.Controllers;


import com.example.vehicleparkinglot.Models.Slot;
import com.example.vehicleparkinglot.Models.User;
import com.example.vehicleparkinglot.Service.ParkingLotServices;
import com.example.vehicleparkinglot.Service.UserServices;
import com.example.vehicleparkinglot.Service.VehicleServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
  @RequestMapping("/api")
public class ParkingController {
  @Autowired
  ParkingLotServices plot;

  @RequestMapping("/create")
   public  String createSlots(){
     return  plot.createSlotsBro();
   }
    @Autowired
        VehicleServices vs;
    @Autowired
        ParkingLotServices ps;

    @GetMapping("/AvailableSlots")
    public List<Slot> GetAvailableSlots(){
        return ps.FindAvailableSlots();
    }
    @GetMapping("/slots")
    public List<Slot> GetSlots(){
        return ps.findSlots();
    }
    @Autowired
    UserServices use;
    @PostMapping("/PakVehicle/{slot_id}")
    public void parkvehicle(@RequestBody User user,@PathVariable int slot_id){
        use.Parkvehicle(user,slot_id);
    }
    @DeleteMapping("/RemoveVehicle/{slot_id}")
        public void removeVehicle(@PathVariable int slot_id){
            ps.removeVehicle(slot_id);
        }

    public ParkingController() {
    }
}
