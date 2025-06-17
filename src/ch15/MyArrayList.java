package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size() {
        return arr.length;
    }

    public void add(String str) {
        String[] temp = new String[arr.length + 1];
        temp[size()] = str;
        // 기존값 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];

        }
        this.arr = temp;
    }

    public String get(int index) {
        return this.arr[index];
    }
    // 점검용
    public void checkValues() {
        System.out.println(Arrays.toString(this.arr));
    }
    public void add(int index, String str) {

        String[] temp = new String[arr.length + 1];

        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }

        temp[index] = str;

        for (int i = index; i < arr.length; i++) {
            temp[i + 1] = arr[i];
        }

        this.arr = temp;
    }
    public String remove() {

        String removed = arr[arr.length - 1];
        String[] temp = new String[arr.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        return removed;
    }
    public String remove(int index) {
        String removed = arr[index];
        String[] temp = new String[arr.length - 1];

        for (int i = 0; i < index; i++) {
            temp[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        arr = temp;
        return removed;
    }
}
