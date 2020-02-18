package Model;

public class Car {
//	•Create a class CAR with 3 fields model and make and year.
//	•Create 5 car objects and use stack to store them
//	•Write a method to do ticket service for cars.
//	•ticketService(Queue carStack);
//	•In the method for each car in the stack print out the make and model of the car.
	// Values
	String model;
	String make;
	Integer year;
	// Constructor
	public Car(String model, String make, Integer year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}
	
	
	// Methods
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", year=" + year + "]";
	}
}
