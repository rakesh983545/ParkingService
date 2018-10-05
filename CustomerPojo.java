package com.rakesh.ParkingServiceApp.ParkingService;

public class CustomerPojo 
{
	int parkId;
	String ownerName;
	int parkingTime;
	//Parking parkId;
	String phoneNumber;
	int floorNo;
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getSectionNo() {
		return sectionNo;
	}
	public void setSectionNo(int sectionNo) {
		this.sectionNo = sectionNo;
	}
	public int getCompartmentNo() {
		return compartmentNo;
	}
	public void setCompartmentNo(int compartmentNo) {
		this.compartmentNo = compartmentNo;
	}
	int sectionNo;
	int compartmentNo;
	
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(int parkingTime) {
		this.parkingTime = parkingTime;
	}
	public int getParkId() {
		return parkId;
	}
	public void setParkId(int parkId) {
		this.parkId = parkId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public CustomerPojo() {
		super();
	}
	public CustomerPojo(String ownerName, int parkingTime, int parkId, String phoneNumber, int floorNo,
			int sectionNo, int compartmentNo) {
		super();
		this.ownerName = ownerName;
		this.parkingTime = parkingTime;
		this.parkId = parkId;
		this.phoneNumber = phoneNumber;
		this.floorNo = floorNo;
		this.sectionNo = sectionNo;
		this.compartmentNo = compartmentNo;
	}
	public CustomerPojo(int floorNo) {
		// TODO Auto-generated constructor stub
		this.floorNo=floorNo;
	}
	@Override
	public String toString() {
		return "CustomerPojo [parkId=" + parkId + ", ownerName=" + ownerName + ", parkingTime=" + parkingTime
				+ ", phoneNumber=" + phoneNumber + ", floorNo=" + floorNo + ", sectionNo=" + sectionNo
				+ ", compartmentNo=" + compartmentNo + "]";
	}
	
	
	
	

}
