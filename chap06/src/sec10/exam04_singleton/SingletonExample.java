package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singletone(); 컴파일에러 
		
		
		//애플리케이션에는 싱글톤이 단 하나이다. 
		//싱글톤를 얻을 수 있는 유일한 방법 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		}else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
	}

}
