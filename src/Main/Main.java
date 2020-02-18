package Main;

import java.util.Queue;
import java.util.Stack;

import Model.Car;

public class Main {
//	•Create a class CAR with 3 fields model and make and year.
//	•Create 5 car objects and use stack to store them
//	•Write a method to do ticket service for cars.
//	•ticketService(Queue carStack);
//	•In the method for each car in the stack print out the make and model of the car.
	public static void main(String[] args) {
		Stack<Car> cars = new Stack<Car>();
		//Deque<Car> cars = new ArrayDeque<Car>();
		cars.add(new Car("Accord", "Honda", 2018));
		cars.add(new Car("3", "Mazda", 2019));
		cars.add(new Car("Camry","Toyota", 2019));
		cars.add(new Car("Outback", "Subaru", 2016));
		cars.add(new Car("Altima", "Nissan", 2020));
		
		ticketService(cars);
	}
	
	public static void ticketService(Stack<Car> carStack) {
	//public static void ticketService(Queue<Car> carStack) {
		carStack.stream().forEach(c -> System.out.println(c.toString()));
	}
}
