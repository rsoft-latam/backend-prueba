package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "note")
public class Note implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "value")
    private Integer value;

    @Column(name = "observation")
    private String observation;

    @Column(name = "bimester")
    private String bimester;

    @ManyToOne
    @JoinColumn(name = "notebook_id")
    private Notebook notebook;

    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "notes")
    private Set<Matter> matters = new HashSet<>();

    public Note() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getBimester() {
        return bimester;
    }

    public void setBimester(String bimester) {
        this.bimester = bimester;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    public Set<Matter> getMatters() {
        return matters;
    }

    public void setMatters(Set<Matter> matters) {
        this.matters = matters;
    }
}
