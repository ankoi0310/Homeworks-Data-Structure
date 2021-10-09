package Algebra;

public class Algebra {

    // 1. S(n) = 1 - 2 + 3 - 4 + ... + ((-1)^(n + 1)).n, n > 0
    public static double algebra1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Math.pow(-1, n + 1) + algebra1(n - 1);
    }

    // 2. S(n) = 1 + 1.2 + 1.2.3 + ... + 1.2.3...n, n > 0
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int algebra2(int n) {
        if (n == 1) {
            return 1;
        }
        int multiply = factorial(n);
        return multiply + algebra2(n - 1);
    }

    // 3. S(n) = 1^2 + 2^2 + 3^2 + ... + n^2, n > 0
    public static double algebra3(int n) {
        if (n == 1) {
            return 1;
        }
        return Math.pow(n, 2) + algebra3(n - 1);
    }

    // 4. S(n) = 1 + 1/2 + 1/(2.4) + 1/(2.4.6) + ... + 1/(2.4.6.2n), n > 0
    public static double algebra4(int n) {
        if (n == 0) {
            return 1;
        }
        return 1 / (Math.pow(2, n) * factorial(n)) + algebra4(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(algebra1(4));
        System.out.println(algebra2(4));
        System.out.println(algebra3(4));
        System.out.println(algebra4(4));
    }
}
