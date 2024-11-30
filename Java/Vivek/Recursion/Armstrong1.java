package Recursion ;

import java.util.Scanner;

public class Armstrong1 {
    static int pow(int b , int e){
        if(e==0){
            return 1;
        }
        return b * pow(b, e-1);
    }
    static int len(int n){
        if(n==0){
            return 0 ;
        }
        return 1 + len(n/10);

    }
    static int isArm(int n , int l ){
        if(n==0){
            return 0 ;
        }
        int r = n%10;
        int a = pow(r, l);
        int arm = a + isArm(n/10, l);
        return arm ;
    }
    static void checkArma(int n){
        int arm = isArm(n, len(n));
        if(arm==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        checkArma(n);
        sc.close();


    }
}
