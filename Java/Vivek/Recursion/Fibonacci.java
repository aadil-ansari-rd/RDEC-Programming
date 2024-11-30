package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int c = 0, b = 1, a = 0;

    static void fib(int n) {
        if (n < 2) {
            return;
        }
        if (c == 1) {
            System.out.print("1" + " ");
        }
        if (n == 1 && c == 1) {
            return;
        } else {
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
            fib(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of terms you want to print");
        int num = sc.nextInt();
        System.out.println("Here is the series : ");
        fib(num);
        sc.close();

    }
}
