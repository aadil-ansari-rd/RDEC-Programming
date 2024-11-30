package HW1;

import java.util.Scanner;

public class PowerOfN {
    
    static Boolean check(int num, int n) {
        if (num <= 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else if (num % n != 0) {
            return false;
        }
        return check(num / n, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter a number you want to check the power of ");
        int n = sc.nextInt();
        System.out.println(check(number, n));
        sc.close();
    }
}
