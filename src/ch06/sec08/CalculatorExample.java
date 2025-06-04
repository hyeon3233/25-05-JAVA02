package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.plus(1, 2);
        System.out.println("result: " + result);
        System.out.println("끝");

        for (int i=0; i<2000; i++) {
        cal.powerOn();
        }
        cal.powerOn();
        cal.powerOn();
        cal.powerOff();

    }
}
