package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company); //기본초기값 현대 자동차가 들어감 
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company); //기본초기값 현대 자동차가 들어감 
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		
		Car car3 = new Car("자가용","빨강");
		System.out.println("car3.company : " + car3.company); //기본초기값 현대 자동차가 들어감 
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		
		Car car4 = new Car("자가용","빨강",200);
		System.out.println("car4.company : " + car4.company); //기본초기값 현대 자동차가 들어감 
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		Car car5 = new Car("기아자동차","자가용","빨강",200);
		System.out.println("car5.company : " + car5.company); //기본초기값 현대 자동차가 들어감 
		System.out.println("car5.model : " + car5.model);
		System.out.println("car5.color : " + car5.color);
		System.out.println("car5.maxSpeed : " + car5.maxSpeed);

	}

}
