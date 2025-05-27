package ch04.sec02;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        /*
        ( 커맨드 창으로 값을 입력 받을 것이다. )

        점수를 입력해주세요 > 60 (입력 후 엔터)

        (점수가 60점 이상이면) "합격입니다."
        (아니다) "불합격입니다."

        출력되면 된다.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.printf("점수를 입력해 주세요> ");
        String  str = scanner.next();
        int score = Integer.parseInt(str);

        if ( score >= 60 ) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }

    }
}
