package sec03.exam01_parent_constructor_call.copy;

public class People {
	public String name;
	public String ssn;
	
	public People() {
		System.out.println("부모객체기본생성자");
	}
	
	//생성자
	public People(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
		
		System.out.println("부모객체 생성완료");
	}
}
