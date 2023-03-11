package sec10.exam04_singleton;

public class Singleton {
	
	//싱글톤만드는 방법 
	
	
	//정적필드 
	private static Singleton singleton = new Singleton();
	
	
	//생성자호출 막아주기
	private Singleton() {
	
	}
	
	//정적메소드
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
