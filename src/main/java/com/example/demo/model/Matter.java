package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "matter")
public class Matter implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "initials")
    private String initials;

    @Column(name = "description")
    private String description;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "has_matter",
            joinColumns = {@JoinColumn(name = "matter_id")},
            inverseJoinColumns = {@JoinColumn(name = "note_id")}
    )
    private Set<Note> notes = new HashSet<>();


    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "registered",
            joinColumns = {@JoinColumn(name = "matter_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private Set<Student> students= new HashSet<>();


    public Matter() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
