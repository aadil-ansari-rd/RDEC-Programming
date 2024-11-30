import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner gc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int n = gc.nextInt();
        int i , r=n ;
        int m = n ; 

        if(n<2){
            System.out.println( n + " is not a prime numbes");
        }
        else if(n==2){
            System.out.println(n + " is a prime number");
        }
        else{
            for(i=2; i < n; i++){
               r = m  % i;
               if(r==0){
                i = n+1;
               }
            }
             if(r==0){
                System.out.println( n + " is not a prime numbes");
             }
             else{
                System.out.println(n + " is a prime number");
             }
        }
        gc.close();
        
    }
    
}
