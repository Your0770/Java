package 최시훈;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[100];
		boolean run = true;
		int cnt = 0;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch(menuNo) {
			case 1 : 
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String ano = sc.nextLine();
				System.out.print("계좌주: ");
				String owner = sc.nextLine();
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(sc.nextLine());
				if(accounts[cnt] == null) {
					accounts[cnt] = new Account(ano, owner, balance);
				}else {
					cnt++;
					accounts[cnt] = new Account(ano, owner, balance);
				}
				break;
				
			case 2 : 
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] != null) {
						System.out.printf("%s\t%s\t%d\n", accounts[i].getAno(), accounts[i].getOwner(), accounts[i].getBalance());
					}
				}
				break;
				
			case 3 : 
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String ano3 = sc.nextLine();
				System.out.print("예금액: ");
				int inMoney = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] != null) {
						if(accounts[i].getAno().equals(ano3)) {
							accounts[i].inMoney(accounts[i].getBalance(), inMoney);
						}
					}
				}
				break;
				
			case 4 : 
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				System.out.print("계좌번호: ");
				String ano4 = sc.nextLine();
				System.out.print("출금액: ");
				int outMoney = Integer.parseInt(sc.nextLine());
				for(int i = 0; i < accounts.length; i++) {
					if(accounts[i] != null) {
						if(accounts[i].getAno().equals(ano4)) {
							accounts[i].outMoney(accounts[i].getBalance(), outMoney);
						}
					}
				}
				break;
				
			case 5 : run = false; break; 
			
			default : System.out.println("메뉴를 다시 선택해주세요."); 
			}//switch
			
		}//while

		sc.close();
	}//main

}
