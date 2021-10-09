package TowersOfHaNoi;

public class TowersOfHaNoi {

    private static String HaNoiTowers(int n, int start, int aux, int end) {
        if (n == 1) {
            return start + " -> " + end + "\n";
        }
        return HaNoiTowers(n - 1, start, end, aux)
                + start + " -> " + end + "\n"
                + HaNoiTowers(n - 1, aux, start, end);
    }

    public static void main(String[] args) {
        System.out.print(HaNoiTowers(4, 1, 2, 3));
    }
}
