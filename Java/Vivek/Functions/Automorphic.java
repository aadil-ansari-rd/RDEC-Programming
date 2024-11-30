import java.util.Scanner;

public class Automorphic {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        check(n);
        sc.close();
        
    }
}
