package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		System.out.println("Hello this is home url");
		
		model.addAttribute("name", "CHANDAN DAS");
		model.addAttribute("id", 1001);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Chandan DAS");
		friends.add("Mithun DAS");
		friends.add("Renu Devi");
		friends.add("Shatrudhan DAS");
		friends.add("Shivnath DAS");
		friends.add("Malti DEVi");
		
		model.addAttribute("friends", friends);
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		System.out.println("From Controller, about handler got executed");
		return "about";
	}
	
	@GetMapping("/help")
	public ModelAndView help() {
		System.out.println("From Controller, help handler got executed.");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Chandan DAS");
		mv.addObject("rollNumber", "18-25-103");
		
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("dt",now);	
		
		///marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		
		mv.addObject("marks", list);
		
		mv.setViewName("help");
		return mv;
	}
}