package com.booking.auth.api.rest.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AccountDTO {

	// basic validation, Account Service will validate AccountDTO properly
	@NotBlank
    private String firstName;
	
	@NotBlank
    private String lastName;
	
	@NotBlank
    private String email;

	@NotBlank
    private String gender;

	@NotNull
    private LocalDate birthDate;
	
	@NotNull
    private AddressDTO address;
}