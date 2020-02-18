package Homework4;

import java.util.ArrayList;
import java.util.List;

public class AppRun {
	public static void main(String[] args) {
		Car car1 = new Car("Forester", "Subaru", 2019);
		Car car2 = new Car("Touring", "Hyundai", 2012);
		Car car3 = new Car("Venza", "Toyota", 2010);
		Car car4 = new Car("Q7", "Audi", 2016);
		Car car5 = new Car("MZR", "Acura", 2020);

		List<Car> listCars = new ArrayList<>();
		listCars.add(car1);
		listCars.add(car2);
		listCars.add(car3);
		listCars.add(car4);
		listCars.add(car5);
		listCars.stream().forEach(car -> System.out.println(car));
		System.out.println();
		
		System.out.println("using ticketMethod ----------------:");
		Service<Car> stack = new Service<>();
		stack.push(car1);
		stack.push(car2);
		stack.push(car3);
		stack.push(car4);
		stack.push(car5);
		stack.ticketService();

//		
//		//Collections.sort(listCars);
//		Collections.sort(listCars, new MakeComparator());
//		
//		listCars.stream().forEach(car -> System.out.println(car));
	}
}
