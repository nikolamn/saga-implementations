package com.booking.auth.core.service.impl;

import org.springframework.stereotype.Service;

import com.booking.auth.api.grpc.client.AccountServiceClient;
import com.booking.auth.api.rest.dto.RegistrationRequest;
import com.booking.auth.core.service.AuthService;
import com.booking.auth.core.service.AuthUserService;
import com.booking.auth.core.service.RegistrationService;

import lombok.RequiredArgsConstructor;

// Orchestrator service
@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

	private final AuthUserService authUserService;
	private final AuthService authService;
	
	private final AccountServiceClient accountService;
	
	@Override
	public void signup(RegistrationRequest request) {
//		authUserService.saveAuthUser(request);
 
//		String token = authService.authenticateAndGetToken(request.getUsername(), request.getPassword());
		
		
		try {
//		String resp = accountService.createAccount("aaa", "bbb", "ccc");
			
		} catch (Exception e) {
//			authUserService.delete(userID);
//			throw new RegistrationFailedEx(e);
		}

//		System.out.println("RESPONSE FROM ACC SRV: " + resp);
//		return resp;
	}
}
