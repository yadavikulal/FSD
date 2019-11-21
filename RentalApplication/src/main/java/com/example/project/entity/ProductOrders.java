package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product_orders")
public class ProductOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_orders_id")
	private Long productOrdersId;
	
	@NotNull
	@Column(name = "product_id")
	private Long productId;
	
	@NotNull
	@Column(name = "orders_id")
	private Long ordersId;

	public ProductOrders() {
		super();
	}

	public ProductOrders(Long productOrdersId, @NotNull Long productId, @NotNull Long ordersId) {
		super();
		this.productOrdersId = productOrdersId;
		this.productId = productId;
		this.ordersId = ordersId;
	}

	public Long getProductOrdersId() {
		return productOrdersId;
	}

	public void setProductOrdersId(Long productOrdersId) {
		this.productOrdersId = productOrdersId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}
	

}
	