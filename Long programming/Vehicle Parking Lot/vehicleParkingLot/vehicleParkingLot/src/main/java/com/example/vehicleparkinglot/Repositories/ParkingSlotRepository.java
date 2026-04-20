package com.example.vehicleparkinglot.Repositories;

import com.example.vehicleparkinglot.Models.Slot;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingSlotRepository extends JpaRepository<Slot,Integer> {
    @Query("SELECT u FROM Slot u WHERE u.status = 'Available'")
    List<Slot> findAvailableSlots();
    @Modifying
    @Transactional
    @Query("UPDATE Slot s SET s.status = 'Booked', s.vehicle_id = :vehicle_id WHERE s.slot_id = :slot_id")
    void parkVehicle(@Param("vehicle_id") String vehicle_id, @Param("slot_id") int slot_id);
    @Modifying
    @Transactional
    @Query("UPDATE Slot s SET s.status = 'Available', s.vehicle_id = 'null' WHERE s.slot_id = :slot_id")
    void RemoveSlot(@Param("slot_id") int slot_id);
    @Modifying
    @Transactional
    @Query("insert into Slot (slot_id,status,vehicle_id) values (:slot_id,:status,:vehicle_id)")
    void CreateSlot(@Param("slot_id") int slot_id,@Param("status") String status,@Param("vehicle_id") String vehicle_id);

}
