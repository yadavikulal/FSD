package com.example.project.entity;

import java.sql.Date;
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
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orders_id")
	private Long orderId;

	@NotNull
	@Column(name = "orders_datetime")
	private Date ordersDatetime;

	@NotNull
	@Column(name = "orders_cost")
	private double ordersCost;

	@NotNull
	@Column(name = "orders_quantity")
	private int ordersQuantity;

	@NotNull
	@Column(name = "orders_totalcost")
	private double ordersTotalcost;
	
	@NotNull
	@Column(name = "person_role_id")
	private double personRoleId;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="orders_id")
	private List<ProductOrders> productOrders;

	public Orders() {
		super();
	}

	public Orders(Long orderId, @NotNull Date ordersDatetime, @NotNull double ordersCost, @NotNull int ordersQuantity,
			@NotNull double ordersTotalcost, @NotNull double personRoleId, List<ProductOrders> productOrders) {
		super();
		this.orderId = orderId;
		this.ordersDatetime = ordersDatetime;
		this.ordersCost = ordersCost;
		this.ordersQuantity = ordersQuantity;
		this.ordersTotalcost = ordersTotalcost;
		this.personRoleId = personRoleId;
		this.productOrders = productOrders;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getOrdersDatetime() {
		return ordersDatetime;
	}

	public void setOrdersDatetime(Date ordersDatetime) {
		this.ordersDatetime = ordersDatetime;
	}

	public double getOrdersCost() {
		return ordersCost;
	}

	public void setOrdersCost(double ordersCost) {
		this.ordersCost = ordersCost;
	}

	public int getOrdersQuantity() {
		return ordersQuantity;
	}

	public void setOrdersQuantity(int ordersQuantity) {
		this.ordersQuantity = ordersQuantity;
	}

	public double getOrdersTotalcost() {
		return ordersTotalcost;
	}

	public void setOrdersTotalcost(double ordersTotalcost) {
		this.ordersTotalcost = ordersTotalcost;
	}

	public double getPersonRoleId() {
		return personRoleId;
	}

	public void setPersonRoleId(double personRoleId) {
		this.personRoleId = personRoleId;
	}

	public List<ProductOrders> getProductOrders() {
		return productOrders;
	}

	public void setProductOrders(List<ProductOrders> productOrders) {
		this.productOrders = productOrders;
	}
	
}