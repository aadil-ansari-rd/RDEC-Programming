import java.util.Scanner;

public class PrimeNum1t100 {

    static int check(int x) {
        int r = 1, num = x;
        for (int i = 2; i <= x / 2; i++) {
            r = num % i;
            if (r == 0) {
                i = x;
            }
        }
        if (r != 0) {
            return x;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 ");
        for (int i = 3; i <= 100; i++) {
            int j = check(i);
            if (j != 0) {
                System.out.print(j + " ");
            }
        }
        sc.close();
    }
}
