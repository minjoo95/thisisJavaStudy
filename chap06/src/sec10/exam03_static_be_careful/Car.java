package sec10.exam03_static_be_careful;

public class Car {

	//인스턴스필드
	int speed;
	
	//인스턴스메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		//컴파일에러
		//speed = 60; 
		//run();
		
		Car myCar = new Car();
		myCar.speed=60;
		myCar.run();
	}
}
