package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();
		//Phone은 추상클래스이기 때문에 객체생성 불가능 -> 자식 클래스를 만든다.
		
		//실체클래스생성 
		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn(); //부모메서드 사용
		smartPhone.internetSearch(); //자식메서드 사용
		smartPhone.turnOff();//부모메서드 사용
	}

}
