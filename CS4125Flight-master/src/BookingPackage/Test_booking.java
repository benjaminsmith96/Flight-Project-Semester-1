package BookingPackage;

public class Test_booking {

	public static void main (String[] args) {
		BookingManager test = new BookingManager();
		Flight flight = new Flight();
		Customer customer = new Customer();

		test.makeBooking(customer, flight, "First Class");
	}
}
