package sec07.exam05_method_polymorphism;

public class Driver {
	
	public void drive(Vehicle vehicle){ /*Vehicle 객체와, Vehicle의 자식객체도 들어올 수 있다.*/
		vehicle.run();
		
	}
}
