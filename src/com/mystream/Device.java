package com.mystream;

public class Device {

	private String name;
	private String technicianName;
	private int no_of_days;
	
	
	public Device(String name, String technicianName, int no_of_days) {
		super();
		this.name = name;
		this.technicianName = technicianName;
		this.no_of_days = no_of_days;
	}
	public int getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	public Device(String name, String technicianName) {
		super();
		this.name = name;
		this.technicianName = technicianName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTechnicianName() {
		return technicianName;
	}
	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}
	@Override
	public String toString() {
		return "Device [name=" + name + ", technicianName=" + technicianName + ", no_of_days=" + no_of_days + "]";
	}
	
}
