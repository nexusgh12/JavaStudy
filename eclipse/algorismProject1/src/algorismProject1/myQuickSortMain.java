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

        //������ ������ �������� ��� ȣ��
        if (left < pr) {
            myQuickSort(a, left, pr);
        }

        //������ ������ �������� ���ȣ��
        if (pl < right) {
            myQuickSort(a, pl, right);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�л� �� �Է� : ");
        int len = sc.nextInt();
        int[] score = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.printf("�л�%d ���� �Է� : ", (i+1));
            score[i] = sc.nextInt();
        }
        System.out.println();
        myQuickSort(score, 0, score.length-1);
        System.out.println("���� ������ ����");
        for (int i = 0; i < len; i++) {
            System.out.printf("%d�� : %d\n", (i+1), score[(len-1)-i]);
        }

    }
}