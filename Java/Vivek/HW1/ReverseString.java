package HW1;

import java.util.Scanner;

public class ReverseString {
    static void reverse(String name){
        String revers = "";
        int len = name.length() -1;
        for(int i = len;i>=0;i--){
            revers = revers + name.charAt(i);
        }
        System.out.println(revers);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your reverse name letters are : ");
        reverse(name);
        sc.close();
    }
}
