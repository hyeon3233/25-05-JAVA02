package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        System.out.println("charCode: " + charCode); // 65

        if (65 <= charCode && charCode <= 90) { //대문자
            System.out.println("대문자이군요");
        }
            /*

            true ** treu || false   >>   true

             */

            int value = 7;
            if ( value % 2 == 0 || value % 3 == 0) {
                System.out.println("2 또는 3의 배수이군요.");
            }

            boolean result = (value % 2 == 0) || (value % 3 == 0);
            if ( !result ) {
                System.out.println("2 또는 3의 배수가 아니군요.");
            }
        }
    }

