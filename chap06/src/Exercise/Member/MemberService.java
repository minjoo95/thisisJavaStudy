package Exercise.Member;

public class MemberService {

	public boolean login(String id,String password) {
//		if(id=="hong"&&password=="12345") {
//			return true;
//		}
//		return false;
		
		if(id.equals("hong")&&password.equals("12345")){//문자역을 비교할 때는 equals
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}
