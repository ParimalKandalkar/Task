package rentalManagement;

import java.util.List;

public class Customer {

private String customerId;
	
	private String name;
	
	private String email;
	
	private List<Car> rentedCars;

	public Customer(String customerId, String name, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public List<Car> getRentedCars() {
		return rentedCars;
	}

	public void setRentedCars(List<Car> rentedCars) {
		this.rentedCars = rentedCars;
	}

	public void addCar(Car car) {
		this.rentedCars.add(car);
	}
	
	public void removeCars(Car car) {
		this.rentedCars.remove(car);
	}
	
	public boolean customerId(String customerId) {
		if(customerId.isEmpty() || customerId == null){
			return true;
		}
		else {
			return false;
		}		
	}
	
	public boolean emailformat(String email) {
		if(email.contains("@")) {
			return true;
		}
		else
			return false;
		
	}
}
