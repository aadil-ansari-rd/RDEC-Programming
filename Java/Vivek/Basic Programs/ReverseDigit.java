import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = lc.nextInt();
        System.out.println(" Enter the number of digits");
        int num = lc.nextInt();
        int i , r, pal=0;
        for(i=1; i<=num ; i++){
            r=n%10 ;
            pal = pal*10 + r;
            n=n/10;
        }
        System.out.println(pal);
        lc.close();
       
        
    }
    
}
