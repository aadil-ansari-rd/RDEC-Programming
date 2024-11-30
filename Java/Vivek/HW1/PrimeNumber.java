package HW1;

import java.util.Scanner;

public class PrimeNumber {
    static void prime(int number, int d) {
        if (number < 2) {
            System.out.println("Not a prime number");
            return;
        }
        if (number == 2) {
            System.out.println("Prime Number");
            return;
        }
        if(number>2){
            if(d == number/2){
                System.out.println("Prime Number");
                return;
            }
            if(number%d==0){
                System.out.println("Not Prime Number");
                return;
            }
            
        }
        prime(number, d+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        prime(number, 2);
        sc.close();
    }
}
