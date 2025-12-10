package com.korea.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.entity.ProductEntity;
import com.korea.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	 private ProductService service;
	 
	public ProductController (ProductService service){
		this.service = service;
	}
		@PostMapping("/create")	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto) {	
				ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.createProduct(entity);
		
		List<ProductDTO> dtos = entities.stream()
				.map(ProductDTO::new)
				.toList();
		
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
				.data(dtos)
				.build();
		
		return ResponseEntity.ok(response);
	}

	@GetMapping("/read")
	public ResponseEntity<?> getAllProduct() {
		
//		ProductEntity entity = ProductDTO.toEntity();
		List<ProductEntity> entities = service.getAllProduct();
		
		List<ProductDTO> dtos = entities.stream()
								.map(ProductDTO::new)
								.toList();
		
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
										.data(dtos)
										.build();
		
		return ResponseEntity.ok(response);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProduct(@PathVariable("id") int id, @RequestBody ProductDTO dto){
		
		// dto -< entity 변환
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		entity.setId(id);
		
		List<ProductEntity> entities = service.updateProduct(entity);
		
		List<ProductDTO> dtos = entities.stream()
								.map(ProductDTO::new)
								.toList();
		
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
				.data(dtos)
				.build();

		return ResponseEntity.ok(response);
	}
	
	 @DeleteMapping("/{id}")
	 public ResponseEntity<?> deleteProduct(@PathVariable("id") int id){
		 
		 List<ProductEntity> entities = service.deleteProduct(id);
		 List<ProductDTO> dtos = entities.stream()
					.map(ProductDTO::new)
					.toList();

		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
			.data(dtos)
			.build();

		return ResponseEntity.ok(response);

	 }
	
	
	
	
	
}
