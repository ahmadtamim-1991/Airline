package Services;

import org.springframework.stereotype.Service;

import DTO.FlightDTO;
@Service
public class FlightServices {
	
	public FlightDTO show() {
		FlightDTO f=new FlightDTO();
		f.setTrip("dsafa");
		f.setFrom("dsafds");
		f.setTo("dfffsadf");
		return f;
	}

}
