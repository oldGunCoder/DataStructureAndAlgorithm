package Homework4;

import java.util.ArrayList;

public class Service<Car> {
	// ctrl + shift + o : add package
	ArrayList<Car> arr = new ArrayList<Car>();

	public Car push(Car car) {
		arr.add(car);
		return car;
	}

	public Car pop() {
		int size = arr.size();
		Car car = arr.get(size - 1);
		arr.remove(size - 1);
		return car;
	}

	public boolean isEmpty() {
		return arr.size() == 0;
	}

	public void ticketService() {

		for (int i = (arr.size() - 1); i >= 0; i--) {
			System.out.println(arr.get(i));
			pop();
		}

	}
}
