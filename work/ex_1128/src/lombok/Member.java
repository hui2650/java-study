package lombok;

@Getter
@Setter
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 갖는 생성자
@RequiredArgsConstructor //NonNall, final 로 지정된 생성자만 받는다

@Data //getter, setter, requireArgsConstructor를 한번에 지정해주는 어노테이션
@Builder 

public class Member {
	@NonNull
	private Long id;
	private String name;
	private String email;
	
	//기본생성자
	
//	public Member() {
//		
//	}
	
	//필드를 초기화하는 생성자
	
//	public Member(Long id, String name, String email) {
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}
	
	//getter & setter
	
//	public Long getId() {
//		return id;
//	}
//	public Long setId(Long id) {
//		return this.id = id;
//	}
//	
//	
//	public String getName() {
//		return name;
//	}
//	public String setName(String name) {
//		return this.name = name;
//	}
//	
//	
//	public String getEmail() {
//		return email;
//	}
//	public String setEmail(String email) {
//		return this.email = email;
//	}
	
}
