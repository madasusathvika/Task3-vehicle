package com.motivity.services;

import com.motivity.dao.VehicleDao;
import com.motivity.Vehicle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class VehicleServicesImpl implements VehicleServices {
	@Autowired
    public VehicleDao vehicleDao;
    @Transactional
   
    public void add(Vehicle vehicle) {
        vehicleDao.add(vehicle);
    }
    @Transactional
    public void delete(Vehicle vehicle) {
        vehicleDao.delete(vehicle);
    }
    @Transactional
    public void update(Vehicle vehicle) {
    	vehicleDao.update(vehicle);
    }
    @Transactional
	public List<Vehicle> selection(){
		return vehicleDao.selection();
	}
    
    

}

