package Recursion;

import java.util.Scanner;

public class SIIIIIIIIIIIICount {
    static int s=0 , c=0;
    static int count(int number){
        if(number==0){
            return 0;
        }
        int lastdigit= number%10;
        if(lastdigit==0){
            s++;
        }
        count(number/10);
        return s ;
    }
    static int countR(int number){
        if(number==0){
            return 0;
        }
        int lastdigit= number%10;
        if(lastdigit==0){
            s++;
        }
        countR(number/10);
        return s ;
    }
    static int count1(int number){
        if(number==0){
            return 0;
        }
        int lastdigit= number%10;
        if(lastdigit!=0){
            c++;
        }
        count1(number/10);
        return c ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println(count(number));
        System.out.println(countR(number));
        System.out.println(count1(number));
        sc.close();
    }
}
