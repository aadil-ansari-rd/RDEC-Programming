package Recursion;

public class AutomorphicNum {
    static int  lenghth(int n){
        if(n==0){
            return 0 ;
        }
        return 1 + lenghth(n/10);
    }
    static void isAutomorphic(int n){
        int sq = n*n;
        int ten = (int) Math.pow(10, lenghth(n));
        int r = sq%ten;
        if(n==r){
            System.out.println("Automprphic Number");
        }
        else{
            System.out.println("Not Automprphic Number");
        }
    }
    public static void main(String[] args) {
        isAutomorphic(76);
    }
}
