package HW1;

import java.util.Scanner;

public class CountEvenOddDigit {
    static int even = 0, odd = 0;

    static int even(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        if (lastDigit % 2 == 0) {
            even++;
        }
        even(number / 10);
        return even;
    }

    static int odd(int number) {
        if (number == 0) {
            return 0;
        }
        int lastDigit = number % 10;
        if (lastDigit % 2 != 0) {
            odd++;
        }
        odd(number / 10);
        return odd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("Total even digits are : "+even(number));
        System.out.println("Total odd digits are : "+ odd(number));
        sc.close();
    }
}
