package ch05.sec05.method;

public class ChatAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // "남자" 리턴
        String gender2 = checkGender("900212-2998756"); // "여자" 리턴

        //8번째 문자가 '2','4' > 여자
        //8번째 문자가 '1','3' > 남자
        //8번째 문자가 '1','2','3','4'가 아니면 null 리턴
        System.out.println(gender);
        System.out.println(gender2);
    }
    public static String checkGender(String gender){

        char str = gender.charAt(7);

        switch (str) {
            case '1','3':
                return "남자";

            case '2','4':
                return "여자";

            default:
                return "null";
        }
    }
}
