package com.booking.account.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAccount() {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Deletation pending.");
	}
}
