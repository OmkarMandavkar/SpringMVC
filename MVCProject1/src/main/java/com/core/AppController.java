package com.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	@RequestMapping(value = "/message", method = RequestMethod.GET) // will get triggered
	public String getMessage() { // only for get requests
		return "test.jsp";
	}

	@RequestMapping(value = "/message", method = RequestMethod.POST) // will get triggered
	public String demo() { // only for post requests
		return "demo.jsp";
	}

	@RequestMapping(value = "/read", method = RequestMethod.POST)
	public String read(HttpServletRequest request) {

		String username = request.getParameter("userName");
		String useremail = request.getParameter("userEmail");
		String address = request.getParameter("address");

		System.out.println("UserName" + username);
		System.out.println("UserEmail" + useremail);
		System.out.println("Address" + address);

		return "test.jsp";
	}
}
