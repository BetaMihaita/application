package com.example.demo.init.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String barcode;
    @OneToMany(mappedBy = "location")
    private List<LoadUnit> loadUnits = new ArrayList<>();

    public Location() {
    }

    public Location(String barcode) {
        this.barcode = barcode;
    }
    @Column(unique = true)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public List<LoadUnit> getLoadUnits() {
        return loadUnits;
    }

    public void setLoadUnits(List<LoadUnit> loadUnits) {
        this.loadUnits = loadUnits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}