package ForPatterns;

import java.util.Scanner;

public class P2 {
    
    // *****
    // *   *
    // *   *
    // *   *
    // *****
    public static void main(String[] args) {
        int i, j;
        Scanner tc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of box");
        int r = tc.nextInt();
        int c = tc.nextInt();

        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c)

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
