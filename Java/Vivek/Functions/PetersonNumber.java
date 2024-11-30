import java.util.Scanner;

public class PetersonNumber {
    static int fact(int n){
        int i , f = 1 ;
        for(i=1;i<=n;i++){
            f=f*i ;
        }
        return f ;
    }
    static void pet(int n){
        int r , m=n ,sum = 0;
        while(n!=0){
            r = n%10;
            sum = sum + fact(r);
            n= n/10 ;
        }
        System.out.println("Sum : "+ sum);
        if(sum==m){
            System.out.println("Peterson Number");
        }
        else{
            System.out.println("Not Peterson Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        pet(num);
        sc.close();
    }
}
