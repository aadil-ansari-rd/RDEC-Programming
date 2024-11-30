package Recpatterns;

public class P2 {

    // * * * * *
    // *       *
    // *       *
    // *       *
    // * * * * *
    static void space(int s, int r) {
        if (s == 0) {
            return;
        }

        if (s == 5 || s == 1 || r == 1 || r == 5)
            System.out.print("* ");
        else {
            System.out.print("  ");
        }

        space(s - 1, r);
    }

    static void p(int m, int n) {
        if (n == 0) {
            return;
        }
        space(m, n);
        System.out.println();
        p(m, n - 1);

    }

    public static void main(String[] args) {
        p(5, 5);
    }
}
