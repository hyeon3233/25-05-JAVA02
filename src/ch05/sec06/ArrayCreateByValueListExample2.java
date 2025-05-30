package ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // int[] scores = { 83, 90, 87 };
        int[] scores;
        scores = new int[]{83, 90, 87};
        System.out.println("main: " + Arrays.toString(scores));
        printItem(scores);
    }
    //         리턴타입 [매소드명]  [파라미터(매개변수)]
    public static void printItem(int[] arr) {
        // System.out.println("printItem: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("scores[" + i + "]: " + arr[i]);
        }
    }
}
