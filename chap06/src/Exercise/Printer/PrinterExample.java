package Exercise.Printer;

public class PrinterExample {

	public static void main(String[] args) {
//		Printer printer = new Printer();
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
		
		//객체를 생성하지 않고 클래스에서 호출
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
