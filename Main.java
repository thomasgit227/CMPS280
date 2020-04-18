public class Main {
    public static void main(String[] args) {
        final int START = 1;
        // final int END = Integer.MAX_VALUE;
        final int END = 60;

        double total = 0;

        for(int n = START; n <= END; n++) {
            total += 4/(n * (n+2));
        }

        System.out.println(total);
    }
}