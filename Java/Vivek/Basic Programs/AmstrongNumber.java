package Functions;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner yc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = yc.nextInt();

        int i, num = n, p = 0, r, sum = 0, power;

        while (num != 0) {
            num /= 10;
            p++;
        }
        num = n;
        while (num != 0) {
            power = 1;
            r = num % 10;
            for (i = 1; i <= p; i++) {
                power = power * r;
            }
            sum = sum + power;
            num = num / 10;
        }

        if (sum == n)

        {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }
        yc.close();
    }
}
