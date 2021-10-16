package PracticeRecursive;

public class Exercise5 {
    /*
        QUESTION 5: Hãy tính tổng các chữ số của số nguyên dương
    */
    public static int sumPositiveIntegers(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumPositiveIntegers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumPositiveIntegers(1234567899));
    }
}
