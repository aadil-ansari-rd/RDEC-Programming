package HW1;

import java.util.Scanner;

public class ArmstrongNujmber {
    static int length(int number){
        if(number==0){
            return 0;
        }
        return 1 + length(number/10);
    }
    static int power(int num , int exp){
        if(exp==0){
            return 1;
        }
        return num* power(num, exp-1);
    }
    static int armNum(int number, int exp){
        if(number==0){
            return 0;
        }
        return power(number%10, exp) + armNum(number/10, exp);
        
    }
    static void isArm(int number){
        int exp = length(number);
        int armNum = armNum(number, exp);
        if(armNum==number){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        isArm(number);
        sc.close();
    }
}
