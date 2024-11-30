package ForPatterns;

public class P16 {

    //     *
    //    * *
    //   *   *
    //  *     *
    // ********* 
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (i * 2) - 1; k++) {
                if (k == 1 || k == (2 * i) - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
