package sec04.exam01_class_new;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); //new 클래스 생성자를 호출 
		//객체의 생성 번지를 s1에 리턴 
		
		System.out.println("s1변수가 Student객체를 참조합니다");
		
		
		Student s2 = new Student();//객체 생성 
		System.out.println("s2변수가 Student객체를 참조합니다");
		
		//2개의 객체가 생성하고 두개의 클래스 변수가 객체를 참조한다. 

	}

}
