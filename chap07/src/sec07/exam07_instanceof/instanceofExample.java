package sec07.exam07_instanceof;

public class instanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("Child로 변환성공");
		}else {
			System.out.println("Child 변환실패" + "왜? 자식 타입이 부모 타입으로 자동 변환된 이후가 아니기 때문 ");
		}
		
	}
	

	public static void main(String[] args) {
		
		Parent parentA = new Child();
		instanceofExample.method1(parentA);
		
		Parent parentB = new Parent();
		instanceofExample.method1(parentB);
	}

}
