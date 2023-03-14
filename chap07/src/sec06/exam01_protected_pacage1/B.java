package sec06.exam01_protected_pacage1;

public class B {
	public void method() {
		A a = new A(); //A와 같은 패키지에서 B가 생성됨
		
		a.field = "value"; //같은 패키지이기 때문에 호출 가능
		
		a.method(); //같은 패키지이기 때문에 호출 가능
	}
}
