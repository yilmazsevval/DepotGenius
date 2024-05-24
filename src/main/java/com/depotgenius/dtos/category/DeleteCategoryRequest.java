package com.depotgenius.dtos.category;

import java.util.UUID;

import com.depotgenius.core.exceptions.Messages;

import jakarta.validation.constraints.NotNull;

public class DeleteCategoryRequest {

	@NotNull(message = Messages.CATEGORY_ID_CANNOT_BE_NULL)
	private UUID id;
}
