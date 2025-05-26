package ch02.sec09;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        System.out.println("value1: " + value1);

        double value2 = Double.parseDouble("3.14"); // Wrapper Type Class
        // double value2_1 = (double)"3.14"; 메소드를 이용해서 바꿔야함.
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");

        long value4 = Long.parseLong("100000");

        int intValue = 10;
        //String str1 = intValue + "";
        String str1 = String.valueOf(10); // 실무에서 많이 사용
        String srt2 = String.valueOf(value2);
        System.out.println(str1);
    }
}
