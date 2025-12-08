package com.korea.product.dto;

import com.korea.product.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductDTO {
//	- int id
//	- String name
//	- int stock
//	- String description'
	int id;
	String name;
	int price;
	int stock;
	String description;
	
	  // Entity → DTO
    public ProductDTO(ProductDTO entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.stock = entity.getStock();
        this.description = entity.getDescription();
    }
    
    public static ProductEntity toEntity(ProductDTO dto) {
    	
		return ProductEntity.builder()
                .id(dto.getId())        
                .name(dto.getName())
                .stock(dto.getStock())
                .description(dto.getDescription())
                .build();
	}
}
	
