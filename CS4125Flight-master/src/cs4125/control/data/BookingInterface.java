package cs4125.control.data;

import BookingPackage.*;
import flightPackage.Flight;
import usersPackage.Customer;

public interface BookingInterface {

	public Booking makeBooking(Customer customer, Flight flight, String type);

	public float calculatePrice(Flight flight, String type);

	public void handlePoints(Customer customer);

}
