package Recursion;

public class PrintDigitRL {
    static void digit(int n){
        if(n==0){
            return;
        }
        System.out.println(n%10);
        digit(n/10);
    }
    public static void main(String[] args) {
        digit(12345);
    }
}
