package Recursion;
import java.util.Scanner;

public class Factorial {
    static int fact(int x){
        if (x==1) {
            return 1 ;
            }
        return x*fact(x-1);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int f = fact(n);
        System.out.println("Factorial is " + f);
        sc.close();
    }
}
