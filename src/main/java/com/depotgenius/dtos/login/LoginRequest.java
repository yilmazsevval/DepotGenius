package com.depotgenius.dtos.login;

import lombok.Data;

@Data
public class LoginRequest {

	private String email;

	private String password;
}
