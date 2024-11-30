package HW1;

import java.util.Scanner;

public class AscendingDescending {
    static void ascending(int number) {
        if (number == 0) {
            return;
        }
        ascending(number-1);
        System.out.print(number + " ");
    }
    static void descending(int number) {
        if (number == 0) {
            return;
        }
        System.out.print(number + " ");
        descending(number-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number : ");
        int number = sc.nextInt();
        System.out.println("Ascending series");
        ascending(number);
        System.out.println();
        System.out.println("Descending series");
        descending(number);
        sc.close();

    }
}
