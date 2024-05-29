package com.depotgenius.dtos.category;

import java.util.List;
import java.util.UUID;

import com.depotgenius.dtos.product.GetAllProductResponse;

import lombok.Data;

@Data
public class GetAllCategoryResponse {

	private UUID id;

	private String name;

	private List<GetAllProductResponse> products;
}
