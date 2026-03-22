package com.booking.auth.mapper;

import org.springframework.stereotype.Component;

import com.booking.auth.domain.User;

@Component
public class UserMapper {

	public User toDomain(String username, String hash) {
		return User.builder()
				.username(username)
				.passwordHash(hash)
				.build();
	};
}
