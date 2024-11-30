package HW1;

import java.util.Scanner;

public class PrintDigit {
    static void digitR2L(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number % 10 + " ");
        digitR2L(number / 10);
    }

    static void digitL2R(int number) {
        if (number == 0) {
            return;
        }
        digitL2R(number / 10);
        System.out.print(number % 10 + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("These are digits from left to right");
        digitL2R(number);
        System.out.println();
        System.out.println("These are digits from right to Left");
        digitR2L(number);
        sc.close();
    }
}
