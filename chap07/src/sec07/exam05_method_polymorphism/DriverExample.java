package sec07.exam05_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		

		driver.drive(bus); //-> 자식객체도 매개변수로 넣을 수 있다. 
		driver.drive(taxi); //-> 자식객체도 매개변수로 넣을 수 있다. 
		
	}

}
