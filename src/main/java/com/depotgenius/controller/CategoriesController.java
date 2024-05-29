package com.depotgenius.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.depotgenius.business.abstracts.CategoryService;
import com.depotgenius.dtos.SuccessResponse;
import com.depotgenius.dtos.category.CreateCategoryRequest;
import com.depotgenius.dtos.category.GetAllCategoryResponse;
import com.depotgenius.dtos.category.UpdateCategoryRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/category")
public class CategoriesController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/create")
	public SuccessResponse create(@Valid @RequestBody CreateCategoryRequest request) {
		categoryService.create(request);
		return new SuccessResponse();
	}

	@PostMapping("/update")
	public SuccessResponse update(@Valid @RequestBody UpdateCategoryRequest request) {
		categoryService.update(request);
		return new SuccessResponse();
	}

	@PostMapping("/delete")
	public SuccessResponse delete(@Valid @RequestBody UUID id) {
		categoryService.delete(id);
		return new SuccessResponse();
	}

	@GetMapping("/getall")
	public List<GetAllCategoryResponse> getAll() {
		return categoryService.getAll();
	}
}
