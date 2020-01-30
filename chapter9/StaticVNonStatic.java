package chapter9;

public class StaticVNonStatic {

    //'Static' creates one shared instance of on object
    static int a = 9;
    int b = 10;
    public static void main(String[] args) {
        // int result = a + b; Static methods must refer to static variables

        int result = 9 + a;
        System.out.println(result);
    }
}