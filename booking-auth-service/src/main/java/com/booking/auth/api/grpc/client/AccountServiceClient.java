package com.booking.auth.api.grpc.client;

import org.springframework.stereotype.Component;

import com.booking.auth.grpc.AccountServiceGrpc;

import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class AccountServiceClient {

	@GrpcClient("account-service")
	private AccountServiceGrpc.AccountServiceBlockingStub stub;

//	public String createAccount(String email, String firstName, String lastName) {
		
//		AccountCreationRequest request =
//				AccountCreationRequest.newBuilder()
//				.setEmail(email)
//				.build();
//		
//		AccountCreationResponse response = stub.createAccount(request);
//		
//		return response.getMessage();
//	}
	
}
