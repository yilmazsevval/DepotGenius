package com.depotgenius.business.concretes;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depotgenius.business.abstracts.CategoryService;
import com.depotgenius.business.rules.category.CategoryBusinessRules;
import com.depotgenius.core.config.mappers.ModelMapperService;
import com.depotgenius.core.exceptions.BusinessException;
import com.depotgenius.core.exceptions.Messages;
import com.depotgenius.dataAccess.CategoryRepository;
import com.depotgenius.dtos.category.CreateCategoryRequest;
import com.depotgenius.dtos.category.GetAllCategoryResponse;
import com.depotgenius.dtos.category.UpdateCategoryRequest;
import com.depotgenius.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private CategoryBusinessRules categoryBusinessRules;

	@Autowired
	private ModelMapperService modelMapperService;

	@Override
	public Category create(CreateCategoryRequest createCategoryRequest) {
		categoryBusinessRules.checkIfCategoryNameExists(createCategoryRequest.getCategoryName());
		Category category = modelMapperService.forRequest().map(createCategoryRequest, Category.class);
		return categoryRepository.save(category);
	}

	@Override
	public Category update(UpdateCategoryRequest updateCategoryRequest) {
		categoryBusinessRules.checkIfCategoryNameExists(updateCategoryRequest.getCategoryName());
		Category category = getCategory(updateCategoryRequest.getId());
		category.setCategoryName(updateCategoryRequest.getCategoryName());
		return categoryRepository.save(category);
	}

	@Override
	public void delete(UUID id) {
		Category category = getCategory(id);
		categoryRepository.save(category);

	}

	@Override
	public Category getCategory(UUID categoryId) {
		Optional<Category> oCategory = categoryRepository.findById(categoryId);
		Category category = null;
		if (oCategory.isPresent()) {
			category = oCategory.get();
		} else {
			throw new BusinessException(Messages.CATEGORY_ID_NOT_FOUND);
		}
		return category;
	}

	@Override
	public List<GetAllCategoryResponse> getAll() {
		List<Category> categories = categoryRepository.findAll(); // veritabanındaki tüm kategorileri çekip, kategori
																	// değişkenine atadık
		if (categories.isEmpty())
			throw new BusinessException(Messages.CATEGORY_IS_NOT_AVAILABLE);
		List<GetAllCategoryResponse> response = categories.stream()
				.map(category -> modelMapperService.forResponse().map(category, GetAllCategoryResponse.class)).toList();
		return response;

	}
}
