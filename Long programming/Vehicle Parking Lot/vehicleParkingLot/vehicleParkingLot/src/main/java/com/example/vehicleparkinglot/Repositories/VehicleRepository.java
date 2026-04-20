package com.example.vehicleparkinglot.Repositories;

import com.example.vehicleparkinglot.Models.Vehicle;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    @Modifying
    @Transactional
    @Query("delete from Vehicle v where v.Slot_id=:slot_id")
    void deleteVehicle(@Param("slot_id") int slot_id);

}
