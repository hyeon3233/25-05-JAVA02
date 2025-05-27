package ch03;

public class Confirmation01 {
    public static void main(String[] args) {
        // 3번 문제
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        System.out.println(pencilsPerStudent); // 17

        int pencilsLeft = pencils % students;
        System.out.println(pencilsLeft); // 24

        System.out.println("---------");

        // 4번 문제
        int value = 356;
        System.out.println( value / 100 * 100);
        System.out.println( (int) (value * 0.01) * 100 );
        System.out.println( value - value % 100 );

        System.out.println("---------");

        // 6번 문제
        int x = 10;
        int y = 5;
        System.out.println( (x > 7) && (y <= 5) ); // true
        System.out.println( (x % 3 == 2) || (y % 2 != 1)); // false

        // 7번 문제
        double x1 = 5.0;
        double y1 = 0.0;
        double z1 = 5 % y;

        if (Double.isNaN(z1)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z1 + 10;
            System.out.println("결과: " + result);
        }
    }
}
