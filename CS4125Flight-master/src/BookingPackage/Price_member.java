package BookingPackage;

import flightPackage.Flight;
import usersPackage.Customer;

public class Price_member extends BookingDecorator {

	Flight flight;
	Customer customer;

	public Price_member(Customer customer, Flight flight, BookingPrice p) {
		super(p);
		this.flight = flight;
		this.customer = customer;
	}

	public float cost() {
		// Implement membership price handle
		return super.cost() + 10;
	}

}
