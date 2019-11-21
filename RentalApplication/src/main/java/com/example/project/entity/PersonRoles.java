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
@Table(name = "person_roles")
public class PersonRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_role_id")
	private Long personRoleId;
	
	@NotNull
	@Column(name = "person_id")
	private Long personId;
	
	@NotNull
	@Column(name = "role_id")
	private Long roleId;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_role_id")
	private List<Address> addresses;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_role_id")
	private List<Products> products;

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_role_id")
	private List<Orders> orders;

	public PersonRoles() {
		super();
	}

	public PersonRoles(Long personRoleId, @NotNull Long personId, @NotNull Long roleId, List<Address> addresses,
			List<Products> products, List<Orders> orders) {
		super();
		this.personRoleId = personRoleId;
		this.personId = personId;
		this.roleId = roleId;
		this.addresses = addresses;
		this.products = products;
		this.orders = orders;
	}

	public Long getPersonRoleId() {
		return personRoleId;
	}

	public void setPersonRoleId(Long personRoleId) {
		this.personRoleId = personRoleId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
}
