package com.korea.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.user.model.UserEntity;
import com.korea.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;   

@Slf4j

@Service
@RequiredArgsConstructor

public class UserService {

	private final UserRepository repository;
	
	// 유저 생성
	public List<UserEntity> create(UserEntity entity){
		
		//유효성검사
	    if (entity == null) {
	        throw new RuntimeException("Entity cannot be null");
	    }
	    if (entity.getEmail() == null) {
	        throw new RuntimeException("Unknown user");
	    }
	    
	    
	    repository.save(entity);
	    
	    return repository.findAll();
	}
	
	// 모든 유저 조회
	public List<UserEntity> getAllUsers() {
		return repository.findAll();
		
	}

	//이메일을 통한 사용자 검색
	public List<UserEntity> getUserByEmail(String email) {
		return repository.findByEmail(email);
		
	}
	
	//ID를 통해 이름과 이메일 수정하기
//	public List<UserEntity> updateUser() {
//		
//	    
//	   
//	}
	
	// 해당 ID를 가진 유저 삭제
//	public List<UserEntity> deleteUser() {
//		
//		
//		
//	}
	
	
	
	
	
	
	
	
}
