/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cailean
 */
public class FlightPrice {

	private Flight flight;
	private float firstPrice;
	private float businessPrice;
	private float economicPrice;

	public FlightPrice(Flight flight, float firstPrice, float businessPrice, float economicPrice) {

		this.flight = flight;
		this.firstPrice = firstPrice;
		this.businessPrice = businessPrice;
		this.economicPrice = economicPrice;

	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public float getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(float firstPrice) {
		this.firstPrice = firstPrice;
	}

	public float getBusinessPrice() {
		return businessPrice;
	}

	public void setBusinessPrice(float businessPrice) {
		this.businessPrice = businessPrice;
	}

	public float getEconomicPrice() {
		return economicPrice;
	}

	public void setEconomicPrice(float economicPrice) {
		this.economicPrice = economicPrice;
	}

}
