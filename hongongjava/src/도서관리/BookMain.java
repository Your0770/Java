package 도서관리;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String title = null;
		String writer = null;
		int price = 0;
		String bNum = null;
		
		
		// 도서 관리
		
		// 메인메뉴
		while(run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1.도서등록 | 2.도서검색 | 3.도서목록조회 | 4.도서삭제 | 5.도서정보수정 | 6.프로그램 종료");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("번호 선택 > ");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch(menuNo) {
			
		// 선택 1번 : 도서 등록
			case 1 : 
				System.out.println("[도서 등록]");
				System.out.print("책제목 > ");
				title = sc.nextLine();
				System.out.print("저자 > ");
				writer = sc.nextLine();
				System.out.print("가격 > ");
				price = Integer.parseInt(sc.nextLine());
				System.out.print("책 번호 > ");
				bNum = sc.nextLine();
				
				BookDao.ins(title, writer, price, bNum);
				
				break;
				
		// 선택 2번 : 도서 검색 => 책 제목으로 검색
			case 2 : 
				System.out.println("[도서 검색]");
			    System.out.print("책 제목 > ");
			    title = sc.nextLine();
			    BookDao.sel(title);
				break;
				
		// 선택 3번 : 도서 전체 조회
			case 3 :
				System.out.println("[도서 목록 전체 조회]");
				BookDao.selAll();
				break;
				
		// 선택 4번 : 도서 삭제
			case 4 :
				System.out.println("[도서 삭제]");
				System.out.print("삭제할 책 번호 > ");
				bNum = sc.nextLine();
				BookDao.del(bNum);
				
				break;
				
		// 선택 5번 : 도서 정보 수정
		//			책 제목 : 변경할 책번호, 변경할 책 가격 입력 => 수정
			
			case 5 :
				System.out.println("[도서 정보 수정]");
				System.out.println("수정할 책 제목 > ");
				title = sc.nextLine();
				System.out.println("수정할 책 번호 > ");
				bNum = sc.nextLine();
				System.out.println("수정할 책 가격 > ");
				price = Integer.parseInt(sc.nextLine());
				BookDao.upd(title, bNum, price);
				
				break;
				
		// 선택 6번 : 프로그램 종료
			case 6 :  
				run = false;
				break;
			
			default : 
				System.out.println("메뉴를 다시 선택해주세요.");
				
			}//switch
			
		}//while
		sc.close();
		
	}//main

}
