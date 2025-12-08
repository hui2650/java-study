package com.korea.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.user.dto.UserDTO;
import com.korea.user.model.UserEntity;
import com.korea.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

@RequestMapping("user")
public class UserController {
	
	private final UserService service;
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserDTO dto){
		
		// DTO -> Entity
		UserEntity entity = UserDTO.toEntity(dto);
				
		//DB 저장후 해당 유저의 entity 리스트 받아오기
		List<UserEntity> entities = service.create(entity);
		
		List<UserDTO> dtos = new ArrayList<>();
		
		for(UserEntity e : entities) {
			dtos.add(new UserDTO(e));
		}
		
		return ResponseEntity.ok().body(dtos);

	}
	
	//UserController
	//메서드명
	//getAllUsers()
	//HTTP메서드 : GET
	
	
	//모든 사용자 조회
	@GetMapping("/read")
	public ResponseEntity<?> getAllUsers(UserDTO dto){
		
		 List<UserEntity> users = service.getAllUsers();
		    return ResponseEntity.ok(users);
	}
	
	// 이메일을 통한 사용자 검색
	@GetMapping("/{email}")
	public ResponseEntity<?> getUserByEmail(@PathVariable("email") String email){
				
		List<UserEntity> entities = service.getUserByEmail(email);
		
		List<UserDTO> dtos = new ArrayList<>();
		
		for(UserEntity e : entities) {
			dtos.add(new UserDTO(e));
		}
		
		return ResponseEntity.ok().body(dtos);
		
	}
	
	//ID를 통해 이름과 이메일 수정하기
//	@PutMapping
//	public ResponseEntity<?> updateUser(){
//		
//	}
	
//	@DeleteMapping("/{id}")
	//삭제에 성공하면 "User deleted successfully"
	//실패하면 .status(404).body("user not found with id " + id)
//	public ResponseEntity<?> deleteUser(){
//		
//	}
	
	
	
	
	
	
	
	
	
	
}
