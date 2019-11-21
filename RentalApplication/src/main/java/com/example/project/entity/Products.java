package com.example.project.entity;
import java.sql.Blob;
import java.util.List;

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
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	
	@NotNull
	@Column(name="product_name")
	private String productName;
	
	@NotNull
	@Column(name="product_quantity")
	private int productQuantity;
	
	@NotNull
	@Column(name="product_description")
	private String productDescription;
	
	@NotNull
	@Column(name="product_price")
	private double productPrice;
	
	@NotNull
	@Column(name="product_images")
	private Blob productImages;
	
	@NotNull
	@Column(name="person_role_id")
	private Long personRoleId;
	
	@NotNull
	@Column(name = "category_id")
	private Long categoryId;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private List<ProductOrders> productOrders;
	
	public Products() {
		super();
	}

	public Products(Long productId, String productName, int productQuantity, String productDescription,
			double productPrice, Blob productImages, Long personRoleId, Long categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productImages = productImages;
		this.personRoleId = personRoleId;
		this.categoryId = categoryId;
	}
	

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Blob getProductImages() {
		return productImages;
	}

	public void setProductImages(Blob productImages) {
		this.productImages = productImages;
	}

	public Long getPersonId() {
		return personRoleId;
	}

	public void setPersonId(Long personRoleId) {
		this.personRoleId = personRoleId;
	}
}
