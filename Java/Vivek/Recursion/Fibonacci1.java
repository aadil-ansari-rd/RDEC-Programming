package Recursion;

import java.util.Scanner;

public class Fibonacci1 {
    static int c = 0, a = 0, b = 1;

    static void fib(int n) {
        if (n > 0) {
            System.out.println(c+" ");
            c = a + b;
            b = c;
            a = b;
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
