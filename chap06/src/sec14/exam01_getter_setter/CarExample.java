package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.getSpeed());
		myCar.setSpeed(-3);
		System.out.println(myCar.getSpeed());
		System.out.println(myCar.isStop());
	}

}
