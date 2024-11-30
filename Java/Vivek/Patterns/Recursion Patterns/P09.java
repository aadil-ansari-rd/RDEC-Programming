package Recpatterns;

public class P9 {
    // * * * * * 
    //   * * * *
    //     * * *
    //       * *
    //         *
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
        
        star(c, r);
        System.out.println();
        pat(r - 1, c);
    }

    public static void main(String[] args) {
        pat(5, 5);
    }
}
