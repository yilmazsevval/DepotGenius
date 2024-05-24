package com.depotgenius.business.concretes;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depotgenius.business.abstracts.CategoryService;
import com.depotgenius.dataAccess.CategoryRepository;
import com.depotgenius.dtos.category.CreateCategoryRequest;
import com.depotgenius.dtos.category.DeleteCategoryRequest;
import com.depotgenius.dtos.category.UpdateCategoryRequest;
import com.depotgenius.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category create(CreateCategoryRequest createCategoryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(UpdateCategoryRequest updateCategoryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DeleteCategoryRequest deleteCategoryRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category getCategory(UUID categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
