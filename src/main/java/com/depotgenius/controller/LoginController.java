package com.depotgenius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.depotgenius.business.abstracts.LoginService;
import com.depotgenius.dtos.login.LoginRequest;
import com.depotgenius.dtos.login.LoginResponse;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public LoginResponse login(@RequestBody LoginRequest dto) {
		String token = loginService.login(dto.getEmail(), dto.getPassword());
		return new LoginResponse(token);
	}
}
