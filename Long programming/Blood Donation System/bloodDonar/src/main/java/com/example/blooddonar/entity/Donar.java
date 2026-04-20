package com.example.blooddonar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
public class Donar{
    @Id
    private Integer id;

    void Donar(Integer id, String donarname, Long mobile_no, Integer age, Float weight, String bloodgroup) {

        this.id = id;
        Donarname = donarname;
        this.mobile_no = mobile_no;
        Age = age;
        Weight = weight;
        Bloodgroup = bloodgroup;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDonarname() {
        return Donarname;
    }

    public void setDonarname(String donarname) {
        Donarname = donarname;
    }

    public Long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(Long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Float getWeight() {
        return Weight;
    }

    public void setWeight(Float weight) {
        Weight = weight;
    }

    public String getBloodgroup() {
        return Bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        Bloodgroup = bloodgroup;
    }

    @Column(name="Donar_name")
    private String Donarname;
    @Column(name="Donar_mobileno")
    private Long mobile_no;
    @Column(name="Donar_Age")
    private Integer Age;
    @Column(name="Donar_Weight")
    private Float Weight;
    @Column(name="Donar_Bloodgroup")
    private String Bloodgroup;

}
