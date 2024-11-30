package Recursion;

import java.util.Scanner;

public class RevDigit {
    static void digitp(int num ){
        if(num==0){
            return;
        }
        int r = num%10;
        System.out.print(r);
        digitp(num/10);
        // System.out.print(r);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        digitp(num);
        sc.close();
    }
}

