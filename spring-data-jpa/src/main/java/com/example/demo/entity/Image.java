package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="image")
@Data
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="image_id")
	private int image_id;
	
	@Column(name="type")
	private String type;
	
	@Column(name="url")
	private String url;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="album_id")
	private Album album;

}