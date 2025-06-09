package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
        gugudan(4);

        /*
        4 x 1 = 4
        4 x 2 = 8
        ...
        4 x 9 = 39
         */
        System.out.println("===================");

        gugudan(4, 9); // 4 ~ 9단까지 구구단 출력
        gugudan(2, 4); // 2 ~ 4단까지 구구단 출력
    }
    public static void gugudan(int dan) {
        for (int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n", dan, i , dan * i);
        }
    }
    public static void gugudan(int dan1, int dan2) {
        for ( int i = dan1; i <= dan2; i++) {
            gugudan(i);
            System.out.println("=============");
        }
    }
    public static void gugudan2(int dan3,int dan4) {
        for (int i = dan3; i <= dan4; i++){
            gugudan(i);
        }
    }
}
