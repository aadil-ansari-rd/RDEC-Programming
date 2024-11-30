package HW1;

import java.util.Scanner;

public class SumOfEvenAndOddDigit {
    static int even(int number){
        if(number==0){
            return 0;
        }
        int l = 0;
        int lastDigit = number%10;
        if(lastDigit%2==0){
            l = lastDigit ;
        }
        
        return l + even(number/10);
    }
    static int odd(int number){
        if(number==0){
            return 0;
        }
        int l = 0;
        int lastDigit = number%10;
        if(lastDigit%2!=0){
            l = lastDigit ;
        }
        
        return l + odd(number/10);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("Sum of even digits are : "+ even(number));
        System.out.println("Sum of odd digits are : "+ odd(number));
        sc.close();
    }
}
