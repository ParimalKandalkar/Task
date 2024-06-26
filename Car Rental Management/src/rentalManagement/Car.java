package rentalManagement;

public class Car {
	
	
	private String licensePlate;
	
	private String model;
	
	private String brand;
	
	private int year;
	
	private boolean available;
	
	public Car() {
		super();
	}

	public Car(String licensePlate, String model, String brand, int year, boolean available) {
		super();
		this.licensePlate = licensePlate;
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.available = available;
				
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	
	
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Car AsRented(boolean available) {
		Car car = new Car();
		car.setAvailable(available);
		return car;
	}
	
	public boolean AsReturned(boolean available) {
		return true;	
	}
	
	//validation
	public boolean checklicensePlate(String licensePlate) {
		if(licensePlate.isEmpty() || licensePlate == null){
			return true;
		}
		else {
			return false;
		}		
	}
	 
	public boolean positiveYear(int year) {
		return year > 0;
		
	}
	
	public Car carAvailability(Car car) {
		if(car.isAvailable()) {
		return car;
		}
		else
		return null;
		
	}
  
}
