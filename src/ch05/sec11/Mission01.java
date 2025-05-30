package ch05.sec11;

public class Mission01 {
    public static void main(String[] args) {

        System.out.println(args.length);

        int sum = 0;
        for (int i = 0; i < args.length; i++ ) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
