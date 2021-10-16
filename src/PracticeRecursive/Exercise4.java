package PracticeRecursive;

public class Exercise4 {
    /*
        QUESTION 4: Hãy đếm số lượng chữ số của số nguyên dương
     */
    //
    public static int countingPositiveIntegers(long n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countingPositiveIntegers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countingPositiveIntegers(9999999));
    }
}
