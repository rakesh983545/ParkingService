package com.rakesh.ParkingServiceApp.ParkingService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ParkingServiceV2 {

	int  floorcount=0;
	int sectioncount=0;
	int compartmentcount=0;
	HashMap<String,CustomerPojo> hm=new HashMap<String,CustomerPojo>();
	
	public String getAddCar(CustomerPojo cp)
	{
		
		if(sectioncount==4&&compartmentcount==9)	
		{
			floorcount++;
			sectioncount=0;
			compartmentcount=0;
		}
		
		
		else if(compartmentcount==9)
		{
			sectioncount++;
			compartmentcount=0;
		}
		
		String id="Floor"+Integer.toString(floorcount)+"Section"+Integer.toString(sectioncount)+"compartment"+Integer.toString(compartmentcount);
		//int a[][]=new int[4]
		System.out.println("Parking id"+id);
		hm.put(id, cp);
		compartmentcount++;
		//return "p";
		return id;
	}
	
	public CustomerPojo getById(String id)
	{
		return hm.get(id);
	}
	
	public void removeById(String id)
	{
		 hm.remove(id);
		// System.out.println(hm.removeById("Floor0Section0compartment3"));
	}
}

