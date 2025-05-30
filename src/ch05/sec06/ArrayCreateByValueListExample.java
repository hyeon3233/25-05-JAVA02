package ch05.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);

        // 인덱스 0번 항목 값 변경
        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int[] scores = { 83, 90, 87};
//
//        int sum = 0;
//        for (int i = 0; i < 3; i++) {
//            sum += scores[i];
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);

        for (int score : scores) {
            score = 10;
        }

        double avg = (double)sum / scores.length;
        System.out.printf("%.1f\n", avg);
    }
}
