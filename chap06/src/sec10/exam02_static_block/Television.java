package sec10.exam02_static_block;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	static int from1To10Sum; 
	
	static {//정적필드의 복잡한 초기화식을 정적필드에서 해준다.
		info = company + "-" + model;
		
		int sum=0;
		for(int i=0;i<11;i++) {
			sum += i;
		}
		from1To10Sum=sum;
	}
}
	
