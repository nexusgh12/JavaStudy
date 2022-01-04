package Homework.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        LottoMachine m1 = new LottoMachine();
        m1.start();
    }
}

class LottoMachine {

    public void start() {

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("로또 번호를 생성하겠습니다. 생성 개수를 입력해주세요> ");
        count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            createNumber(i);
        }
    }

    public void createNumber(int count) {
        int[] lottoNumber = new int[6];
        int bonusNum = 0;
        for (int i = 0; i < 7; i++) {
            if (i < 6)
                lottoNumber[i] = (int) (Math.random() * 45) + 1;
            else if (i == 6)
                bonusNum = (int) (Math.random() * 45) + 1;
        }
        System.out.printf("[%d]: (%d)(%d)(%d)(%d)(%d)(%d) + (%d)%n", count, lottoNumber[0], lottoNumber[1],
                lottoNumber[2], lottoNumber[3], lottoNumber[4], lottoNumber[5], bonusNum);
    }
}
