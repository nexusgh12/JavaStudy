import java.util.*;

public class If_Study {
    public static void main(String[] args) {

        // if문

        // 예제 1
        // if(true){
        // System.out.println("실행 1");
        // }

        // if(false) //거짓이기 때문에 실행 안됨
        // {
        // System.out.println("실행 2");
        // System.out.println("실행 3");
        // }

        // int a = 6;
        // if(a%2 == 0){
        // System.out.println(a + "는 2의 배수");
        // }

        // If Example
        // int input;
        // System.out.print("숫자를 하나 입력하세요 >");
        // Scanner scanner = new Scanner(System.in);
        // String tmp = scanner.nextLine();
        // input = Integer.parseInt(tmp);
        // if(input==0){
        // System.out.println("입력하신 숫자는 0입니다.");
        // }
        // else if(input != 0){
        // System.out.println("입력하신 숫자는 0이 아닙니다.");
        // System.out.printf("입력하신 숫자는 %d입니다.", input);
        // }

        // 문제1 ) 키보드로 입력받은 숫자가 10보다 작으면 "10보다 작습니다."를 출력하시오.

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("숫자를 입력해주세요.");
        // int input = scanner.nextInt();

        // if(input<10)
        // {
        // System.out.println("10보다 작습니다.");
        // }

        // 문제2) 키보드로 입력받은 숫자가 2로 나누었을때 나머지가 0이면 "짝수입니다."를 출력하시오.

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("숫자를 입력해주세요.");
        // int input = scanner.nextInt();
        // if((input%2) == 0){
        // System.out.println("짝수입니다.");
        // }

        // 문제3) 변수 a 는 4 이면서, 변수 b 는 짝수이고, 변수 c 는 true 가 아닐 경우 "정답입니다."를 출력하시오.
        // Random random = new Random();
        // int a = random.nextInt(10);
        // int b = random.nextInt(10);
        // Boolean c = random.nextBoolean();
        // if( a==4 && b%2==0 && c!=true)
        // {
        // System.out.printf("a : %d\nb : %d\nc : %s", a, b, c);
        // System.out.println("정답입니다.");
        // }
        // else{
        // System.out.printf("a : %d\nb : %d\nc : %s", a, b, c);
        // System.out.println("오답입니다.");
        // }

        // 문제4) 변수 a가 10보다 크거나 5보다 작으면서 변수 b가 홀수일 경우 "정답입니다."를 출력하시오.
        // Random random = new Random();
        // int a = random.nextInt(10);
        // int b = random.nextInt(10);
        // if(a>10 || a<5 && b%2 != 0){
        // System.out.printf("a : %d\nb : %d\n", a, b);
        // System.out.println("정답입니다.");
        // }

        // 문제5) 변수 a 가 -10보다 작거나 같고, 변수 b가 10보다 작으면서, a * b 가 100보다 크면 "정답입니다."를 출력하시오.

        // Random random = new Random();
        // int a = random.nextInt(10);
        // int b = random.nextInt(10);
        // if (a <= -10 && b < 10 && a * b > 100) {
        // System.out.printf("a : %d\nb : %d\n", a, b);
        // System.out.println("정답입니다.");
        // }

        // If-Else문
        // 예제 4
        // int money = 2000;
        // if(money >= 3000){
        // System.out.println("택시를 타고 가세요.");
        // }
        // else{
        // System.out.println("걸어가세요.");
        // }

        // 예제 5

        // int money = 2000;
        // boolean hasCard = true;

        // if(money >= 3000 || hasCard){
        // System.out.println("택시를 타고 가세요.");
        // }
        // else{
        // System.out.println("걸어가세요");
        // }

        // 문제 1) 키보드로 입력받은 숫자가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하세요.

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("숫자를 입력해주세요> ");
        // int input = scanner.nextInt();
        // if(input%2 == 0) {
        // System.out.println("짝수");
        // }
        // else{
        // System.out.println("홀수");
        // }

        // 문제 2) 0~100까지의 난수를 생성하여 아래와 같이 출력하세요
        // Random random = new Random();
        // int randInt = random.nextInt(100);
        // if (randInt > 90)
        // System.out.printf("점수 : %d \n 등급 : 수", randInt);
        // else if (randInt > 80) {
        // System.out.printf("점수 : %d \n 등급 : 우", randInt);
        // }
        // else if (randInt > 70) {
        // System.out.printf("점수 : %d \n 등급 : 미", randInt);
        // }
        // else if (randInt > 60) {
        // System.out.printf("점수 : %d \n 등급 : 양", randInt);
        // }
        // else{
        // System.out.printf("점수 : %d \n 등급 : 가", randInt);
        // }

        // 문제 3) 정수 3개를 비교하여 최댓값을 구하세요
        // int a = 10, b = 20, c = 15;
        // int max;

        // if(a>b && a>c)
        // max = a;
        // else{
        // if(b>c)
        // max = b;
        // else
        // max = c;

        // }

        // System.out.println("max : " + max);

        // Else-If문
        // 예제 6)
        // int age = 22;
        // if (age >= 20 && age<30){
        // System.out.println("20대");
        // }
        // else if(age<20){
        // System.out.println("10대 이하");
        // }
        // else{
        // System.out.println("30대 이상");
        // }

        // 문제1) else if를 사용하여 주사위의 번호를 뽑으세요.
        // int num = (int) (Math.random() * 6) + 1;
        // if (num == 1)
        //     System.out.println("1번이 나왔습니다.");
        // else if (num == 2)
        //     System.out.println("2번이 나왔습니다.");
        // else if (num == 3)
        //     System.out.println("3번이 나왔습니다.");
        // else if (num == 4)
        //     System.out.println("4번이 나왔습니다.");
        // else if (num == 5)
        //     System.out.println("5번이 나왔습니다.");
        // else if (num == 6)
        //     System.out.println("6번이 나왔습니다.");

        // 문제2) userID가 1이면 관리자 2이면 판매자 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하세요.
        // Scanner scanner = new Scanner(System.in);
        // int userID = scanner.nextInt();
        // if (userID == 1) {
        //     System.out.println("관리자로 로그인 하였습니다.");
        // } else if (userID == 2) {
        //     System.out.println("판매자로 로그인 하였습니다.");
        // } else if (userID == 3) {
        //     System.out.println("구매자로 로그인했습니다.");
        // }

        //문제3) userID가 1이면 관리자, 2이면 판매자, 3이면 구매자이다. userID를 확인하여 누가 로그인했는지 출력하고 관리자의 경우 password가 1234와 일치하면 
        //"관리자로 로그인하였습니다"를 출력하세요.

        // Scanner scanner = new Scanner(System.in);
        // int userID;
        // int password;
        // String user = "";
        // boolean isLogin;

        // System.out.print("아이디를 입력해주세요> ");
        // userID = scanner.nextInt();
        // if (userID == 1) {
        //     user = "관리자";
        //     System.out.print("비밀번호를 입력해주세요> ");
        //     password = scanner.nextInt();
        //     if (password == 1234)
        //         isLogin = true;
        // } else if (userID == 2) {
        //     user = "판매자";
        // } else if (userID == 3) {
        //     user = "구매자";
        // } else {
        //     System.out.println("잘못 입력하셨습니다.");
        // }

        //Switch문
        //문제 1) Switch Case문을 이용하여 짝수이면 짝수입니다. 홀수이면 홀수입니다.를 출력하세요
        // int num = 11;
        // switch (num % 2) {
        //     case 0:
        //         System.out.println("짝수입니다.");
        //     case 1:
        //         System.out.println("홀수입니다.");
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("점수를 입력해주세요> ");
        // int score = scanner.nextInt();
        // switch (score / 10) {
        //     case 10:
        //     case 9:
        //         System.out.println("A");
        //         break;
        //     case 8:
        //         System.out.println("B");
        //         break;
        //     case 7:
        //         System.out.println("C");
        //         break;
        //     case 6:
        //         System.out.println("D");
        //         break;
        //     default:
        //         System.out.println("F");
        //         break;
        // }
        
        //문제 2) 콜라는 800원, 사이다는 900원, 커피는 700원이다. 콜라, 사이다, 커피 중에 하나의 문자를 입력해서 가격을 출력하는 프로그램을 작성하시오.
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("음료를 입력해주세요.> ");
        // String input = scanner.nextLine();
        // Integer price = null;
        // switch (input) {
        //     case "콜라":
        //         price = 800;
        //         break;
        //     case "사이다":
        //         price = 900;
        //         break;
        //     case "커피":
        //         price = 700;
        //         break;
        // }

        // System.out.printf("선택한 음료는 %s입니다. 금액은 %d입니다.", input, price);

        //문제 3) 가위 바위 보를 랜덤하게 발생하는 코드를 적으세요
        // int randomInt = (int) (Math.random() * 3) + 1;
        // String rcp = "";
        // switch (randomInt) {
        //     case 1:
        //         rcp = "가위";
        //         break;
        //     case 2:
        //         rcp = "바위";
        //         break;
        //     case 3:
        //         rcp = "보";
        //         break;
        // }
        // System.out.println(rcp);

        //문제 4) 3, 6, 9 게임을 작성하시오. 입력한 숫자에 3, 6, 9가 한번만 나오면 "짝", 두번 나오면 "짝짝"을 출력하세요.
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("3, 6, 9 게임 : 숫자를 입력해주세요> 3");
        // int input = scanner.nextInt();
        // int a, b;
        // int count = 0;
        // a = input / 10;
        // b = input % 10;

        // if (a == 3 || a == 6 || a == 9) {
        //     count += 1;
        // }
        // if (b == 3 || b == 6 || b == 9) {
        //     count += 1;
        // }

        // switch (count) {
        //     case 1:
        //         System.out.println("짝");
        //         break;
        //     case 2:
        //         System.out.println("짝짝");
        //         break;
        // }
    }
}

