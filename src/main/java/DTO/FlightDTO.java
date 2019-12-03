package DTO;

public class FlightDTO {
	 private String trip;
	 private String from;
	 private String to;
	 private String airLine;
	 private double price;
	public String getTrip() {
		return trip;
	}
	public void setTrip(String trip) {
		this.trip = trip;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getAirLine() {
		return airLine;
	}
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FlightDTO [trip=" + trip + ", from=" + from + ", to=" + to + ", airLine=" + airLine + ", price=" + price
				+ "]";
	}
	
	

	

}
