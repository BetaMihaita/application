package com.example.demo.init.model;

import javax.persistence.*;

@Entity
@Table(name = "load_unit")
public class LoadUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    private Location location;
    private String barecode;

    public LoadUnit() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    @Column(unique = true)
    public String getBarecode() {
        return barecode;
    }

    public void setBarecode(String barecode) {
        this.barecode = barecode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}