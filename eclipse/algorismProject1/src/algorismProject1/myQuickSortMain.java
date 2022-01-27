package algorismProject1;


import java.util.Scanner;

public class myQuickSortMain {
    public static void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    public static void myQuickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int pivot = a[(left + right) / 2];

        do {
            while (a[pl] < pivot) {
                pl++;
            }
            while (a[pr] > pivot) {
                pr--;
            }
            if(pl<=pr)
                swap(a, pl++, pr--);
        } while (pl<=pr);

        //정렬후 왼쪽을 재정렬할 재귀 호출
        if (left < pr) {
            myQuickSort(a, left, pr);
        }

        //정렬후 오른쪽 재정렬할 재귀호출
        if (pl < right) {
            myQuickSort(a, pl, right);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력 : ");
        int len = sc.nextInt();
        int[] score = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("학생%d 점수 입력 : ", (i+1));
            score[i] = sc.nextInt();
        }
        System.out.println();
        myQuickSort(score, 0, score.length-1);
        System.out.println("성적 순으로 정렬");
        for (int i = 0; i < len; i++) {
            System.out.printf("%d등 : %d\n", (i+1), score[(len-1)-i]);
        }

    }
}