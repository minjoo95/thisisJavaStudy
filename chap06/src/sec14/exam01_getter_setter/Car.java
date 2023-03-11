package sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() { //읽기 전용일 때는 getter만 만들어준다.
		return speed;
	}
	public void setSpeed(int speed) { //유효성검사가 setter의 주된 역할 
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
}
