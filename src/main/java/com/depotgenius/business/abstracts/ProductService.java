package com.depotgenius.business.abstracts;

import java.util.UUID;

import com.depotgenius.dtos.product.AcceptProductRequest;
import com.depotgenius.dtos.product.CreateProductRequest;
import com.depotgenius.dtos.product.DeleteProductRequest;
import com.depotgenius.dtos.product.SaleProductRequest;
import com.depotgenius.dtos.product.UpdateProductRequest;
import com.depotgenius.entities.concretes.Product;

public interface ProductService {

	Product create(CreateProductRequest createProductRequest);

	Product update(UpdateProductRequest updateProductRequest);

	void delete(DeleteProductRequest deleteProductRequest);

	void acceptProduct(AcceptProductRequest acceptProductRequest);

	void saleProduct(SaleProductRequest saleProductRequest);

	Product getProduct(UUID productId);
}
