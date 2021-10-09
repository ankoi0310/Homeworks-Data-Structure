package GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int a, int b) {
        if (a < b) {
            return greatestCommonDivisor(b, a);
        }
        if (a % b == 0) {
            return b;
        }
        return greatestCommonDivisor(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(72, 36));
    }
}
