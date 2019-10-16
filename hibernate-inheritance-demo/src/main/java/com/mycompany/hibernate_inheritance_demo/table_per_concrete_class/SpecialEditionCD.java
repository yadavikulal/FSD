package com.mycompany.hibernate_inheritance_demo.table_per_concrete_class;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "secd")
@Data
@EqualsAndHashCode(callSuper = false)
@AttributeOverrides({

	@AttributeOverride(name = "title",column = @Column(name="title")),
	@AttributeOverride(name = "artist",column = @Column(name="artist")),
	@AttributeOverride(name = "purchaseDate",column = @Column(name="purchaseDate")),
	@AttributeOverride(name = "cost",column = @Column(name="cost")),
	
	
	
})
public class SpecialEditionCD extends CD {
	private String newfeatures;

	public SpecialEditionCD() {
		super();
	}

	public SpecialEditionCD(String title, String artist, Date purchaseDate, double cost, String features) {
		super(title, artist, purchaseDate, cost);
		newfeatures = features;
	}
}