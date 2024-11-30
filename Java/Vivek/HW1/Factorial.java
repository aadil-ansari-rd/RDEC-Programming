package HW1;

import java.util.Scanner;

public class Factorial {
    static int factorial(int number){
        if(number==0){
            return 1;
        }
        return number * factorial(number-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("This is the factorial of the given number : "+ factorial(number));
        sc.close();
    }
}
