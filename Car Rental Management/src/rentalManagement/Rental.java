package rentalManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rental {
	
	private Car car;
	
	private Customer customer;
	
	private LocalDate rentalDate;
	
	private LocalDate returnDate;

	public Rental(Car car, Customer customer, LocalDate rentalDate, LocalDate returnDate) {
		super();
		this.car = car;
		this.customer = customer;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
	}

	public Rental() {
		
	}

	public Car getCar() {
		return car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}
	
	
	public Car rentalCarCreated() {
		Car car = new Car();
		car.setBrand("Suzuki");
		car.setLicensePlate("ABC123");
		car.setModel("Ciaz");
		car.setYear(2);
		List<Car> addCar = new ArrayList<>();
	    Customer customer = new Customer();	
		addCar.add(car);
	    customer.setRentedCars(addCar);
	    customer.addCar(car);
		/*
		 * boolean checkLicense = car.checklicensePlate(car.getLicensePlate());
		 * if(checkLicense) { System.out.println("allowed"); } 
		 * else {
		 * System.out.println("not allowed"); }
		 */
		return car;
		
	}
	
	public boolean futureRentalDate(LocalDate rentalDate) {
		LocalDate localDate = LocalDate.now();
		if(localDate.isAfter(rentalDate)){
		return true;
		}
		else {
			return false;
		}
	}
	public boolean returnDateAfterRentalDate(LocalDate rentalDate) {
		if(this.returnDate.isAfter(rentalDate)) {
			return true;
		}
		else {
		return false;
		}
		
	}


}
