import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        // int a = 6;
        // if(a%2 == 0){
        //     System.out.println(a+"는 2의 배수");

        // int a = 10, b= 20, c = 9;
        // int max;
        // if(a > b && a > c)
        // {
        //     max = a;
        // }
        // else{
        //     if(b > c)
        //     {
        //         max = b;
        //     }
        //     else{
        //         max = c;
        //     }
        // }
        // System.out.println("max = " + max);

        // int num = (int) (Math.random() * 6) + 1;
        // if(num==1){
        //     System.out.printf("%d : 1번이 나왔습니다.%n", num);
        // }
        // else if(num==2){
        //     System.out.printf("%d : 2번이 나왔습니다.%n", num);
        // }
        // else if(num==3){
        //     System.out.printf("%d : 3번이 나왔습니다.%n", num);
        // }
        // else if(num==4){
        //     System.out.printf("%d : 4번이 나왔습니다.%n", num);
        // }
        // else if(num==5){
        //     System.out.printf("%d : 5번이 나왔습니다.%n", num);
        // }
        // else if(num==6){
        //     System.out.printf("%d : 6번이 나왔습니다.%n", num);
        // }

        // Scanner scanner = new Scanner(System.in);
        // int userID = scanner.nextInt();
        // String user = "";
        // if(userID == 1){
        //     user = "관리자";
        // }
        // else if(userID == 2){
        //     user = "판매자";
        // }
        // else if(userID == 3){
        //     user = "구매자";
        // }
        // System.out.printf("%d: %s로 로그인 하였습니다.", userID, user);
        // scanner.close();

        Scanner scanner = new Scanner(System.in);
        int userID;
        int userPW;
        String user = "";

        userID = scanner.nextInt();

        if(userID == 1){
            userPW = scanner.nextInt();
            if(userPW == 1234)
            {
                user = "관리자";
            }
        }
        else if(userID == 2){
            user = "판매자";
        }
        else if(userID == 3){
            user = "구매자";
        }
        else{
            System.out.println("ID를 확인해주세요");
        }

        if(user.isEmpty() != true)
            System.out.printf("%d: %s로 로그인 하였습니다.", userID, user);
        scanner.close();
    }
}

