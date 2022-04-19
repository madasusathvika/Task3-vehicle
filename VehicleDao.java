package com.motivity.dao;

import java.util.List;

//import com.pt.entities.Employee;
import org.springframework.stereotype.Repository;

import com.motivity.Vehicle;

@Repository
public interface VehicleDao {
	  abstract void add(Vehicle vehicle);
	  abstract void delete(Vehicle vehicle);
	  abstract void update(Vehicle vehicle);
	  List<Vehicle> selection();
}

