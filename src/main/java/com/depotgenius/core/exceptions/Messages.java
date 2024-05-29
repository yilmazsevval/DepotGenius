package com.depotgenius.core.exceptions;

public record Messages() {

	public static final String SUCCESSFULLY = "Successfully";

	// Category Messages
	public static final String CATEGORY_NAME_CANNOT_BE_NULL = "Category name cannot be null";
	public static final String CATEGORY_NAME_CANNOT_BE_BLANK = "Category name cannot be blank";
	public static final String CATEGORY_NAME_TOO_SHORT = "Category name can be minimum three characters";
	public static final String CATEGORY_ID_CANNOT_BE_NULL = "Category id cannot be null";
	public static final String CATEGORY_NAME_ALREADY_EXISTS = "Category name already exists";
	public static final String CATEGORY_ID_NOT_FOUND = "Category id not found";
	public static final String CATEGORY_IS_NOT_AVAILABLE = "Category is not available";
}
