package com.booking.account.mapper;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.booking.account.domain.Account;
import com.booking.account.dto.common.AccountDTO;
import com.booking.account.enums.EStatus;
import com.booking.grpc.stubs.AccountCreationRequest;

@Component
public class AccountMapper {

	public Account toDomain(AccountDTO dto) {
		return Account.builder()
				.userId(dto.getUserId())
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.birthdate(LocalDate.parse(dto.getBirthdate()))
				.email(dto.getEmail())
				.status(EStatus.CREATED)
				.build();
	}

	public AccountDTO grpcToDTO(AccountCreationRequest req) {
		return AccountDTO.builder()
				.userId(UUID.fromString(req.getAuthUserId()))
				.firstName(req.getFirstName())
				.lastName(req.getLastName())
				.birthdate(req.getBirthdate())
				.email(req.getEmail())
				.build();
	};
}