package sec03.exam01_parent_constructor_call.copy;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-78910", 1);
		//자식객체를 만들면 부모 객체부터 생성이된다
		//생성자 호출 순서 
		//부모 생성자->자식생성자
		
		System.out.println("name:" + student.name);
		System.out.println("ssn:" + student.ssn);
		System.out.println("studentNo:" + student.studentNo);
		
		Student student2 = new Student();
	}

}
