package Recursion;

import java.util.Scanner;

public class VowCon {
    static void word(String nam){
        nam = nam.toLowerCase();
        if(nam.length()==0){
            return;
        }
        char ch = nam.charAt(0);
        if (ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'){
            System.out.println(ch + " is a vowel .");
        }
        else{
            System.out.println(ch + " is a consonent .");
        }
        
        word(nam.substring(1));
    }
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
        System.out.println("Type a Word");
        String nam = ic.nextLine();
        nam.toLowerCase();
        word(nam);
        ic.close();
    }
}
