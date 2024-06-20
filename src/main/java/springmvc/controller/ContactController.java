package springmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commDataForModel(Model model) {
		model.addAttribute("headDetails","Registration Form");
		model.addAttribute("desc","Fill the form correctly");
		
	}
	
	@GetMapping("/contact")
	public String showForm(Model model) {
		
		
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, Model model) {
		
		System.out.println(user);
		return "success";
	}
	
	/* @RequestMapping(path = "/processform", method = RequestMethod.POST) */
	/*public void processForm(HttpServletRequest request) {

		String usr = request.getParameter("usr");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		System.out.println("Your Name: "+usr);
		System.out.println("Your Email: "+email);
		System.out.println("Your Password: "+pass);
	}*/
	
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String processForm(@RequestParam("usr") String name, @RequestParam("email")
	 * String email, @RequestParam("pass") String pass, Model model) {
	 * 
	 * System.out.println("Your Name: "+name);
	 * System.out.println("Your Email: "+email);
	 * System.out.println("Your Password: "+pass);
	 * 
	 * model.addAttribute(name); model.addAttribute(email);
	 * model.addAttribute(pass);
	 * 
	 * return "success"; }
	 */
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String processForm(
//			@RequestParam("usr") String name,
//			@RequestParam("email") String email,
//			@RequestParam("pass") String pass, Model model
//			) {
//		
//		System.out.println("Your Name: "+name);
//		System.out.println("Your Email: "+email);
//		System.out.println("Your Password: "+pass);
//		
//		User user = new User();
//		
//		user.setName(name);
//		user.setEmail(email);
//		user.setPass(pass);
//		
//		model.addAttribute(user);		
//		
//		return "success";
//	}
	
}
