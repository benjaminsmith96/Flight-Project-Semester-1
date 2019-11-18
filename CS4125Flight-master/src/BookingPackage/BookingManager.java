/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingPackage;

import flightPackage.Flight;
import cs4125.control.data.BookingInterface;
import usersPackage.Customer;

public class BookingManager implements BookingInterface {

 	BookingFactory factory = new BookingFactory();

 	public BookingManager() {

 	}

 	@Override
 	public Booking makeBooking(Customer customer, Flight flight, String type) {

 		int bookingID = (int)(Math.random()*100);

 		Booking booking = new Booking(bookingID, customer, flight, calculatePrice(flight, type));

 		System.out.println(booking.toString());
 		return booking;
 	}

 	@Override
 	public float calculatePrice(Flight flight, String type) {

 		return factory.calculatePrice(flight, type).cost();

 	}

 	@Override
 	public void handlePoints(Customer customer) {


 	}

}
