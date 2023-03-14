package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		parent.method1(); 
		//자식에는 method1이 없기 때문에 부모의 메서드

		parent.method2(); 
		//부모 타입 객체라도 오버라이딩된 자식 메서드가 호출된다.
	
	//	parent.method3();
		//에러!!
		//부모타입으로 쓸수 있는 것은 부모클래스의 메서드 또는 재정의된 메서드
	}

}
