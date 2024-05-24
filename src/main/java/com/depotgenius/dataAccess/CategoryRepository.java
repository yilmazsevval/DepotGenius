package com.depotgenius.dataAccess;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.depotgenius.entities.concretes.Category;

public interface CategoryRepository extends JpaRepository<Category, UUID>, JpaSpecificationExecutor<Category> {

	List<Category> findAll();

	boolean existsByCategoryName(String name);

	boolean existsById(UUID id);
}
