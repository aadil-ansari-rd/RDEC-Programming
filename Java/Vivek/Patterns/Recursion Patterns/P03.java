package Recpatterns;

public class P3 {
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    static void star(int n) {
        if (n == 0) {
            return;
        }
        star(n - 1);
        System.out.print("* ");
    }

    static void pat(int r, int c) {
        if (r == 0) {
            return;
        }
        pat(r - 1, c);
        star(r);
        System.out.println();
    }

    public static void main(String[] args) {
        pat(5, 5);
    }
}
