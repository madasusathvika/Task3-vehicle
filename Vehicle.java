package com.motivity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
@Entity
@Table(name = "Vehicle")
public class Vehicle {
	@Id
private int vehicle_no;
	@Column(name = "brand")
private String brand;
	@Column(name = "colour")
private String colour;
	@Column(name = "model")
private String model;
	public Vehicle() {}
	public Vehicle(int vehicle_no,String brand,String colour,String model) {
		this.vehicle_no=vehicle_no;
		this.brand=brand;
		this.colour=colour;
		this.model=model;
	}
	public Vehicle(int vehicle_no) {
		this.vehicle_no=vehicle_no;
	}
public int getVehicle_no() {
	return vehicle_no;
}
public void setVehicle_no(int vehicle_no) {
	this.vehicle_no = vehicle_no;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

}
