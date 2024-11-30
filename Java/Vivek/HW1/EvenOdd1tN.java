package HW1;

import java.util.Scanner;

public class EvenOdd1tN {
    static void odd(int number){
        if(number==0){
            return;
        }
        odd(number-1);
        if(number%2==1){
            System.out.print(number + " ");
        }
    }
    static void even(int number){
        if(number==0){
            return;
        }
        even(number-1);
        if(number%2==0){
            System.out.print(number + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number : ");
        int number = sc.nextInt();
        System.out.println("Odd numbers are : ");
        odd(number);
        System.out.println();
        System.out.println("Even Numbers are : ");
        even(number);
        sc.close();
    }
}
