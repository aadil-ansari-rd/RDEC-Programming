package ForPatterns;

import java.util.Scanner;

public class PP0 {
    // If number of rows and column are odd number .
    // *****
    // *   *
    // * * *
    // *   *
    // *****
    public static void main(String[] args) {
        int i, j;
        Scanner tc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of box");
        int r = tc.nextInt();
        int c = tc.nextInt();

        if (r % 2 != 0 || c % 2 != 0) {
            for (i = 1; i <= r; i++) {
                for (j = 1; j <= c; j++) {
                    if (i == 1 || i == r || j == 1 || j == c || (i == r / 2 + 1 && j == c / 2 + 1))

                    {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
