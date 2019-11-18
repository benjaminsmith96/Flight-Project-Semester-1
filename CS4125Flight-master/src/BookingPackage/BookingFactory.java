package BookingPackage;

public class BookingFactory {

	public BookingFactory() {

	}

	public BookingPrice calculatePrice(Flight flight, String type) {

		BookingPrice price = new Booking();

		if(type.equals("First Class"))
			price = new Price_first(flight, price);

		else if(type.equals("Business Class"))
			price = new Price_business(flight, price);

		else if(type.equals("Economy Class"))
			price = new Price_economic(flight, price);

		return price;

	}

}
