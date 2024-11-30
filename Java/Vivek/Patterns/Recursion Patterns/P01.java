package Recpatterns;

public class P1 {
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * * 
    // * * * * *
    static void star(int m) {
        if (m == 0) {
            return;
        }
        System.out.print("* ");
        star(m - 1);
    }
    

    static void p(int m, int n) {
        if (n == 0) {
            return;
        }
        star(m);
        System.out.println();
        p(m, n - 1);

    }

    public static void main(String[] args) {
        p(5, 5);
    }
}
