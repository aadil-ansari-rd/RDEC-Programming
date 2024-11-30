package Recursion;

import java.util.Scanner;

public class DigitSum {
    static int digitp(int n){
        if(n==0){
            return 0 ;
        }
        int r = n%10;
        return r +  digitp(n/10);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = digitp(num);
        System.out.println(sum);
        sc.close(); 
    }
    
}
