import java.util.Scanner;

public class Pallindrome {
    static int revnum(int x){
        int y = digitcount(x);
        int i ,r ,rev=0;
        int n = x ;
        for(i=1; i<=y ; i++){
            r=n%10 ;
            rev = rev*10 + r;
            n=n/10;
        }
        return rev ;
    }

    static int digitcount(int x){
        int n = 0 ;
        while(x!=0){
            x/=10;
            n++;
        }
        return n ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        int rev = revnum(num);
        if(num==rev){
            System.out.println("Pallindrome NUmber");
        }
        else{
            System.out.println("Not Pallindrome");
        }
        sc.close();

    }
}
