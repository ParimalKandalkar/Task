package rentalManagement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarRentalServices {

	public static void main(String[] args) {
		Car car = new Car();
		List<Car> addCars = new ArrayList<>();
		
		Customer customer = new Customer();		
		Rental rental = new Rental();
		
		Car addCar = new Car("Suzuki", "Ciaz","ABC123",2000,true);
		addCars.add(addCar);
		
		System.out.println(addCar.getBrand());
		System.out.println(addCar.getModel());
		System.out.println(addCar.getLicensePlate());
		System.out.println(addCar.getYear());
		
		Car removeCar = new Car("Suzuki", "Ciaz","ABC123",2000,true);
       
        Customer addCustomer = new Customer("Cust12345","Parimal", "parimal@example.com");
        
        System.out.println(addCustomer.getName());
        System.out.println(addCustomer.getEmail());
        System.out.println(addCustomer.getCustomerId());
             
        Rental rental1 = new Rental(addCar,addCustomer,LocalDate.now(), LocalDate.now().plusDays(1));
        
        System.out.println(rental1.getCustomer());

        //car functions and validation
        
        car.AsRented(false);
        
        car.AsReturned(true);
        
        car.checklicensePlate(addCar.getLicensePlate());
        
        car.carAvailability(addCar);
        
        car.positiveYear(addCar.getYear());
        
        //rental functions and validation
        
        rental.futureRentalDate(rental1.getRentalDate());
        
        rental.futureRentalDate(rental1.getReturnDate());
        
        rental.rentalCarCreated();
        
        customer.setRentedCars(addCars);
        
        //customer  functions and validation
        
        customer.addCar(addCar);
        
        customer.removeCars(removeCar);
        
        customer.emailformat(addCustomer.getEmail());
        
        customer.customerId(addCustomer.getCustomerId());
        
    }	
}
