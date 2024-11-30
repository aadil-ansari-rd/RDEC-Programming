package HW1;

import java.util.Scanner;

public class CountZero {
    static int s=0 ;
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
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println(count(number));
        sc.close();
    }
}
