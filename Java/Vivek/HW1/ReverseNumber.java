package HW1;

import java.util.Scanner;

public class ReverseNumber {
    static int length(int number){
        if(number==0){
            return 0;
        }
        return 1+ length(number/10);
    }
    static int power(int num , int exp){
        if(exp==0){
            return 1;
        }
        return num * power(num, exp-1);
    }
    static int reverseNumber(int number){
        if(number==0){
            return 0;
        }
        return number%10 *power(10, length(number)-1) + reverseNumber(number/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("This is the reverse number"+ reverseNumber(number));
        sc.close();
    }
}
