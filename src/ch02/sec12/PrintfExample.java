package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.println("상품의 가격:" + value + "원");
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%,d원\n", value);

        String result = String.format("상품의 가격:%,d원\n", value);
        System.out.println(result);

        System.out.printf("상품의 가격:%11d원\n", value);
        System.out.printf("상품의 가격:%-11d원\n", value);
        System.out.printf("상품의 가격:%011d원\n", value);
        // 정수에서 쓸 수 있는 기능 ( 날짜찍을때 좋음 )

        int year = 2025;
        int mon = 10;
        int day = 11;
        // 2025-09-04
        System.out.printf("%d-%02d-%02d", year, mon, day);

        int radius = 10;
        double area = 3.14159 * radius * radius; // 반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 원의 넓이:%f입니다.\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f입니다.\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f입니다.\n", radius, area);
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f입니다.\n", radius, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
        // String에는 0을 쓸 수 없음.


    }
}
