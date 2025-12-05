package com.korea.product.service;

import org.springframework.stereotype.Service;

import com.korea.product.entity.ProductEntity;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

@RequiredArgsConstructor
public class ProductService {
//	- 상품 등록 로직을 작성한다.
//	- name이 null 또는 빈 문자열이면 예외 발생
//	- price < 0 예외
//	- stock <0 예외
//	- 검증에 통과하면 Repository를 이용해 저장
	private final ProductRepository repository;
	
	public ProductEntity createProduct(ProductEntity entity){
		
		if(entity.getName() == null || entity.getName() == "") {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}
		
		if(entity.getPrice() < 0) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}
		
		if(entity.getStock() < 0) {
			log.warn("Entity cannot be null.");
			throw new RuntimeException("Entity cannot be null");
		}
		
		ProductEntity saved = repository.save(entity);
		log.info("Product saved.");
		
		 return saved;
		
	}

}
