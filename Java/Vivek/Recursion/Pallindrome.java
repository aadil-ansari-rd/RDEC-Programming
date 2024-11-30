package Recursion;

import java.util.Scanner;

public class Pallindrome {
    static int pal(int n, int ten) {
        if (n == 0) {
            return 0;
        }
        int r = n % 10;
        return r * ten + pal(n / 10, ten / 10);
    }

    static int len(int n) {
        if (n == 0) {
            return 0;
        }
        n = n / 10;
        return 1 + len(n);

    }

    static int pow(int b, int e) {
        if (e == 0) {
            return 1;
        }
        return b * pow(b, e - 1);
    }

    static void isPal(int n) {
        int l = len(n);

        int ten = pow(10, l) / 10;

        int pal = pal(n, ten);

        if (pal == n) {
            System.out.println("Pallindrome Number");
        } else {
            System.out.println("Not A Pallindrome Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        isPal(n);
        sc.close();

    }
}
