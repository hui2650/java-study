package com.korea.layer.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.persistence.TodoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // (Simple Logging Facade for java) 로그를 작성하는 표준 인터페이스 제공
@Service
// 스프링 프레임 워크에서 제공하는 어노테이션중 하나로 서비스 레이어에
// 사용되는 클래스를 명시할때 사용
// 이 어노테이션을 사용하면 스프링부트가 해당 클래스를 스프링 컨테이너에서 
// 관리하는 빈(bean)으로 등록하고, 비즈니스 로직을 처리하는 역할을 맡는다.

@RequiredArgsConstructor
public class TodoService {
	

	// TodoRepository를 생성자 주입 받기
	private final TodoRepository repository;
	
	public String testService() {
		// build 패턴으로 TodoEntity 객체를 하나 만든다
		// title : My first Todo item
		TodoEntity entity = TodoEntity.builder()
				.title("My first Todo item")
				.build();
		
		// TodoEntity를 db에 저장하기
		repository.save(entity);	
		// 저장된 데이터 찾기
		// findById의 반환형 Optional
		// Optional "null"이 들어올 수 있는 값을 안전하게 감싸는 박스
		// 값이 있으면 예외 발생, 값이 없으면 정상반환
		TodoEntity saveEntity = repository.findById(entity.getId())
			.orElseThrow(()-> new RuntimeException("데이터 없음"));
		return saveEntity.getTitle();
	}
	
	public List<TodoEntity> create(TodoEntity entity) {

		validate(entity);
		
		// 2. db에 저장한다.
		repository.save(entity);
		log.info("Entity Id : {} is saved", entity.getId());
		
		// 3. 해당 유저가 추가한 todo item을 모두 조회하여 반환 (1건이 아닐수도 있음)
		return repository.findByUserId(entity.getUserId());
		
	}
	
	public List<TodoEntity> retrieve(String userId) {
		 //db에서 모든 데이터를 꺼내서 반환하는 retrieve메서드 작성하기
		 //findByUserId() 메서드 활용하기
		 List<TodoEntity> entities = repository.findByUserId(userId);
		
		 return entities;
	}
	
	public List<TodoEntity> update(TodoEntity entity){
		
		//controller에서 넘어온 id와 title을 받아서 findById() db에서 한 건을 꺼낸다
		
		validate(entity);

		// 넘겨받은 entity의 id를 이용해 TodoEntity 한 건을 db로부터 가져온다
		// 존재하지 않는 엔티티는 업데이트 할 수 없기 때문에
		
		Optional<TodoEntity> original = repository.findById(entity.getId());
		
		if(original.isPresent()) {
			// 오리지널의 내용을 가져옴
			TodoEntity todo = original.get();
			
			// 사용자가 전달한 제목과 boolean값으로 다시 세팅
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());

			repository.save(todo);
		}
		
		return retrieve(entity.getUserId());
	}
	
	public List<TodoEntity> delete(TodoEntity entity) {
		
		validate(entity);
		
		Optional<TodoEntity> original = repository.findById(entity.getId());

	    if (!original.isPresent()) {
	        throw new RuntimeException("Todo not found");
	    }
		
		repository.deleteById(entity.getId());
		
		return retrieve(entity.getUserId());
		
	}
	
	//공통 검사 함수 분리
	private void validate(final TodoEntity entity) {
		// 매개변수로 넘어온 Entity가 유효(Null인지 아닌지)한지 검사한다
		// null 이면 RunTimeException("Entity cannot be null")
		
	    if (entity == null) {
	        throw new RuntimeException("Entity cannot be null");
	    }
	    if (entity.getUserId() == null) {
	        throw new RuntimeException("Unknown user");
	    }
	}
	
	

}

