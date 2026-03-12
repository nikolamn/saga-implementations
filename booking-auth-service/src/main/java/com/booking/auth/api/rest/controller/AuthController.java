package com.booking.auth.api.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.auth.core.service.RegistrationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
	
	private final RegistrationService registrationService;
	
//	@PostMapping("/signup")
//	public ResponseEntity<AuthRegisterResponse> signup(@RequestBody @Valid AuthRegisterRequest request) {
//		
//		String resp =  registrationService.signup(request);
//		
//		authUserService.saveAuthUser(request); 
//		
//		String token = authService.authenticateAndGetToken(request.getUsername(), request.getPassword());
//
//		return ResponseEntity.status(HttpStatus.CREATED).body(new AuthRegisterResponse(resp));
//	}
}
