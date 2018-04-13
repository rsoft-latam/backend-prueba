package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class Person implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "ci")
    private Integer ci;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name_father")
    private String last_name_father;

    @Column(name = "last_name_mother")
    private String last_name_mother;

    @Column(name = "sex")
    private String sex;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private Integer phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name_father() {
        return last_name_father;
    }

    public void setLast_name_father(String last_name_father) {
        this.last_name_father = last_name_father;
    }

    public String getLast_name_mother() {
        return last_name_mother;
    }

    public void setLast_name_mother(String last_name_mother) {
        this.last_name_mother = last_name_mother;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
