import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Study {
    public static void main(String[] args) {
        //배열(Array)
        // int[] score = new int[5];

        //배열 예제1)
        // int[] score = new int[5];
        // int k = 1;

        // score[0] = 50;
        // score[1] = 60;
        // score[k+1] = 70;
        // score[3] = 80;
        // score[4] = 90;

        // for(int i = 0; i<5; i++){
        //     System.out.printf("score[%d]: %d%n", i, score[i]);
        // }

        // //배열 길이
        // System.out.printf("length : %d%n", score.length);

        // // 배열 범위 초과
        // System.out.printf("score[%d]: %d%n", 7, score[7]); 

        //문제1) score 배열에 50, 60, 70, 80, 90을 입력하고 순서대로 출력하세요
        // int[] score = {50, 60, 70, 80, 90};
        // System.out.println(Arrays.toString(score));
        // for(int i = 0; i<score.length; i++){
        //     System.out.printf("%d ", score[i]);
        // }
        
        //문제2) chArr 배열에 a, b, c, d, e 를 입력하고 순서대로 출력하시오.
        // char[]  chArr = new char[]{'a', 'b', 'c', 'd', 'e'};
        // for(int i = 0; i<chArr.length; i++){
        //     System.out.printf("%s ", chArr[i]);
        // }
        

        //문제3) boolArr 배열에 true, false, true, true, false 를 입력하고 순서대로 출력하시오.
        // boolean[] boolArr = {true, false, true, true, false};
        // for(int i = 0; i<boolArr.length; i++){
        //     System.out.printf("%s ", boolArr[i]);
        // }

        //문제4) score 배열에 50, 60, 70, 80, 90 을 입력하고 처음 값과 마지막 값을 더한 다음 출력하시오.
        // int[] score = {50, 60, 70, 80, 90};
        // System.out.printf("처음 값: %d%n마지막 값: %d%n합: %d%n",
        // score[0], score[score.length-1], score[0]+score[score.length-1]);

        // 문제5) 배열에 100, 88, 100, 100, 90 을 입력하고 총합과 평균을 출력하시오
        // int[] arr = {100, 88, 100, 100, 90};
        // int total = 0;
        // float avg = 0; 

        // for(int i = 0; i < arr.length; i++){
        //     total += arr[i];
        // }
        // avg = (float)total/arr.length;
        // System.out.printf("총합: %d%n평균: %.1f%n", total, avg);

        //최대값과 최소값
        // int[] score ={79, 88, 91, 33, 100, 55, 95};
        // int max = score[0];
        // int min = score[0];
        // for(int i = 0; i < score.length; i++){
        //     if(score[i]>max) //최대값
        //         max = score[i];
        //     else if(score[i]<min) //최소값
        //         min = score[i];
        // }
        // System.out.printf("최댓값: %d%n최소값: %d%n", max, min);

        //문제6) 변수 a, 변수 b 의 값을 서로 교환하고 출력하시오.
        // int a = 50, b= 60;
        // int tmp;
        // System.out.printf("a: %d b: %d%n", a, b);
        // tmp = a;
        // a = b;
        // b = tmp;
        // System.out.printf("a: %d b: %d%n", a, b);

        //문제7) 배열에 75, 100, 85, 60, 95 를 입력하고, 높은 점수순으로 rank를 표시하시오.

        //rank 매기기
        // int[] score = {75, 100, 85, 60, 95};
        // int[] rank = {1, 1, 1, 1, 1};
        // System.out.println("score\trank");
        // for(int i = 0; i<score.length; i++){
        //     for(int j = 0; j<score.length; j++){
        //         if(score[i]<score[j]){
        //             rank[i]++;
        //         }
        //     }
        //     System.out.printf("%d\t%d%n", score[i], rank[i]);
        // }

        //높은 점수 순으로 정렬
        // int[] score = {75, 100, 85, 60, 95};
        // int tmp = 0;
        // for(int i = 0; i<score.length; i++){

        //     if(i<score.length-1&&score[i]<score[i+1]){
        //         tmp = score[i];
        //         score[i] = score[i+1];
        //         score[i+1] = tmp;
        //     }
        // }
        // System.out.println(Arrays.toString(score));

        //섞기(Shuffle)
        // int[] numArr = new int[10];
        // for(int i = 0; i<numArr.length; i++){
        //     numArr[i] = i;
        //     System.out.print(numArr[i]);
        // }

        // System.out.println();

        // for(int i =0; i<100; i++){
        //     int n = (int)(Math.random() * 10);
        //     int tmp = numArr[0];

        //     numArr[0] = numArr[n];
        //     numArr[n] = tmp;
        // }
        // for (int i=0; i < numArr.length; i++) 
        //     System.out.print(numArr[i]);

        // 임의의 값으로 배열 채우기
        // int[] arr = new int[5];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = (int)(Math.random()*5);
        // }

        //문제1) 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
        // ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("거스름돈을 입력해주세요> ");
        // int money = scanner.nextInt();
        // int tmp = money;
        // int[] coin = {500, 100, 50, 10};
        // int[] count = new int[coin.length];
            
        // for(int i = 0; i<coin.length; i++){
        //     count[i] = tmp/coin[i];
        //     tmp %= coin[i];
        //     if(i<=0)
        //         System.out.printf("거스름돈 : %d원 /", money);
        //     System.out.printf(" %d원 : %d개 /", coin[i], count[i]);
        // }
        
        // 문제) 1~5 사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
        // int[] arr = new int[10];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = (int)(Math.random()*5+1);
        //     //System.out.print(arr[i]);
        // }

        
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i : arr){
        //     if(!list.contains(i)){
        //         list.add(i);
        //     }
        // }
        
        // System.out.println(list);

        // int[] newArr = new int[list.size()];
        // for(int i = 0; i<newArr.length; i++){
        //     newArr[i] = list.get(i);
        // }

        // System.out.println(Arrays.toString(newArr));

        //시간 복잡도
        //O(1) 상수
        // System.out.println("Hello, World!");

        //O(N) : 선형
        // int[] arr = new int[5];
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println("Hello, World!");
        // }

        //O(N^2) : Square
        // int[] arr = new int[5];
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         System.out.println("Hello, World!");
        //     }
        // }

        //선택 정렬
        // int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        
        // for(int i = 0; i<arr.length; i++){
        //     int minIndex = i;
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[minIndex]>arr[j]){
        //             minIndex = j;
        //         }
        //     }

        //     int tmp = arr[i];
        //     arr[i] = arr[minIndex];
        //     arr[minIndex] = tmp;
        // }
        // System.out.println(Arrays.toString(arr));

        //삽입 정렬
        // int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // for(int i = 1; i<arr.length; i++){
        //     for(int j = i; j>=1; j--){
        //         if(arr[j] < arr[j-1])
        //         {
        //             int tmp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = tmp;
        //         }else break;
        //     }
        // }
        // System.out.println(Arrays.toString(arr));

        //퀵정렬
        // int array[] = { 5, 7, 9, 0, 3, 1, 6, 2, 4, 8 };

        // quickSort(array, 0, array.length - 1);

        // for (int i : array) {
        //     System.out.printf("%d", i);
        // }
        

        //string 배열
        //문제1) 향상된 for 문을 사용해 String 배열  name의 값을 출력하시오.
        // String[] name = new String[3];
        // name[0] = "kim";
        // name[1] = "park";
        // name[2] = "lee";
        
        // for(String str : name){
        //     System.out.println(str);
        // }
        
        //문제2) name 배열의 원소에서 각 문자열의 첫글자를 대문자로 출력하시오.
        // String[] name = new String[3];
        // name[0] = "kim";
        // name[1] = "park";
        // name[2] = "lee";
        
        // for(String str : name){
        //     System.out.println(str.toUpperCase().charAt(0));
        // }

        //문제3) split 함수를 사용해 콤마를 기준으로 문자열을 문자열 배열로 만드시오.
        // String str = "a,b,c,d,e";
        // String[] strArr = str.split(",");
        // System.out.println(Arrays.toString(strArr));

        //문제4) String 배열에 "hello" 가 포함되어 있으면 "안녕하세요."를 출력하고, 그렇지 않으면 "안녕히가세요."를 출력하시오.

        // String[] strArr = {"asdahelloasda","asdadafca", "asdadada"};
        // for(String str : strArr){
        //     if(str.contains("hello")){
        //         System.out.printf("문자열: %s안녕하세요");
        //     }
        //     else{
        //         System.out.printf("안녕히가세요");
        //     }
        // }

        //다차원 배열
        // int[][] arr = new int[2][3];
        // int k = 10;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         arr[i][j] = k;
        //         k+=10;
        //         System.out.print(arr[i][j] + " ");
        //     }

        //     System.out.println();
        // }

        //문제1) arr의 원소를 출력하세요
        // int[][] arr2 = {
        //     {10, 20, 30},
        //     {40, 50, 60}
        // };

        // for(int[] i : arr2){
        //     System.out.println(Arrays.toString(i));

        //문제2) arr의 원소를 출력하시오.
        // int[][] arr = new int[3][];
        // arr[0] = new int[2];
        // arr[1] = new int[4];
        // arr[2] = new int[1];

        // int[][] arr2 = {
        //     {10, 20},
        //     {10, 20, 30, 40},
        //     {10}
        // };
        // for(int i[] : arr2)
        //     System.out.println(Arrays.toString(i));

    }
    // |  start  |    |    |    |    |    |  end  |
    // public static void quickSort(int array[], int start, int end) {
    //     if (start >= end)// 원소가 1개일 경우
    //         return;

    //     int pivot = start; // 피봇을 왼쪽으로 잡음
    //     int left = start + 1;
    //     int right = end;

    //     while (left <= right) // 왼쪽과 오른쪽이 서로 만날때까지 반복
    //     {
    //         // 피벗보다 큰 데이터를 찾을때 까지 반복
    //         while (left <= end && array[left] <= array[pivot])
    //             left += 1;
    //         while (right > start && array[right] >= array[pivot])
    //             right -= 1;
    //         if (left > right) { // 엇갈렸다면 작은 데이터와 피벗을 교체
    //             int tmp = array[right];
    //             array[right] = array[pivot];
    //             array[pivot] = tmp;
    //         } else { // 엇갈리지 않았으면 작은 데이터와 큰 데이터를 교체
    //             int tmp = array[right];
    //             array[right] = array[left];
    //             array[left] = tmp;
    //         }
    //         // 분할 이후 왼쪽과 오른쪽 부분에서 각각 정렬 수행
    //         quickSort(array, start, right - 1);
    //         quickSort(array, right + 1, end);
    //     }
    // }
}
