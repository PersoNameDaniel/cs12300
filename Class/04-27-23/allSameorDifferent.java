import java.util.Scanner;

public class allSameorDifferent {
    public static boolean allTheSame(double x, double y, double z) {
        if ((x == y) && (x == z)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean allDifferent(double x, double y, double z) {
        if ((x != y) && (x != z) && (y != z)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        int x = scnr.nextInt();
        int y = scnr.nextInt();
        int z = scnr.nextInt();

        System.out.println(allTheSame(x, y, z));
        System.out.println(allDifferent(x, y, z));
    }
}