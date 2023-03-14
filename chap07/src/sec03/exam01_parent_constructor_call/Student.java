package sec03.exam01_parent_constructor_call;

public class Student extends People {
	// 컴파일 오류가 나는 이유
	// 암시적으로 super() 생성자가 호출이 되어 부모의 기본생성자를 호출하기 때문에
	//public Student() {
	//super();
	//}
	
	
	public int studentNo;
	
	
	/*명시적으로 부모생성자 호출*/
	public Student(String name,String ssn,int studentNo) {
		super(name,ssn); //부모생성자호출은 코드 위에 
		this.studentNo = studentNo;
		System.out.println("자식객체 생성완료");
	}
}
