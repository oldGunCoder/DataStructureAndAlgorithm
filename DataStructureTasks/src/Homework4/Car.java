package Homework4;

public class Car {
/*
•Create a class CAR with 3 fields model and make and year.
•Create 5 car objects and use stack to store them
•Write a method to do ticket service for cars.
•ticketService(Queue carStack);
•In the method for each car in the stack print out the make and model of the car.
*/
	private String model;
	private String make;
	private int year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Car(String model, String make, int year) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", year=" + year + "]";
	}
	
}
