package com.depotgenius.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.depotgenius.dtos.category.CreateCategoryRequest;
import com.depotgenius.dtos.category.GetAllCategoryResponse;
import com.depotgenius.dtos.category.UpdateCategoryRequest;
import com.depotgenius.entities.concretes.Category;

public interface CategoryService {

	Category create(CreateCategoryRequest createCategoryRequest);

	Category update(UpdateCategoryRequest updateCategoryRequest);

	void delete(UUID id);

	Category getCategory(UUID categoryId);

	List<GetAllCategoryResponse> getAll();
}
