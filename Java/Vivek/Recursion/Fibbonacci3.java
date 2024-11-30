package Recursion;

public class Fibbonacci3 {
    static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int count = 18;
        for(int i =0; i<count;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
