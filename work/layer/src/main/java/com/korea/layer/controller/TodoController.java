package com.korea.layer.controller;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.dto.TodoDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.service.TodoService;

import lombok.Builder;

@RestController
@RequestMapping("todo")

public class TodoController {
	//해야할 일 api 만들 것이다.
	
	@Autowired
	// 필드 주입
	// 스트링 컨테이너가 TodoService타입의 빈을 찾아서 service 필드에 넣어준다
	private TodoService service; //참조타입 기본값은 null
	
	// 생성자 주입
	public TodoController(TodoService service) {
		this.service = service;
	}
	
	// setter 주입
	// Setter를 통해 주입하는 방식이다
	// Setter를 public으로 열어두면 외부에서 의도치않게 다른 객체를 다시 넣어버릴 수도 있다
	// 객체 생명주기 중간에 의존성이 바뀔 수도 있어서 코드 추적이 힘들어질 수 있다
	public void setService(TodoService service) {
		this.service = service;
	}
	
	// localhost:8080/todo/test
	@GetMapping("/test")
	public ResponseEntity<?> testTodo() {
		
		// 스프링부트가 @Component가 달려잇는 클래스를 스캔해서
		// (ComponentScan) Map 형태로 객체를 컨테이너에 저장한다
		String str = service.testService();
		List<String> list = new ArrayList<String>();
		list.add(str);
		ResponseDTO<String> response = ResponseDTO.<String>builder()
				.data(list)
				.build();
		return ResponseEntity.ok().body(response);
		
	}
	
	// 생성하기
	@PostMapping("/createTodo")
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			// 로그인 기능이 없기 때문에 임시 유저
			String tmporaryUserId = "tmporary-user";
			
			// DTO -> Entity
			TodoEntity entity = TodoDTO.toEntity(dto);
			
			// 엔티티가 새로운 데이터임을 보장
			entity.setId(null);
			
			//엔티티에 임시 유저 아이디 세팅
			entity.setUserId(tmporaryUserId);
			
			// 서비스  레이어의 create메서드를 호출해서, TodoEntity를 데이터베이스에 저장하는 작업을 한다
			// 저장을 한 다음 TodoEntity 객체들을 저장한 List를 반환한다

			//DB 저장하고 해당 유저의 전체 Todo 리스트 받아오기
			List<TodoEntity> entities = service.create(entity);
			
			// 리스트 안에 들어있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos에 넣는다
			List<TodoDTO> dtos = new ArrayList<>();
			
			for(TodoEntity e : entities) {
				dtos.add(new TodoDTO(e)); // entity를 dto로 바꿔서 리스트에 추가
			}
			
			// builder 패턴을 이용해서 dtos를 ResponseDTO에 담아서 ResponseEntity로 반환한다
			
	        ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
	                .data(dtos)
	                .build();
	        return ResponseEntity.ok().body(response);

		} catch (Exception e) {
			String error = e.getMessage();
			
	        ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
	                .error(error)
	                .build();
	        return ResponseEntity.ok().body(response);
	        
		}
	}
	
	//조회하기
	@GetMapping("/retrieve")
	public ResponseEntity<?> retrieveTodoList() {
		   //어떤 한 유저가 만든 할일에 대해서 모두 조회
		   //임시유저 : tmporary-user
		
		String tmporaryUserId = "tmporary-user";
		
		// 서비스 호출 → 해당 유저의 전체 TodoList를 반화받아 entities리스트에 저장한다
        List<TodoEntity> entities = service.retrieve(tmporaryUserId);
		
        // List에 들어있는 Entity들을 DTO로 변환한다 / Entity → DTO 변환
        
        List<TodoDTO> dtos = new ArrayList<TodoDTO>();
        
        for (TodoEntity e : entities) {
            dtos.add(new TodoDTO(e));
        }      
        
        // ResponseDTO 객체에 담는다
        ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
        		.data(dtos)
        		.build();
       
        // ResponseEntity로 반환한다
		return ResponseEntity.ok().body(response);
		
	}
	
	//할일을 수정하기 위한 updateTodo메서드 작성하기
	//수정하려는 내용을 사용자로부터 받아서 처리
	
	  //임시유저 "temporary-user"
	   //update from Todo set title="수정할내용" where id = ??
	   //id와 title을 받아야함

//		DTO → TodoEntity
//		service.update(entity) 호출
//		이때 entity.getId()로 어떤 Todo인지 찾음
//		기존 데이터를 DB에서 꺼내서, 수정된 값으로 덮어쓰기
//		저장
//		해당 user의 전체 리스트 다시 조회
//		List<Entity> → List<DTO>
//		ResponseDTO로 감싸서 ResponseEntity로 반환
	
	// 수정하기
	@PutMapping
	public ResponseEntity<?> updateTodo(@RequestBody TodoDTO dto) {
		
		String tmporaryUserId = "tmporary-user";
		
		// DTO -> Entity 변환
		TodoEntity entity = TodoDTO.toEntity(dto);
		
		//// 먼저 이 Todo가 어떤 유저의 데이터인지 알려주고
		entity.setUserId(tmporaryUserId);
		
		// 그 다음 서비스 호출
		List<TodoEntity> entities = service.update(entity);
		
		List<TodoDTO> dtos = new ArrayList<TodoDTO>();
		
        for (TodoEntity e : entities) {
            dtos.add(new TodoDTO(e));
        }      
        
        ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
        		.data(dtos)
        		.build();
       
		return ResponseEntity.ok().body(response);        
		
	}
	
	//삭제하기
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTodo(@RequestBody TodoDTO dto){
		
		String tmporaryUserId = "tmporary-user";
		
		// DTO -> Entity 변환
		TodoEntity entity = TodoDTO.toEntity(dto);
		
			entity.setUserId(tmporaryUserId);
		
			List<TodoEntity> entities = service.delete(entity);
			
			List<TodoDTO> dtos = new ArrayList<TodoDTO>();
		        
		        for (TodoEntity e : entities) {
		            dtos.add(new TodoDTO(e));
		        }      
		        
		        // ResponseDTO 객체에 담는다
		        ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder()
		        		.data(dtos)
		        		.build();
		       
		        // ResponseEntity로 반환한다
				return ResponseEntity.ok().body(response);
	}
	
	
	

}
