package Recpatterns;

public class P7 {
    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    static void star(int n, int row) {
        if (n == 0) {
            return;
        }
        if (n <= row) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
        star(n - 1, row);

    }

    static void pat(int r, int c) {
        if (r == 0) {
            return;
        }
        pat(r - 1, c);
        star(c, r);
        System.out.println();
    }

    public static void main(String[] args) {
        pat(5, 5);
    }
}
