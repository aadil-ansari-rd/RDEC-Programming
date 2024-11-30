package Array;

import java.util.Scanner;

public class AutomorphicInd {
    static int len(int n ){
        int l = 0 ;
        while(n!=0){
            l++;
            n =n/10 ;
        }
        return l ;
    }

    static void check(int n){
        int tens, newnum  ;
        int sq = n*n ;
        int lenghth = len(n);
        tens = (int) Math.pow(10,lenghth);
        newnum = sq% tens;
        if(newnum==n){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 145, 153, 46, 76, 123, 45 };
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the index number you want to check : ");
        int i = sc.nextInt();
        check(arr[i]);
        sc.close();
    }
}
