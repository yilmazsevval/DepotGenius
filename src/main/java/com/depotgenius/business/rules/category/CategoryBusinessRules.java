package com.depotgenius.business.rules.category;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.depotgenius.core.exceptions.BusinessException;
import com.depotgenius.core.exceptions.Messages;
import com.depotgenius.dataAccess.CategoryRepository;

@Service
public class CategoryBusinessRules {

	@Autowired
	private CategoryRepository categoryRepository;

	public void checkIfCategoryNameExists(String name) {
		if (categoryRepository.existsByCategoryName(name)) {
			throw new BusinessException(Messages.CATEGORY_NAME_ALREADY_EXISTS);
		}
	}

	public void checkIfByIdExists(UUID id) {
		if (!categoryRepository.existsById(id)) {
			throw new BusinessException(Messages.CATEGORY_ID_NOT_FOUND);
		}
	}
}
