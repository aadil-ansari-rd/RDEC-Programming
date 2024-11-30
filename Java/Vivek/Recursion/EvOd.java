package Recursion;

import java.util.Scanner;

public class EvOd {
    static void ev(int s , int e){
        if(s>e){
            return;
        }

        if(s%2==0){
            System.out.print(s + " "); 
        }
        else{
            return ;
        }
        ev(s+1, e) ;
    }
    static void od(int s , int e){
        if(s>e){
            return;
        }

        if(s%2!=0){
            System.out.print(s + " "); 
        }
        else{
            return ;
        }
        ev(s+1, e) ;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting & ending number");
        int s = sc.nextInt() ;
        int e = sc.nextInt() ;
        System.out.println("Odd numbers are : "  );  
        od(s, e);
        System.out.println();
        System.out.println("Even numbers are : "  );  
        ev(s, e);
        sc.close();
    }
}
