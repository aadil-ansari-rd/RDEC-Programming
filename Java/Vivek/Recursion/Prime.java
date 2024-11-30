package Recursion;

public class Prime {
    static void prime(int n , int div){
        if(n<2){
            System.out.println("Not Prime Number");
            return;
        }
        if(n==2){
            System.out.println("Prime Number");
            return;
        }
        if(n>2){
            if(div == n/2){
                System.out.println("Prime Number");
                return;
            }
            if(n%div==0){
                System.out.println("Not Prime Number");
                return;
            }
            
        }
        prime(n, div+1);
        
        
    }
    public static void main(String[] args) {
        prime(71, 2);
    }
}
