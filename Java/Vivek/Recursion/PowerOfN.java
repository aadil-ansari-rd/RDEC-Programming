package Recursion;

import java.util.Scanner;

public class PowerOfN {
    // Kyoki agr number n ki power me hoga to use baar baar divide
    // karne se last m wahi number wapas aa jaega jisse wo divide
    // kiya ja raha hoga , or us waq last time jab ham divide karenge
    // to n/n=1 aaega or is condition me wo n ki power ne count hoga
    // or true return hoga.

    // else if (num == 1) {
    // return true;
    // } is condition ko
    // else if (num % n != 0) {
    // return false;
    // } is condition ke phle rakhenge nhi to error show hone lagega .
    //kyoki 1%n=1 which is not equal to 0
    
    static Boolean check(int num, int n) {
        if (num <= 0) {
            return false;
        } else if (num == 1) {
            return true;
        } else if (num % n != 0) {
            return false;
        }
        return check(num / n, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter a number you want to check the power of ");
        int n = sc.nextInt();
        System.out.println(check(number, n));
        sc.close();
    }
}
