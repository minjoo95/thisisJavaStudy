package Exercise.ShopService;

public class ShopService {
	
	//정적필드
	private static ShopService singleton = new ShopService();
	
	//생성자 
	private ShopService() {};
	
	//정적메소드 
	public static ShopService getInstance() {
		return  singleton;
	}
}
