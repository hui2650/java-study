package com.korea.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class ProductEntity {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increment
//	- int id pk, 자동증가
//	- String name
//	- int price
//	- int stock
//	- String description
	private int id;
    private String name;
    private int price;
    private int stock;
    private String description;

}
