package com.depotgenius.business.concretes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.depotgenius.business.abstracts.LoginService;
import com.depotgenius.business.rules.user.UserBusinessRules;
import com.depotgenius.core.config.jwt.JwtConfig;
import com.depotgenius.core.exceptions.BusinessException;
import com.depotgenius.entities.concretes.User;

@Service
public class LoginManager implements LoginService {

	@Autowired
	private JwtConfig jwtConfig;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserBusinessRules userBusinessRules;

	@Override
	public String login(String email, String password) {
		Optional<User> user = userBusinessRules.isUserExist(email);
		if (passwordEncoder.matches(password, user.get().getPassword())) {
			String token = jwtConfig.createToken(user.get());
			return token;
		} else {
			throw new BusinessException("WRONG_PASSWORD");
		}
	}

}
