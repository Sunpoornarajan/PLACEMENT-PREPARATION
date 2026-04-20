package com.example.blooddonar.controller;

import com.example.blooddonar.entity.Donar;
import com.example.blooddonar.service.DonarService;
import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/api/Donars")
public class DonarController  {
    @Autowired
    private DonarService service;
    @PostMapping
    public Donar addDonar(@RequestBody Donar d){
        return service.CreateDonar(d);
    }
    @GetMapping
    public List<Donar> getDonars(){
        return service.getallDonars();
    }
    @PutMapping("/{id}")
    public Donar updateDonar(@PathVariable int id,@RequestBody Donar d) {
        return service.updateDonar(id,d);
    }
    @DeleteMapping("/{id}")
    public String deleteDonar(@PathVariable int id){
        return service.removeDonar(id);
    }
    @GetMapping("/{id}")
    public Donar getDonarByid(@PathVariable int id) {
        return service.getByid(id);
    }
}