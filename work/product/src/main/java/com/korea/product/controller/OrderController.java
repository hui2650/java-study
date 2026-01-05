package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.OrderDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.entity.ProductEntity;
import com.korea.product.service.OrderService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(originPatterns = "*", allowCredentials = "false")

@RequiredArgsConstructor

@RestController
@RequestMapping("orders")
public class OrderController {
	
	private final OrderService orderService;
	
	@GetMapping
	public ResponseEntity<?> getAllOrderTotals(){
		List<OrderDTO> list = orderService.getAllOrderTotalPrices();
		
		ResponseDTO<OrderDTO> response = ResponseDTO.<OrderDTO>builder()
							.data(list)
							.build();
		// http 200코드와 함께 body에 실린 응답(response)를 실어서 보낸다
		return ResponseEntity.ok(response);
	}
	
	@PostMapping
	public ResponseEntity<?> saveOrder(@RequestBody OrderDTO dto){
		
		
		
		List<OrderDTO> list = orderService.save(dto);
		
		ResponseDTO<OrderDTO> response = ResponseDTO.<OrderDTO>builder()
							.data(list)
							.build();
		// http 200코드와 함께 body에 실린 응답(response)를 실어서 보낸다
		return ResponseEntity.ok(response);
		
	}
	
}
