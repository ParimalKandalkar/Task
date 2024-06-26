package Airline;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private boolean isAvailable;
	
	 public Flight(String flightNumber, String origin, String destination, String departureTime, String arrivalTime) {
	        this.flightNumber = flightNumber;
	        this.origin = origin;
	        this.destination = destination;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.isAvailable = true;
	    }

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrging() {
		return origin;
	}

	public void setOrging(String orging) {
		this.origin = orging;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	 public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

public void bookFlight() {
    isAvailable = false;
}

public void cancelBooking() {
    isAvailable = true;
}

@Override
public String toString() {
    return "Flight{" +"flightNumber='" + flightNumber + '\'' + ", origin='" + origin + '\'' +", destination='" 
    		+ destination + '\'' +
            ", departureTime='" + departureTime + '\'' +
            ", arrivalTime='" + arrivalTime + '\'' +
            ", isAvailable=" + isAvailable + '}';

}
}
