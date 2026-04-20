package com.example.blooddonar.service;

import com.example.blooddonar.entity.Donar;
import com.example.blooddonar.repository.DonarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static tools.jackson.databind.util.ClassUtil.name;

@Service
public class DonarService {

    @Autowired
    private DonarRepository repository;

    public List<Donar> getallDonars(){

        return repository.findAll();
    }

    public Donar updateDonar(int id, Donar d){
        Donar existing = repository.findById(id).orElse(null);

        if(existing != null){
            existing.setDonarname(d.getDonarname());
            existing.setAge(d.getAge());
            existing.setMobile_no(d.getMobile_no());
            existing.setWeight(d.getWeight());
            existing.setBloodgroup(d.getBloodgroup());
        }
        else{
            return null;
        }

        repository.save(existing);
        return existing;
    }

    public Donar CreateDonar(Donar d){
        return repository.save(d);
    }

    public String removeDonar(int id){
        repository.deleteById(id);
        return "Donar removed";
    }

    public Donar getByid(int id){
        return repository.findById(id).orElse(null);
    }
}