package HW1;

import java.util.Scanner;

public class StringReverse {
    static void reverseString(String name , int i , int j){
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        
        String name = sc.nextLine();
        int j = name.length();
        reverseString(name, 0, j);
        sc.close();

    }
}
