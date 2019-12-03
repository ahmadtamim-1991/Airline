package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DTO.FlightDTO;
import Services.FlightServices;
import Services.PriceService;

@Controller
public class FlightController {
	private PriceService price;


	@RequestMapping(value = "book-flight", method = RequestMethod.GET)
	public ModelAndView flightInfo() {

		FlightDTO p = new FlightDTO();

		ModelAndView mv = new ModelAndView("book-flight");
		mv.addObject("jaan", p);

		return mv;

	}

	@RequestMapping(value = "process-flight", method = RequestMethod.POST)
	public ModelAndView processFlight(FlightDTO flight) {

		System.out.println("i m processing flight");
		System.out.println(flight.toString());
        price.priceCalculator(flight);
		ModelAndView mv = new ModelAndView("flight123");
		mv.addObject("f", flight);

		return mv;
	}

	public PriceService getPrice() {
		return price;
	}

	public void setPrice(PriceService price) {
		this.price = price;
	}


}
