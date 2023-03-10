package sec09.exan01_instance_member;

public class CarExample {

	//Car을 실행시키는 클래스
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
