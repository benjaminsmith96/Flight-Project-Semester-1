/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookingPackage;
import usersPackage.*;
import flightPackage.*;

/**
 *
 * @author Cailean
 */
public class FlightBooking extends BookingPrice {

    protected int bookingID;
    protected Customer userCustomer;
    protected Flight flight;
    private float price;

    public FlightBooking(){

    }

    public FlightBooking(int bookingID, Customer customer, Flight flight, float price) {
		  this.bookingID = bookingID;
		  this.customer = customer;
		  this.flight = flight;
		  this.price = price;
    }

    public int getBookingID() {
    	return bookingID;
	  }

    public void setBookingID(int bookingID) {
      this.bookingID = bookingID;
    }

	public Customer getCustomer() {
		return userCustomer;
	}

	public void setCustomer(Customer customer) {
		this.userCustomer = user;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

  @Override
	public String toString() {
		return "Booking [bookingID=" + bookingID + ", customer=" + customer + ", flight=" + flight + ", price=" + price
				+ "]";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return ((float)(Math.random()*100.0));
	}

}
