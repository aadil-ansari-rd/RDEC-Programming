import java.util.Scanner;

public class PallindromNumber {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = pc.nextInt();
        
        // To find the number of digits in the input number . 
        int i , n = 0 , num = number ;
        for(i=1; i<=number; i++){
            num = num/10;
            if (num==0){
                i=number+1;
            }
            n=n+1;
        }
        System.out.println(" Total digits are : "+n);

        // To find the reverse digit number of the input number .
        int j ,pal=0 , r,  num1= number ; 
        for(j=1;j<=n;j++ ){
            r=num1%10;
            pal = pal *10 +r ;
            num1=num1/10;
        }
        System.out.println(" Reverse digit number is : "+pal);
        if(pal==number){
            System.out.println("This is a pallindrom number");
        }
        else{
            System.out.println("This is not a pallindrom number");
        }
        pc.close();
    }
}
