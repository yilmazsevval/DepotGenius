package com.depotgenius.entities.concretes;

import java.util.List;

import com.depotgenius.entities.abstracts.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@OneToMany(mappedBy = "product")
	private List<Shelf> shelfs;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "sale_price")
	private double salePrice;

	@Column(name = "brand")
	private String brand;
}
