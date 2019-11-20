package com.example.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_id")	
	private Long categoryId;
	
	@NotNull
	@Column(name="category_type")
	private String categoryType;
	
	@OneToMany(fetch = FetchType.LAZY,  cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "category_id")
	private List<Products> products;

	public Category(Long categoryId, String categoryType, List<Products> products) {
		super();
		this.categoryId = categoryId;
		this.categoryType = categoryType;
		this.products = products;
	}

	public Category() {
		super();
	}
	
	public Long getCategoryId() {
		return categoryId;
	}

	public void setAddressId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
}
