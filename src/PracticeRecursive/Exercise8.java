package PracticeRecursive;

public class Exercise8 {
    /*
        QUESTION 5: Hãy tính tổng các chữ số chẵn của số nguyên dương
    */
    public static int sumEvenIntegers(int n) {
        if (n < 10) {
            if (n % 2 == 0) {
                return n;
            }
            return 0;
        }
        int sum = 0;
        if (n % 10 % 2 == 0) {
            sum += n % 10;
        }
        return sum + sumEvenIntegers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumEvenIntegers(1234567899));
    }
}
