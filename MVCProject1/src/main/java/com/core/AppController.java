package com.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(value = "/message", method = RequestMethod.GET) // will get triggered
	public String getMessage() { // only for get requests
		return "display1.jsp";
	}

	@RequestMapping(value = "/message", method = RequestMethod.POST) // will get triggered
	public String demo() { // only for post requests
		return "demo.jsp";
	}

	// Reading HTML form data in API and print it on the console
	@RequestMapping(value = "/read", method = RequestMethod.POST)
	public ModelAndView read(HttpServletRequest request) {

		String username = request.getParameter("userName");
		String useremail = request.getParameter("userEmail");
		String address = request.getParameter("address");

		System.out.println("UserName : " + username);
		System.out.println("UserEmail : " + useremail);
		System.out.println("Address : " + address);

		ModelAndView mv = new ModelAndView("display1.jsp");
		mv.addObject("UName", username);
		mv.addObject("UEmail", useremail);
		mv.addObject("UAddress", address);

		return mv;
	}

	// Passing the data from controller to view and ask view to print it using ModelAndView class object
	@RequestMapping("/write")
	public ModelAndView write() {

		ModelAndView mv = new ModelAndView("display2.jsp");

//		mv.setViewName("display2.jsp");
		mv.addObject("UName", "Zeus");
		mv.addObject("UEmail", "zeus@gmail.com");
		mv.addObject("UAddress", "Powai");

		return mv;
	}

	
	// Passing the data between controller and view using model interface
	@RequestMapping("/msg")
	public String message(Model model) {
		
		model.addAttribute("brand", "ABC");
		model.addAttribute("name", "XYZ");
		model.addAttribute("age", 20);
		
		return "display3.jsp";
	}
}
