package com.depotgenius.entities.concretes;

import com.depotgenius.entities.abstracts.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shelf")
@EqualsAndHashCode(callSuper = true)
public class Shelf extends BaseEntity {

	@Column(name = "count")
	private int count;

	@Column(name = "capacity")
	private int capacity;

	@ManyToOne // foreignkey değil mi?
	private Product product;
}
