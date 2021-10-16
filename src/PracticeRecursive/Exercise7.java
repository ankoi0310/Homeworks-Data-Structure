package PracticeRecursive;

public class Exercise7 {
    /*
        QUESTION 7: Hãy đếm số lượng chữ số lẻ của số nguyên dương
     */
    public static int countingOddIntegers(long n) {
        int count = 0;
        if (n < 10) {
            if (n % 2 == 0) {
                return 0;
            }
            return 1;
        }
        if (n % 10 % 2 == 1) {
            count = 1;
        }
        return count + countingOddIntegers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countingOddIntegers(246810));
    }
}
