package com.korea.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.product.dto.OrderDTO;
import com.korea.product.entity.ProductEntity;
import com.korea.product.model.OrderEntity;
import com.korea.product.persistence.OrderRepository;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;
	
	//주문내역 조회하기
	public List<OrderDTO> getAllOrderTotalPrices(){
		List<Object[]> results = orderRepository.findAllOrderTotalPrices();
		//To
		return OrderDTO.toListOrderDTO(results);
	}
	
	// 주문하기
	public List<OrderDTO> save(OrderDTO dto){
		//productId, productCount
		
		// 1. 상품의 존재 여부 먼저 확인
		ProductEntity option = productRepository.findById(dto.getProductId())
				.orElseThrow(()-> new RuntimeException("상품이 존재하지 않습니다"));
		
		// 2. 재고가 있는지 확인
		if(productEntity.getStock() < dto.getProductCount()) {
			new RuntimeException("재고가 부족합니다, 현재 재고 : " + ProductEntity.getStock());
		}
		
		// 주문하기
		OrderEntity order = OrderEntity.builder()
							.product(productEntity)
							.productCount(dto.getProductCount())
							.build();
		
		orderRepository.save(order);
		
		
		
	}
}
