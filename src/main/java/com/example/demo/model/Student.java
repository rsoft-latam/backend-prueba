package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "person_code")
    private Integer person_code;

    @Column(name = "enrollment")
    private String enrollment;

    @Column(name = "type")
    private String type;


    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "students")
    @JsonIgnore
    private Set<Matter> matters = new HashSet<>();


    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPerson_code() {
        return person_code;
    }

    public void setPerson_code(Integer person_code) {
        this.person_code = person_code;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Matter> getMatters() {
        return matters;
    }

    public void setMatters(Set<Matter> matters) {
        this.matters = matters;
    }
}
