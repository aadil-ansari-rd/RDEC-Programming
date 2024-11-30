package HW1;

import java.util.Scanner;

public class SumOfN {
    static int sum(int number){
        if(number==1){
            return 1;
        }
        return number + sum(number-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number : ");
        int number = sc.nextInt();
        System.out.println("The sum upto given natural numbers are : "+ sum(number));
        sc.close();
    }
}
