package Recursion;

public class SumOfDigit {
    static int sumDigit(int n){
        if(n==0){
            return 0;
        }
        int r = n%10;
        return r + sumDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumDigit(12345));
    }
}
