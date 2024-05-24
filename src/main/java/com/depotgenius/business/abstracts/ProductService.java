package com.depotgenius.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.depotgenius.dtos.product.ProductItemDTO;
import com.depotgenius.entities.concretes.Product;

public interface ProductService extends BaseService<Product> {

	void acceptProduct(UUID id);

	void saleProduct(List<ProductItemDTO> productItems, UUID costumerId, UUID userId);

	Product getProduct(UUID productId);
}
