package com.example.project.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orders_id")
	private Long orderId;
	
	@NotNull
	@Column(name="orders_datetime")
	private Date ordersDatetime;
	
	@NotNull
	@Column(name="orders_cost")
	private double ordersCost;
	
	@NotNull
	@Column(name="orders_quantity")
	private int ordersQuantity;
	
	@NotNull
	@Column(name="orders_totalcost")
	private double ordersTotalcost;
	
	@NotNull
	@Column(name="person_id")
	private Long personId;
	
	 @ManyToMany(mappedBy = "orders")
	 List<Products> products;
	 
	 public Orders() {
		super();
	}

	public Orders(Long orderId, Date ordersDatetime, double ordersCost, int ordersQuantity, double ordersTotalcost,
			Long personId, List<Products> products) {
		super();
		this.orderId = orderId;
		this.ordersDatetime = ordersDatetime;
		this.ordersCost = ordersCost;
		this.ordersQuantity = ordersQuantity;
		this.ordersTotalcost = ordersTotalcost;
		this.personId = personId;
		this.products = products;
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

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	 	
}
