package ch02.sec10;

import java.util.Scanner;

public class Mission02 {
    public static void main(String[] args) {
        /*
        (점수를 입력받는다.)
        점수를 입력 해주세요> 99 (점수 입력 후 엔터)

        (100 초과 혹은 0미만 이면) "잘못된 점수입니다."
        (90점 이상) "A"
        (80점 이상) "B"
        (70점 이상) "C"
        (나머지) "D"
        출력 되도록 해주세요.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.printf("점수를 입력해 주세요> ");
        String str = scanner.next();
        int score = Integer.parseInt(str);
/*
        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
*/

        if (score > 100 || score < 0) {
            System.out.println("잘못된 점수입니다.");
        } else {
            switch (score / 10) {
                case 10, 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("D");
            }
        }
    }
}


