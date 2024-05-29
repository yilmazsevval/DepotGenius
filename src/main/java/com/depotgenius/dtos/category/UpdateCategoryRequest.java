package com.depotgenius.dtos.category;

import java.util.UUID;

import com.depotgenius.core.exceptions.Messages;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UpdateCategoryRequest {

	@NotNull(message = Messages.CATEGORY_ID_CANNOT_BE_NULL)
	private UUID id;

	@NotNull(message = Messages.CATEGORY_NAME_CANNOT_BE_NULL)
	@NotBlank(message = Messages.CATEGORY_NAME_CANNOT_BE_BLANK)
	@Size(min = 3, message = Messages.CATEGORY_NAME_TOO_SHORT)
	private String categoryName;
}
