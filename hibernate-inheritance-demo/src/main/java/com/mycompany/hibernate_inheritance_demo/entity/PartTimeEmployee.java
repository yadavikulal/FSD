package com.mycompany.hibernate_inheritance_demo.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("PartTimeEmployee")
public class PartTimeEmployee extends Employee {
	private int no_of_hours;
	

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, String email, long phone, int no_of_hours) {
		super(name, email, phone);
		this.no_of_hours = no_of_hours;
	}
}
