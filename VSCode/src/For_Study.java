import java.util.Random;
import java.util.Scanner;

public class For_Study {
    public static void main(String[] args) {
        //For 문
        //초기화식 생략
        // int i = 1;
        // for( ; 1 <= 100; i++){}

        //초기화 식이나 증감식이 둘 이상인경우
        // for(int i = 0, j = 100; i <=50 && j>=50; i++, j-- ){}

        //for문 예제
        // int sum = 0;
        // for (int i = 1; i <= 100; i++){
        //     sum = sum + 1; 
        // }
        // System.out.println("1~100까지의 합 : "+sum);

        //문제 1) 1부터 5까지 숫자를 출력하시오
        // for(int i = 1; i <= 5; i++){
        //     System.out.println(i);
        // }


        //문제 2) 93부터 50까지 합을 출력하시오
        // int sum = 0;
        // for(int i = 93; i >= 50; i--){
        //     sum += i;
        // }
        // System.out.println("합 : " + sum);

        // 문제 3) 아래와 같은 별 모양을 출력하세요
        // String result = "";
        // char c = '*';
        // for(int i = 1; i <= 5; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //         System.out.print("*");
        //     System.out.println();
        // }

        //중첩 for문
        //문제1) 마름모 별 모양을 출력하세요
        // for(int i = 1; i <= 5; i++){
        //     for(int j = 0; j<5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=0; k<(2*i)-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i = 4; i>0; i--){
        //     for(int j=0; j<5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 0; k<(2*i)-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //구구단을 작성하세요 2~9단
        // for(int i = 2; i<9; i++){
        //     System.out.printf("----%d단----\n", i);
        //     for(int j = 1; j<9; j++){
        //         System.out.printf("%d x %d = %d\n", i, j, i*j);
        //     }
        //     System.out.println();
        // }

        //예제 1~100까지 숫자 중 3과 5의 배수 출력
        // int sum = 0;
        // for(int i = 1; i<=100; i++)
        // {
        //     if(i % 3 == 0 && i % 5 ==0){
        //         sum += i;
        //         System.out.print(i+" ");
        //     }

        // }
        // System.out.println("\n합계: " + sum);
        
        //예제 한개의 정수를 입력받아서 그 수의 배수를
        //차례로 10개 출력하는 프로그램 작성
        // Scanner scanner = new Scanner(System.in);
        // int input = scanner.nextInt();

        // for(int i = input; i<=input*10; i+=input){
        //     System.out.print(i + " ");
        // }
        // scanner.close();
	
        //While 문
        // int i = 1;
        // while (i<=10){
        //     System.out.println(i+". joker");
        //     i++;
        // }

        // int sum = 0, odd = 0, even = 0;
        // int i = 1;
        // while (i <= 100) {
        //     sum += 1;
        //     if (i % 2 == 0) {
        //         even += i;
        //     } else {
        //         odd += i;
        //     }
        //     i++;
        // }
        // System.out.println("1~100 합 : " + sum);
        // System.out.println("1~100 짝수 합 :" + even);
        // System.out.println("1~100 홀수 합 : " + odd);

        // boolean stop = false;
        // int num;
        // while(!stop){
        //     System.out.println("2개의 정수 입력");
        //     Scanner scanner = new Scanner(System.in);
        //     int num1 = scanner.nextInt();
        //     int num2 = scanner.nextInt();
        //     num = num1 % num2;
        //     System.out.println(num1 + " % " + num2 + " = " + num);
        //     System.out.print("계속 Y, 종료 N 입력> ");
        //     String yn = scanner.next();
        //     if(yn.equals("Y") || yn.equals("y")){
        //         System.out.println("------------");
        //         continue;
        //     }
        //     if(yn.equals("N") || yn.equals("n")){
        //         System.out.println("------------");
        //         break;
        //     }
        // }
        // System.out.println("시스템이 종료되었습니다.");

        //문제 1) 알파벳 "A"부터 "Z"까지 출력하시오.

        // for(char i = 'A'; i<='Z'; i++){
        //     System.out.print(i);
        // }

        //문제 2) 1부터 10까지의 합을 구하세요
        // int sum = 0;
        // for(int i = 1; i<=10; i++){
        //     sum += i;
        // }
        // System.out.println("1부터 10까지의 합 = " + sum);

        //do-while문 : 무조건 한번은 반복한다.
        // int i = 1;
        // do{
        //     System.out.println(i + ". do While");
        //     i++;
        // }
        // while(i<=10);
        
        // int i = 1;
        // do{
        //     System.out.println(i + ". do - while");
        //     i++;
        // }
        // while (i < 1);

        //문제1) 키보드로 숫자를 입력받아서 10이 아니면 계속 반복하는 프로그램을 작성하세요.
        // int input;
        // do{
        //     Scanner scanner = new Scanner(System.in);
        //     input = scanner.nextInt();

        // }while(input != 10);

        //문제2) 랜덤하게 0~100까지 입력을 받아서 정답을 맞추는 프로그램을 작성하세요. 
        //정답보다 크면 "더 작은수로 다시 시도해보세요"를 출력하고, 정답보다 작으면 "더 큰수로 다시 시도해보세요"를 출력하세요
        // Random random = new Random();
        // Scanner scanner = new Scanner(System.in);
        // int randomInt;
        // int input;
        // do{
        //     // randomInt = random.nextInt(99)+1;
        //     randomInt = 10;
        //     System.out.print("값을 입력하세요> ");
        //     input = scanner.nextInt();
        //     if(randomInt>input){
        //         System.out.printf("정답 : %d\n입력 : %d\n더 작은 수로 다시 시도해보세요\n", randomInt, input);
        //         continue;
        //     }
        //     else if(randomInt<input){
        //         System.out.printf("정답 : %d\n입력 : %d\n더 큰 수로 다시 시도해보세요\n", randomInt, input);
        //         continue;
        //     }
        //     else{
        //         System.out.printf("정답 : %d\n입력 : %d\n정답입니다.\n", randomInt, input);
        //         break;
        //     }
        // } while(randomInt==input);
        

    }
}
