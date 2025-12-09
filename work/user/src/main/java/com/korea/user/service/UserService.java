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
		validate(entity);
	    
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
	public List<UserEntity> updateUser(UserEntity entity) {
		
		//유효성검사
		validate(entity);
		
		// 유저 찾기
		UserEntity target = repository.findById(entity.getId())
		        .orElseThrow(() -> new RuntimeException("User not found"));

		    // 수정할 값 반영 (이름, 이메일만 수정)
		    target.setName(entity.getName());
		    target.setEmail(entity.getEmail());

		    // 저장
		    repository.save(target);

		    //수정 후 전체 목록 리턴
		    return repository.findAll();
	   
	}
	
	// 해당 ID를 가진 유저 삭제	public boolean deleteUser(int id) {
		
		if (!repository.existsById(id)) {
	        return false;
	    }
	    repository.deleteById(id);
	    return true;
	}
	
	private void validate(final UserEntity entity) {
	    if (entity == null) {
	        throw new RuntimeException("Entity cannot be null");
	    }
	    if (entity.getEmail() == null) {
	        throw new RuntimeException("Unknown user");
	    }
	}

}


	
	

