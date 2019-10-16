package com.mycompany.hibernate_inheritance_demo.entity;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("FullTimeEmployee")
public class FullTimeEmployee extends Employee {
	private double bonus;

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String name, String email, long phone, double bonus) {
		super(name, email, phone);
		this.bonus = bonus;
	}
}

