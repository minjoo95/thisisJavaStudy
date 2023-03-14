package sec08.exam02_abstract_method;

public class Cat extends Animal {
	/* 컴파일에러가 나는 이유 */
	// 애니멀이 가지고 있는 추상메서드를 반드시 추가 해야한다.
	
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
