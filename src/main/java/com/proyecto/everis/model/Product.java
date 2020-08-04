package com.proyecto.everis.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class Product {
	
	private String id;	
	private String nameProduct;	
	private String typeProduct;

}
