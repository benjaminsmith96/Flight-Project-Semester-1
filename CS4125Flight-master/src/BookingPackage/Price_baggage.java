package BookingPackage;

public class Price_baggage extends BookingDecorator {

	Price_baggage(BookingPrice p) {
		super(p);
	}

	public float cost() {
		return super.cost() + 10;
	}

}
