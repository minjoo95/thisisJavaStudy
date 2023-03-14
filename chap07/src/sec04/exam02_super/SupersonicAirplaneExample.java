package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		//객체생성
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();

		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
