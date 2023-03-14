package sec08.exam01_abstract_class;

//추상클래스 
public abstract class Phone {
	//필드
	public String owner;
	
	public Phone() {
	}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 텹니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 텹니다.");
	}
}
