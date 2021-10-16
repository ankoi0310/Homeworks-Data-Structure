package PracticeRecursive;

public class Exercise1 {

    /*
        QUESTION: Hãy viết hàm chuyển đổi hệ cơ số 10 sang cơ số 2 và ngược lại theo 2 cách
        sử dụng đệ quy và không sử dụng đệ quy?
    */

    public static int binToDecRecursive(int binary) {
        if (binary / 10 == 0) {
            return 0;
        }
        return 0;
    }

    public static int decToBinRecursive(int decimal) {
        if (decimal == 1) {
            return decimal;
        }
        return decimal % 2 + decToBinRecursive(decimal / 2) * 10;
    }

    public static int binToDec(int binary) {
        return 0;
    }

    public static int decToBin(int decimal) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(decToBinRecursive(40));
    }
}
