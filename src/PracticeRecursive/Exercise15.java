package PracticeRecursive;

public class Exercise15 {

    /*
        QUESTION 15: Hãy kiểm tra 1 số có phải là số nguyên tố hay không?
    */
    public static boolean isPrimeNumber(int n, int k) {
        if (n <= 2) return n == 2;
        if (n % k == 0) return false;
        if (k > Math.sqrt(n)) return true;
        return isPrimeNumber(n, ++k);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(149, 2) ? "This is prime number" : "This is not prime number");
    }
}
