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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private Long personId;
	
	@NotNull
	@Column(name="fist_name")
	private String firstName;
	
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotNull
	@Column(name="phone")
	private int phone;
	
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotNull
	@Column(name="password")
	private String password;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_id")
	private List<Address> addresses;

	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_id")
	private List<Products> products;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "person_id")
	private List<Orders> orders;

	@ManyToMany
	@JoinTable(
	  name = "person_roles", 
	  joinColumns = @JoinColumn(name = "person_id"), 
	  inverseJoinColumns = @JoinColumn(name = "role_id"))
	List<Roles> roles;

	public Person() {
		super();
	}

	public Person(Long personId, String firstName, String lastName, int phone, String email, String password,
			List<Address> addresses, List<Products> products, List<Orders> orders, List<Roles> roles) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.addresses = addresses;
		this.products = products;
		this.orders = orders;
		this.roles = roles;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	
}
