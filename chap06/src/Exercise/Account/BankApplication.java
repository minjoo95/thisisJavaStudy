package Exercise.Account;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100]; //main(정적메서드)에서 쓰기 위해서 static을 붙혀줌
	private static Scanner scanner = new Scanner(System.in);
	private static int cnt;


	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 1.계좌생성하기
	public static void createAccount() {  //static인 이유? -> 객체 생성없이 main정적 메서드에서 사용하는 BankApplication클래스 메서드이므로 static을 선언해줘야한다. 
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		
		System.out.print("계좌번호");
		String ano = scanner.next();
		
		System.out.print("계좌주");
		String owner = scanner.next();
		
		System.out.print("초기입금액");
		int balance = scanner.nextInt();
		
		
		//객체생성
		Account newAccount = new Account(ano,owner,balance);
		//배열에 넣어준다->인덱스보다는 비여있는 배열에 넣어준다
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]== null) {
				accountArray[i]= new Account(ano,owner,balance);
				System.out.println("계좌가 생성되었습니다.");
				break;//반복문 빠져나감 
			}
		}
		
	}

	// 2.계좌목록
	public static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(int i=0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			if(account!=null) {
				System.out.print(account.getAno());
				System.out.print("      ");
				System.out.print(account.getOwner());
				System.out.print("      ");
				System.out.print(account.getBalance());
				System.out.println("      ");
			}
		}
	}

	// 3.예금
	public static void deposit() { //findAccount(String ano) 호출해서 사용 -> Account배열에서 ano와 동일한 Account 객체 찾기 
		System.out.println("---------");
		System.out.println("예금하기");
		System.out.println("---------");
		System.out.print("계좌번호");
		String ano = scanner.next();
		System.out.print("입금액");
		int money = scanner.nextInt();
		
		//계좌번호를 찾는다.
		Account account = findAccount(ano);
		
		if(account==null) {
			System.out.println("결과:계좌가 없습니다.");
		}
		
		//해당계좌에 잔고를 가져와서 입금액과 더해준다. 
		account.setBalance(account.getBalance()+money); 
		System.out.println("입금이 성공되었습니다.");
	}

	// 4.출금
	public static void withdraw() {
		System.out.println("---------");
		System.out.println("출금하기");
		System.out.println("---------");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.print("출금액");
		int money = scanner.nextInt();
		
		//계좌번호를 찾는다.
		Account account = findAccount(ano);
		
		if(account==null) {
			System.out.println("결과:계좌가 없습니다.");
			return; //메소드 실행 종료 
		}
		
		
		//해당계좌에 잔고를 가져와서 입금액과 빼준다. 
		account.setBalance(account.getBalance()-money); 
		System.out.println("출금이 성공되었습니다.");
	}
	
	
	//계좌번호 찾기                            
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) { //문자열비교할때는 equals
					account=accountArray[i];
					break; //반복문 종료 
				}
			}
		}
		return account;
	

	}

}
