/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightPackage;

/**
 *
 * @author Cailean
 */
public class Airplane {

  protected String airplaneID;
  protected int firstCapacity;
	protected int businessCapacity;
	protected int economicCapacity;

	public Airplane(String airplaneID, int firstCapacity, int businessCapacity, int economicCapacity) {
		this.airplaneID = airplaneID;
		this.firstCapacity = firstCapacity;
		this.businessCapacity = businessCapacity;
		this.economicCapacity = economicCapacity;
	}

	public String getAirplaneID() {
		return airplaneID;
	}

	public void setAirplaneID(String airplaneID) {
		this.airplaneID = airplaneID;
	}

	public int getFirstCapacity() {
		return firstCapacity;
	}

	public void setFirstCapacity(int firstCapacity) {
		this.firstCapacity = firstCapacity;
	}

	public int getBusinessCapacity() {
		return businessCapacity;
	}

	public void setBusinessCapacity(int businessCapacity) {
		this.businessCapacity = businessCapacity;
	}

	public int getEconomicCapacity() {
		return economicCapacity;
	}

	public void setEconomicCapacity(int economicCapacity) {
		this.economicCapacity = economicCapacity;
	}

}
