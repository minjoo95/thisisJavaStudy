package sec09.exan01_instance_member;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		//speed = speed; ->실행블록안에서는 매개변수가 우선순위이기 때문에 매개변수=매개변수가 된다
		this.speed = speed; //Car객체가 가지고 있는 speed필드 = 매개변수 
	}
	
	void run() {
		for(int i=0;i<=50;i+=10) {
			//setSpeed(i);
			this.setSpeed(i); //더 명확해지나 구지 붙힐 필요는 없음
			//System.out.println(model + "가 달립니다."); 같은 객체안에있는 model이기 때문에 this생략가능
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed +"km/h)");//더 명확해지나 구지 붙힐 필요는 없음
		}
	}

}
