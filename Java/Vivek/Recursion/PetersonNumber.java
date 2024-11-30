package Recursion;

public class PetersonNumber {
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0 ;
        }
        int r = n%10;
        return fact(r) + sum(n/10);
    }
    static void check(int n){
        int sum = sum(n);
        System.out.println(sum);
        if(sum==n){
            System.out.println("Peterson Number");
        }
        else{
            System.out.println("Not Peterson Number");
        }
    }
    public static void main(String[] args) {
        check(145);
    }
}
