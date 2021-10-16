package PracticeRecursive;

public class Exercise6 {
    /*
        QUESTION 6: Hãy tính tích các chữ số của số nguyên dương
    */
    public static int mulPositiveIntegers(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 * mulPositiveIntegers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(mulPositiveIntegers(12345));
    }
}
