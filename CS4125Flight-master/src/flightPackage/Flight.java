/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightPackage;

import java.util.Date;

/**
 *
 * @author Cailean
 */
public class Flight {

  protected long flightID;
  protected int departureTime;
  protected Date departureDate;
  protected String departureAirport;
  protected int arrivalTime;
  protected Date arrivalDate;
  protected String arrivalAirport;
  protected Airplane airplane;
  protected FlightPrice flightPrice;

  public Flight(){

  }

  public Flight(long flightID, int departureTime, Date departureDate, String departureAirport, int arrivalTime, Date arrivalDate,
        String arrivalAirport, Airplane airplane, FlightPrice flightPrice) {

    this.flightID = flightID;
    this.departureTime = departureTime;
    this.departureDate = departureDate;
    this.departureAirport = departureAirport;
    this.arrivalTime = arrivalTime;
    this.arrivalDate = arrivalDate;
    this.arrivalAirport = arrivalAirport;
    this.airplane = airplane;
    this.flightPrice = flightPrice;

  }

  public long getFlightID() {
    return flightID;
  }

  public void setFlightID(long flightID) {
    this.flightID = flightID;
  }

  public int getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(int departureTime) {
    this.departureTime = departureTime;
  }

  public Date getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(Date departureDate) {
    this.departureDate = departureDate;
  }

  public String getDepartureAirport() {
    return departureAirport;
  }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  public int getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(int arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  public Date getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(Date arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public String getArrivalAirport() {
    return arrivalAirport;
  }

  public void setArrivalAirport(String arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
  }

  public Airplane getAirplane() {
    return airplane;
  }

  public void setAirplane(Airplane airplane) {
    this.airplane = airplane;
  }

  public FlightPrice getFlightPrice() {
    return flightPrice;
  }

  public void setFlightPrice(FlightPrice flightPrice) {
    this.flightPrice = flightPrice;
  }
  
}
