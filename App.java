package com.rakesh.ParkingServiceApp.ParkingService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CustomerPojo ps1=new CustomerPojo("bibhu",6,1,"983545",1,1,2);
    	CustomerPojo ps2=new CustomerPojo("ra",2,2,"9835458765",1,2,3);
    	CustomerPojo ps3=new CustomerPojo("rb",3,3,"983545111",3,4,5);
    	CustomerPojo ps4=new CustomerPojo("rc",6,4,"983545222",6,7,8);
    	CustomerPojo ps5=new CustomerPojo("rd",9,5,"983545333",4,5,6);
    	CustomerPojo ps6=new CustomerPojo("fhg",10,6,"98354544",6,7,8);
    	CustomerPojo ps7=new CustomerPojo("zdbf",11,7,"983545555",9,11,12);
    	CustomerPojo ps8=new CustomerPojo("bkjibhu",12,8,"983545777",1,13,72);
    	
    	ParkingServiceV2 ps=new ParkingServiceV2();
    	System.out.println(ps.getAddCar(ps1));
    	System.out.println(ps.getAddCar(ps2));
    	System.out.println(ps.getAddCar(ps3));
    	System.out.println(ps.getAddCar(ps4));
    	System.out.println(ps.getAddCar(ps5));
    	System.out.println(ps.getAddCar(ps6));
    	System.out.println(ps.getAddCar(ps7));
    	System.out.println(ps.getAddCar(ps8));
    
    	System.out.println();
    	
    }
}


