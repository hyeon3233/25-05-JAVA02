package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 배열 공간 먼저 확보
        int[] arr1 = new int[3];

        // arr1[0]: 0
        // arr1[1]: 0
        // arr1[2]: 0

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "]: " + arr1[i]);
            }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (i + 1) * 10;
            System.out.println("arr1[" + i + "]: " + arr1[i]);
        }
    }
}

                                                                 