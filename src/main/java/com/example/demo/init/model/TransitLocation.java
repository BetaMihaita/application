package com.example.demo.init.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TransitLocation")
public class TransitLocation extends Location implements Serializable {

	public TransitLocation() {
		super();

	}

	public TransitLocation(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "TransitLocation []";
	}

}
