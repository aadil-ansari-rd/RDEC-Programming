package HW1;

import java.util.Scanner;

public class SumofDigit {
    static int sum(int number){
        if(number==0){
            return 0;
        }
        int r = number%10;
        return r + sum(number/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number : ");
        int number = sc.nextInt();
        System.out.println("Sum of digits are :"+ sum(number));
        sc.close();
    }
}
