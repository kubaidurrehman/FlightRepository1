package Spring.Boot.FlightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Spring.Boot.FlightReservation.Entity.User;
import Spring.Boot.FlightReservation.Repositiory.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// for Registration
	@RequestMapping("/showreg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}

	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}

	// for Login
	@RequestMapping("/registerUser")
	public String register(@ModelAttribute("user") User user) {// model attribute make object which contain all
																// fields/variables of jsp page
		System.out.println(user);
		userRepository.save(user);
		return "login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		// @RequestParam fetch single data from jsp page
		System.out.println(email);
		System.out.println(password);
		System.out.println(modelMap);
		User user = userRepository.findByEmail(email);
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		if (user.getPassword().equals(password)) {
			return "Flights/findFlight";
		} else {
			modelMap.addAttribute("msg", "Invalid User name and password.");

		}
		return "login/login";
	}

}
