package chapter9;

public class Immutable {
    //This class is immutable, it cannot be edited by any outside obejct, except for the developer.

    final String s = "Hey I'm Immutable";
    final int i = 0;

    public int getMeDatNumba() {
        return i;
    }

    public String toString() {
        return s;
    }
}