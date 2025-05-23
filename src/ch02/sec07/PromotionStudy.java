package ch02.sec07;

public class PromotionStudy {
    public static void main(String[] args) {
        /*
        자동 타입 변환(Promotion): 작은 타입이 큰 타입으로 대입될 때 발생

        byte < short, char < int < long < float < double

        (모든 타입 + String)이 되면 모든 타입이 String으로 파싱된다.


         */
        byte byteVal = 10;
        int intVal = byteVal;
        System.out.println("intVal: " + intVal);

        char charVal = '가';
        int intVal2 = charVal;
        System.out.println("intVal: " + intVal2);
    }
}
