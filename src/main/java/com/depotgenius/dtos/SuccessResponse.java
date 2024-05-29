package com.depotgenius.dtos;

import com.depotgenius.core.exceptions.Messages;

import lombok.Data;

@Data
public class SuccessResponse {

	private String message = Messages.SUCCESSFULLY;

}
