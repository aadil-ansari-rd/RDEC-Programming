package Recursion;

import java.util.Scanner;

public class NameLetters {
    static void lettersR2L(String name){
        if(name.length()==0){
            return;
        }
        System.out.print(name.charAt(0) + " ");
        lettersR2L(name.substring(1));
    }
    static void lettersL2R(String name){
        if(name.length()==0){
            return;
        }
        lettersL2R(name.substring(1));
        System.out.print(name.charAt(0) + " ");       
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("These are letters from left to right : ");
        lettersR2L(name);
        System.out.println();
        System.out.println("These are letters from right to left : ");
        lettersL2R(name);
        sc.close();
    }
}
