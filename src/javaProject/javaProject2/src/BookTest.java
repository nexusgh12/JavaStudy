public class BookTest {
    public static void main(String[] args) {
        Book book01 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
        Book book02 = new Book("B002", "자바 스크립트", "이몽룡", 30000, 2020, "서울출판사");
        Book book03 = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");



        System.out.println(book01.bookTitle.length()+" "+book01.bookTitle.getBytes().length);
        System.out.println(book02.bookTitle.length()+" "+book02.bookTitle.getBytes().length);
        System.out.println(book03.bookTitle.length()+" "+book03.bookTitle.getBytes().length);

        System.out.printf("%-4s%-20s%-7s%-6s%-7s%-6s%n", "도서번호", "도서명","저자","가격","발행일","출판사");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(book01.toString());
        System.out.println(book02.toString());
        System.out.println(book03.toString());


    }
}
