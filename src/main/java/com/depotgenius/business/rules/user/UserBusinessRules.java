package com.depotgenius.business.rules.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depotgenius.core.exceptions.BusinessException;
import com.depotgenius.dataAccess.UserRepository;
import com.depotgenius.entities.concretes.User;

@Service
public class UserBusinessRules {

	@Autowired
	private UserRepository userRepository;

	public Optional<User> checkIfEmailExist(String email) {
		Optional<User> userOptional = userRepository.findByEmail(email);
		if (userOptional.isPresent()) {
			throw new BusinessException("USER_EMAIL_ALREADY_EXISTS");
		}
		return userOptional;
	}

	public Optional<User> isUserExist(String email) {
		return userRepository.findByEmail(email);
	}

}
