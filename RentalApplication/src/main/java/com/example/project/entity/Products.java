package com.example.project.entity;

import java.sql.Blob;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@Column(name="product_features")
	private Blob productFeatures;
	
	@NotNull
	@Column(name="person_id")
	private Long personId;
	
	@NotNull
	@Column(name = "category_id")
	private Long categoryId;
	
	@ManyToMany
	@JoinTable(
	  name = "product_orders", 
	  joinColumns = @JoinColumn(name = "product_id"), 
	  inverseJoinColumns = @JoinColumn(name = "order_id"))
	List<Orders> orders;

	public Products() {
		super();
	}

	public Products(Long productId, String productName, int productQuantity, String productDescription,
			double productPrice, Blob productFeatures, Long personId, Long categoryId, List<Orders> orders) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productFeatures = productFeatures;
		this.personId = personId;
		this.categoryId = categoryId;
		this.orders = orders;
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

	public Blob getProductFeatures() {
		return productFeatures;
	}

	public void setProductFeatures(Blob productFeatures) {
		this.productFeatures = productFeatures;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
}
