package PascalTriangle;

public class PascalTriangle {

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int pascalTriangle(int k, int n) {
        if (n == 0 || k == n) {
            return 1;
        } else {
            return pascalTriangle(k - 1, n - 1) + pascalTriangle(k - 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(i - j) * factorial(j)) + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

        }
    }
}