import java.util.Calendar;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // int month = 8;
        // String monthString = "";
        // switch (month) {
        //     case 1:
        //         monthString = "January";
        //         break;
        //     case 2:
        //         monthString = "February";
        //         break;
        //     case 3:
        //         monthString = "March";
        //         break;
        //     case 4:
        //         monthString = "April";
        //         break;
        //     case 5:
        //         monthString = "May";
        //         break;
        //     case 6:
        //         monthString = "June";
        //         break;
        //     case 7:
        //         monthString = "July";
        //         break;
        //     case 8:
        //         monthString = "August";
        //         break;
        //     case 9:
        //         monthString = "September";
        //         break;
        //     case 10:
        //         monthString = "October";
        //         break;
        //     case 11:
        //         monthString = "November";
        //         break;

        //     case 12:
        //         monthString = "December";
        //         break;
        // }
        // System.out.println(monthString);

        // int randomNum = (int)(Math.random() * 100);
        // String result = "";
        // switch(randomNum % 2){
        //     case 0 : result = "짝수";
        //         break;
        //     case 1 : result = "홀수";
        //         break;
        // }
        // System.out.printf("%d : %s 입니다.", randomNum, result);

        // Scanner scanner = new Scanner(System.in);
        // int score = scanner.nextInt();
        // String grade = "";
        // switch (score / 10) {
        //     case 10:
        //     case 9:
        //         grade = "A";
        //         break;
        //     case 8:
        //         grade = "B";
        //         break;
        //     case 7:
        //         grade = "C";
        //         break;
        //     case 6:
        //         grade = "D";
        //         break;
        //     default:
        //         grade = "F";
        //         break;
        // }
        // System.out.printf("성적 : %s", grade);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("음료를 입력해주세요");
        // String str = scanner.nextLine();
        // Integer price = null;
        // switch(str){
        //     case "콜라" : price = 800;
        //     break;
        //     case "사이다" : price = 900;
        //     break;
        //     case "커피" : price = 700;
        //     break;
        //     default : System.out.println("잘못 입력했습니다.");
        // }
        // if( price != null)
        // {
        //     System.out.printf("선택한 음료는 %s입니다. 금액은 %d원 입니다.", str, price);
        // }

        int month;
        int lastDay;

        Scanner scanner = new Scanner(System.in);
        System.out.println("희망하는 월을 입력 해주세요");
        month = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, month-1, 1);
        lastDay = calendar.getActualMaximum(Calendar.DATE);
        
        System.out.printf("%d월의 마지막 날은 %d일 입니다.", month, lastDay);

        
    }
}
