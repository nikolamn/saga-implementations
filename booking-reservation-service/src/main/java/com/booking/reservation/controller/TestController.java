package com.booking.reservation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class TestController {

	
	@GetMapping("/test")
	public String testMethod() {
		return "CONNECTED RESERVATION";
	}
}