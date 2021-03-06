package javaProject2;

public class BookTest {
public static void main(String[] args) {
	Book book1 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
	Book book2 = new Book("B002", "자바 스크립트", "이몽룡", 30000, 2020, "서울출판사");
	Book book3 = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
	
	
	System.out.printf("%s\t%s\t\t%s\t%s\t%s\t%s\t%n", "도서번호", "도서명","저자","가격","발행일","출판사");
	System.out.println("----------------------------------------------------------");
	System.out.println(book1.toString());
	System.out.println(book2.toString());
	System.out.println(book3.toString());
  
	System.out.println();
  
	Magazine mgn1 = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
	Magazine mgn2 = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
	Magazine mgn3 = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
	
	
	System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%n", "도서번호", "도서명","저자","가격","발행일","출판사","발행월");
	System.out.println("----------------------------------------------------------");
	System.out.println(mgn1.toString());
	System.out.println(mgn2.toString());
	System.out.println(mgn3.toString());
}
	

}
