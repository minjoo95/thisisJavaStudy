package sec07.exam02_promotion_access;

public class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}//-> 부모타입 인스턴스에서는 사용할 수 없음
	
}
