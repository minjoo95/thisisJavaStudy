package sec06.exam01_protected_pacage2;

import sec06.exam01_protected_pacage1.A;

//다른패키지라도 부모클래스의 protected필드, 메소드는 자식클래스에서 호출이 가능하다. 
public class D extends A{
//	public D() {
//		super();
//		this.field = "value";
//		this.method();
//	}
	
	
	public void method() {
		
		this.field = "value";
		
		this.method(); 
	}
	
}
