package collection;

public class UserInfo {
	
	private String id;
	private int pwd;
	
	public UserInfo() {

	}
	
	@Override
	public String toString() {
	    return "유저 정보 id= '" + id + "', pwd= " + pwd;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	
	public String getId() {
	    return id;
	}
	
	public int getPwd() {
		return pwd;
	}
	
}
