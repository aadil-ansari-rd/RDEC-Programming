import java.util.Scanner;

public class ksdn {
    public static void main(String[] args) {
        Scanner oc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int t = oc.nextInt();
        int i , a=0 , b=1 , c=0  ; 
        for(i=1;i<=t;i++){
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
        }  
    }
}
