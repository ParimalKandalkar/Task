package Airline;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Airline airline = new Airline();

        Flight flight1 = new Flight("F001", "London", "Parimal", "10:00 AM", "1:00 PM");
        Flight flight2 = new Flight("F002", "Germany", "Rutuja", "8:00 AM", "11:00 AM");
        airline.addFlight(flight1);
        airline.addFlight(flight2);

        Passenger passenger1 = new Passenger("Robin Sharma", "P001");
        Passenger passenger2 = new Passenger("Rohit Kapoor", "P002");
        airline.registerPassenger(passenger1);
        airline.registerPassenger(passenger2);

        airline.bookFlight("P001", "F001");
        airline.bookFlight("P002", "F002");

        airline.listAvailableFlights();
        airline.listBookedFlights();

        airline.cancelBooking("P001", "F001");

        airline.listAvailableFlights();
        airline.listBookedFlights();

        System.out.println("String Utility Test:");
        System.out.println("Count occurrences of 'a' in 'Banana': " + StringUtil.countOccurrences("Banana", 'a'));
        System.out.println("Reverse string 'hello': " + StringUtil.reverseString("hello"));
        System.out.println("Is 'madam' a palindrome? " + StringUtil.isPalindrome("madam"));
        System.out.println("Capitalize words in 'hello world': " + StringUtil.capitalizeWords("hello world"));

        System.out.println("Wrapper Utility Test:");
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Find max in array: " + WrapperUtil.findMax(numbers));
        Double[] doubles = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Calculate average of array: " + WrapperUtil.calculateAverage(doubles));
        String binaryString = "1101";
        Boolean[] booleanArray = WrapperUtil.convertToBooleanArray(binaryString);
        System.out.println("Convert binary string to boolean array: " + Arrays.toString(booleanArray));
        System.out.println("Convert boolean array to binary string: " + WrapperUtil.convertToBinaryString(booleanArray));
    }


}
