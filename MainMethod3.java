package com.motivity;

import com.motivity.configs.VehicleConfigs;
import com.motivity.Vehicle;
import com.motivity.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class MainMethod3 {

    public static void main(String[] args) throws InterruptedException, SQLException {
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(VehicleConfigs.class);

        VehicleServices vehicleServices = context.getBean(VehicleServices.class);

        // Add Employee
        //itService.add(new ITcompany(100,"MMV", "Ram", "ramnagar","springboot"));

        //context.close();
        int a,b,c,d,e,f,k;
        char r;
        String s,v,w,x,y;
        Scanner i =new Scanner(System.in);
        do {
        System.out.println("Enter the options");
        System.out.println("1.Insert 2.Delete 3.Upadate 4.select 5.exit");
        int p=i.nextInt();
        switch(p) {
        case 1:System.out.println("Enter vehicle_no");
        a=i.nextInt();
        System.out.println("Enter brand");
        s=i.next();
        System.out.println("Enter colour");
        v=i.next();
        System.out.println("Enter model");
        w=i.next();
  
        Vehicle ob=new Vehicle(a,s,v,w);
        vehicleServices.add(ob);
        break;
        
        case 2:
        	System.out.println("enter the vehicle_no which you want to delete");
        	a=i.nextInt();
        	 Vehicle ob2=new Vehicle(a);
        	 ob2.setVehicle_no(a);
        	 vehicleServices.delete(ob2);
        break;
        case 3:
        	System.out.println("enter the vehicle_no which you want to update");
        	b=i.nextInt();
        	System.out.println("Enter the brand to be updated");
        	v=i.next();
        	System.out.println("Enter the colour to be updated");
        	s=i.next();
        	System.out.println("Enter the model to be updated");
        	x=i.next();
        	//System.out.println("Enter the project to be updated");
        	//y=i.next();
        	Vehicle ob4=new Vehicle(b,v,s,x);
        	vehicleServices.update(ob4);
        	break;
        	/*a=i.nextInt();
        	System.out.println("enter the value which you want to update 1.companyname 2.ceo 3.branches 4.project");
        	f=i.nextInt();
        	switch(f) {
        	
        	case 1:
        	ITcompany ob3=new ITcompany(a);
       	    ob3.setEmployeeid(f);
       	    itService.update(ob3);
       	    }*/
        case 4:System.out.println("Retriving mobile details");
		List<Vehicle> ve=vehicleServices.selection();
		for(Vehicle k1:ve) {
			System.out.println(k1.getVehicle_no()+"    "+k1.getBrand()+"     "+k1.getColour()+"     "+k1.getModel());
		}
		break;
        case 5:System.out.println("Existing");
        	java.lang.System.exit(0);	
        	break;
        }
        }while(true);
        //i.close();
        //context.close();
        
        }
    }


