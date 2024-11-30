package Recpatterns;

public class P0 {
    //*****
    static void pat1(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        pat1(n-1);
    }
    public static void main(String[] args) {
        pat1(5);
    }
}
