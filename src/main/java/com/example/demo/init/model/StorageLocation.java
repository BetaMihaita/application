package com.example.demo.init.model;

import javax.persistence.Entity;

@Entity
public class StorageLocation extends Location {
    private int aisle;
    private int x;
    private int y;
    private int z;

    public StorageLocation() {
        super();
    }

    public StorageLocation(String barcode, int aisle, int x, int y, int z) {
        super(barcode);
        this.aisle = aisle;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "StorageLocation{" +
                "aisle=" + aisle +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}