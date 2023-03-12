package Exercise.Member;
//현실세계의 회원을 Member클래스로 모델링 
public class Member {
	//필드 - 회원의 데이터
	String name;
	String id;
	String password;
	int age;
	
	//생성자추가 : name필드와 id필드를 외부에서 받은 값으로 초기화 
	public Member(String name,String id) {
		this.name = name;
		this.id = id;
	}
	
}
