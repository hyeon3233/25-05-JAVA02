package ch04.sec04;

public class Mission06 {
    public static void main(String[] args) {
        /*
            1부터 몇까지 더하면 누적합계가 100을 넘지 않는
            제일 큰 수가 무엇인지 알아내는 예제.

            1 + 2 >> 3
            1 + 2 + 3 >> 6

            // 13

         */

        int sum = 0;
        int num = 0;

        while (true) {
            if (sum + num > 100) {
                break;
            }
            num++;
            sum += num;
        }
        System.out.println("제일 큰 수: " + num);
        System.out.println("합계: " + sum);

        /*
        int sum = 0;
        int i = 0;

        while(true) {
            sum += ++i;
                if(sum > 100) {
                i--;
                 break;
            }
        }
        System.out.println("i: " + i )
         */
    }
}
