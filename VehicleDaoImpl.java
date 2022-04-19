package com.motivity.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motivity.Vehicle;
import java.util.List;

@Repository
public class VehicleDaoImpl implements VehicleDao {
	@Autowired
	   private SessionFactory sessionFactory;

	   public void add(Vehicle vehicle) {
	       sessionFactory.getCurrentSession().save(vehicle);
	 }
	   public void delete(Vehicle vehicle) {
	       sessionFactory.getCurrentSession().delete(vehicle);
	 }
	   public void update(Vehicle vehicle) {
	       sessionFactory.getCurrentSession().update(vehicle);
	 }
	   @SuppressWarnings("unchecked")
		public List<Vehicle> selection(){
			//Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Mobile.class);
			List<Vehicle> listUser = (List<Vehicle>) sessionFactory.getCurrentSession()
	                .createCriteria(Vehicle.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	        return listUser; //criteria.list();
		}


}
