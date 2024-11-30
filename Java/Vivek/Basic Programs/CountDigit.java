import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = sc.nextInt();
        int i , n = 0 , num = number ;
        // for(i=1; i<=number; i++){
        //     num = num/10;
        //     n=n+1;
        //     if (num==0){
        //         i=number+1;
        //     }            
        // }
        // System.out.println(" Total digits are : "+n);
        // sc.close();

        
        System.out.println(" Total digits are : "+n);
        sc.close();
    }
}
