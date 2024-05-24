package com.depotgenius.business.abstracts;

import java.util.UUID;

import com.depotgenius.entities.concretes.Category;

public interface CategoryService extends BaseService<Category> {

	Category getCategory(UUID categoryId);
}
