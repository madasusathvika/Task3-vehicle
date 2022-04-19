package com.motivity.services;

import java.util.List;

import com.motivity.Vehicle;

public interface VehicleServices {
	  abstract void add(Vehicle vehicle);
	  abstract void delete(Vehicle vehicle);
	  abstract void update(Vehicle vehicle);
	  List<Vehicle> selection();


}

