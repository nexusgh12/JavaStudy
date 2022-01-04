import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] score = new int[5];

        // int k = 1;
        // score[0] = 50;
        // score[1] = 60;
        // score[k+1] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // for(int i = 0; i<5; i++){
        //     System.out.printf("score[%d]:%d%n", i, score[i]);
        // }
        // System.out.printf("length: %d%n", score.length);

        // System.out.printf("score[%d]:%d%n", 7, score[7]);
        
        // int[] score = new int[]{50, 60, 70, 80, 90};
        
        // for (int i = 0; i < score.length; i++){
        //     System.out.printf("score[%d] : %d%n", i, score[i]);
        // }

        // int[] score = {50, 60, 70, 80, 90};

        // for(int i = 0; i < score.length; i++){
        //     System.out.printf("score[%d] : %d%n", i, score[i]);
        // }
        
        // char[] chArr = new char[] { 'A', 'B', 'C', 'D', 'E' };
        // String str = "";
        // for (int i = 0; i < chArr.length; i++) {
        //     if (i < chArr.length - 1)
        //         str += chArr[i] + ", ";
        //     else
        //         str += chArr[i];
        // }
        // System.out.println(str);
        //System.out.printf("chArr[%d] : %s%n", i, chArr[i]);

        // boolean[] boolArr = new boolean[] { true, false, true, true, false };

        // for (int i = 0; i < boolArr.length; i++) {
        //     System.out.printf("boolArr[%d] : %s%n", i, boolArr[i]);
        // }

        // int[] score = new int[]{50, 60, 70, 80,90};
        // int sum = 0;
        // sum += score[0] + score[score.length-1];
        // System.out.printf("score[%d] + score[%d] = %d", 0, score.length-1, sum);

        // int[] arr = new int[] { 100, 88, 100, 100, 90 };
        // int total = 0;
        // float avg = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     total += arr[i];
        // }
        // avg = (float)total / arr.length;
        // System.out.printf("total : %d, avg : %.2f", total, avg);

        // int[] score = {79, 88, 91, 33, 100, 55, 95};

        // int max = score[0];
        // int min = score[0];

        // for(int i = 1; i < score.length; i++){
        //     if(score[i] > max){
        //         max = score[i];
        //     }
        //     else if(score[i] < min){
        //         min = score[i];
        //     }
        // }

        // System.out.printf("Max : %d%nMin : %d",max, min);

        // int a = 10, b = 20, tmp;
        // System.out.printf("a = %d, b = %d%n", a, b);
        // tmp = a;
        // a = b;
        // b = tmp;
        // System.out.printf("a = %d, b = %d%n", a, b);
        
        // int[] score = new int[] { 75, 100, 85, 60, 95 };
        // int[] rank = new int[score.length];

        // for (int i = 0; i < score.length; i++) {
        //     rank[i] = 1;
        //     for (int j = 0; j < score.length; j++) {
        //         if (score[i] < score[j]) {
        //             rank[i] += 1;
        //         }
        //     }
        // }
        // System.out.println("score   rank");
        // for (int i = 0; i < score.length; i++) {
        //     System.out.printf("%d\t%d%n", score[i], rank[i]);
        // }
       
        // int[] numArr = new int[10];
        // for(int i = 0; i < numArr.length; i++){
        //     numArr[i] = i;
        //     System.out.print(numArr[i]);
        // }

        // System.out.println();

        // for(int i = 0; i < 100; i++){
        //     int n = (int)(Math.random() * 10);
        //     int tmp = numArr[0];
        //     numArr[0] = numArr[n];
        //     numArr[n] = tmp;
        // }
        
        // for(int i = 0; i < numArr.length; i++){
        //     System.out.print(numArr[i]);
        // }

        // int money = 2860;
        // int coin_500, coin_100, coin_50, coin_10;
        // coin_500 = money/500;
        // coin_100 = (money-coin_500*500)/100;
        // coin_50 = (money-coin_500*500 - coin_100*100)/50;
        // coin_10 = (money-coin_500*500 - coin_100*100- coin_50*50)/10;

        // System.out.printf("거스름돈 : %d / 500원 : %d개 / 100원 : %d개 / 50원 : %d개 / 10원 : %d개 ",money, coin_500, coin_100, coin_50, coin_10);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("거스름돈을 입력해주세요> ");
        // int money = scanner.nextInt();
        // int moneyTemp = money;
        // int[] coin = new int[]{500, 100, 50, 10};
        // int[] coinCnt = new int[coin.length];

        // for(int i = 0; i < coin.length; i++){
        //     coinCnt[i] = moneyTemp/coin[i];
        //     moneyTemp%=coin[i];
        //     //System.out.printf("%d원 : %d개", coin[i], coinCnt[i]);
        //     if(i == 0){
        //         System.out.printf("거스름돈 : %d원 / %d원 : %d개 / ", money, coin[i], coinCnt[i]);
        //     }
        //     else if( i<coin.length-1){
        //     System.out.printf("%d원 : %d개 / ", coin[i], coinCnt[i]);
        //     }
        //     else{
        //         System.out.printf("%d원 : %d개", coin[i], coinCnt[i]);
        //     }
        // }

        // int[] randArr = new int[10];
        // int randNum;
        // int temp;
        // for(int i = 0; i < randArr.length; i++){
        //     randNum = (int)(Math.random()*5+1);
        //     randArr[i] = randNum;
        // }
        // System.out.println(Arrays.toString(randArr));

        // for(int i : randArr){
        //     if(i)
        // }

        // int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        
        //선택정렬
        // int tmp;
        // for(int i = 0; i < arr.length; i++){
        //     int minIndex = i;
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[minIndex] > arr[j]){
        //             minIndex = j;
        //         }
        //     }
        //     tmp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = tmp;
        // }
        // System.out.println(Arrays.toString(arr));
        
        //삽입정렬
        // int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        // for(int i = 1; i<arr.length; i++){
        //     for(int j = i; j >= 1; j--){
        //         if(arr[j]< arr[j-1]){
        //             int tmp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = tmp;
        //             System.out.println(Arrays.toString(arr));
        //         }else break;
        //     }
        // }
        
        //퀵정렬
        // int array[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
        // quickSort(array, 0, array.length-1);
        // for(int i : array){
        //     System.out.printf("%d ", i);
        // }

        //String 배열
        // String[] name = new String[3];
        // name[0] = "kim";
        // name[1] = "park";
        // name[2] = "yi";
        
        // for(String str : name){
        //     System.out.println(str.toUpperCase().charAt(0));
        // }
        

        // String str = "ABCDE";
        // char ch = str.charAt(3);
        // System.out.println(ch);

        // String str = "A,B,C,D,E";
        // String[] strArr = str.split(",");
        // System.out.println(Arrays.toString(strArr));
        
        // String[] str = {"Hello"};
        // if(Arrays.asList(str).contains("Hello")){
        //     System.out.println("안녕하세요");
        // }
        // else{
        //     System.out.println("안녕히가세요.");
        // }
        
        // 다차원 배열
        // int[][] arr = new int[2][3];
        // int k = 10;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         arr[i][j] = k;
        //         k += 10;
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        //가변 배열
        // int[][] arr = new int[3][];
        // arr[0] = new int[2];
        // arr[1] = new int[4];
        // arr[2] = new int[1];
        // for(int[] i : arr){
        //     System.out.println(Arrays.toString(i));
        // }
        

        // int[][] arr2 = {
        //     {10, 20},
        //     {10, 20, 30, 40},
        //     {10}
        // };
        // for(int[] i : arr2){
        //     System.out.println(Arrays.toString(i));
        // }

        // int[] arr = new int[] { 100, 88, 100, 100, 90 };
        // int total = 0;
        // float avg = 0;
        // for(int i = 0; i<arr.length; i++)
        // {
        //     total += arr[i];
        // }
        // avg=(float)total/arr.length;
        // System.out.printf("total : %d, avg : %.1f",total,avg);


        
            
        // 문제) 객체 지향 방식으로 Animal의 class를 만들고, Animal의 속성을 2가지 지정하고,
        // 메서드도 2가지를 만들고나서, OOP.java에서 객체화 한 다음 하나의 속성을 실행하고 나머지 메서드도 실행하는 코드를 작성하세요.
        
        // Animal dog = new Animal();
        // dog.CreateAnimal("멍멍이", 2);
        // dog.GetAnimal();

    }

    // public static void quickSort(int array[], int start, int end){
    //     if(start>=end)  return;

    //     int pivot = start;
    //     int left = start + 1;
    //     int right = end;

    //     while(left <= right){
    //         while(left <= end && array[left] <= array[pivot])
    //             left += 1;
    //         while(right > start && array[right] >= array[pivot])
    //             right -= 1;
    //         if(left > right){
    //             int tmp = array[right];
    //             array[right] = array[pivot];
    //             array[pivot] = tmp;
    //         }  else{
    //             int tmp = array[right];
    //             array[right] = array[left];
    //             array[left] = tmp;
    //         }
    //         quickSort(array, start, right -1);
    //         quickSort(array, right +1, end);
    //     }

    //}

}

