package Array;

import java.util.Scanner;

public class ArmstrongInd {
    static int pow(int b , int e){
        if(e==0){
            return 1;
        }
        return b * pow(b, e-1);
    }
    static int len(int n){
        if(n==0){
            return 0 ;
        }
        n=n/10;
        return 1 + len(n);

    }
    static int isArm(int n , int l ){
        if(n==0){
            return 0 ;
        }
        int r = n%10;
        int a = pow(r, l);
        int arm = a + isArm(n/10, l);
        return arm ;
    }
    static void checkArma(int n){
        int arm = isArm(n, len(n));
        if(arm==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 4, 153, 46, 4, 123, 45 };
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index number you want to check : ");
        int i = sc.nextInt();
        checkArma(arr[i]);
        sc.close();

    }
}
