package sec11.exam01_final;

public class Person {
	final String nation="Korea";
	final String ssn;
	String name;
	
	//생성자를 이용하여 final 초기화하기 
	Person(String ssn,String name){
		this.ssn = ssn;
		this.name = name;
	}
}
