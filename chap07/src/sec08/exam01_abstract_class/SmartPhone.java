package sec08.exam01_abstract_class;

public class SmartPhone extends Phone{

	//명시적 생성자호출 -> 자식클래스가 생성될 때 부모 생성자부터 먼저 호출하기 때문에...
	
	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String owner) {
		super(owner); //부모 생성자 호출 -> 부모객체 생성
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
