package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		
		//Parent에 정의된 필드, 메서드이기 때문에 사용 가능
		parent.field1 = "data1";
		parent.method1(); 
		parent.method2();
		
		
		/*field2는 부모에게 없는 필드 이미로 사용 할 수 없음*/
		/*재정의된 메서드는 사용 가능하다*/
		//parent.field2 = "data2";
		//parent.method3;
		
		
		//자식 필드, 메서드를 사용하고 싶다면 ?->강제타입변환!
		Child child = (Child)parent;
		child.field2 = "data2";
	}

}
