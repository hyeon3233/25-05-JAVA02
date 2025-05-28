package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        // 20~30 까지 모두 더한 값을 출력
        // for문 사용

        int sum = 0;

        for (int i = 20; i < 31; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}
