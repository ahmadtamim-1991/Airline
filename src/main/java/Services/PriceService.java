package Services;

import DTO.FlightDTO;

public class PriceService {

	public void priceCalculator(FlightDTO d) {

		if (d.getAirLine().equalsIgnoreCase("american airlines") & d.getTrip().equalsIgnoreCase("one way"))
			d.setPrice(500);
		else if (d.getAirLine().equalsIgnoreCase("american airlines") & d.getTrip().equalsIgnoreCase("round trip"))
			d.setPrice(800);

	}
}
