package Recpatterns;

public class P5 {
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
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
        star(r);
        System.out.println();
        pat(r - 1, c);

    }

    public static void main(String[] args) {
        pat(5, 5);
    }
}
