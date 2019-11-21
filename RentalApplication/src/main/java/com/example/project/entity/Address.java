package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Long addressId;
	
	@NotNull
	@Column(name="door_no")
	private int doorNo;
	
	@NotNull
	@Column(name = "area")
	private String area;
	
	@NotNull
	@Column(name = "village")
	private String village;

	@NotNull
	@Column(name = "city")
	private String city;
	
	@NotNull
	@Column(name = "state")
	private String state;
	
	@NotNull
	@Column(name="pincode")
	private long pincode;

	@NotNull
	@Column(name="person_role_id")
	private Long personRoleId;
	
	public Address() {
		super();
	}

	public Address(Long addressId, @NotNull int doorNo, @NotNull String area, @NotNull String village,
			@NotNull String city, @NotNull String state, @NotNull long pincode, @NotNull Long personRoleId) {
		super();
		this.addressId = addressId;
		this.doorNo = doorNo;
		this.area = area;
		this.village = village;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.personRoleId = personRoleId;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Long getPersonRoleId() {
		return personRoleId;
	}

	public void setPersonRoleId(Long personRoleId) {
		this.personRoleId = personRoleId;
	}

}
