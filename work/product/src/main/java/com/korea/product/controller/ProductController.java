package com.korea.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	
	 private ProductService service;
	 
	@Autowired
	public ProductController (ProductService service){
		this.service = service;
	}
//	- 요청을 DTO로 받는다.
//	- 서비스의 createProduct()를 호출한다
//	- 결과로 저장된 상품을 DTO로 반환한다.
	
//	@PostMapping
//	public ProductDTO createProduct(@RequestBody ProductTodo dto) {	
//	}
	
	
}
