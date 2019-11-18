package BookingPackage;

abstract public class BookingDecorator extends BookingPrice {

	private BookingPrice b;

	public BookingDecorator(BookingPrice b) { this.b = b; }

	public float cost() { return b.cost(); }

}
