import java.util.Scanner;

public class LeastValueAmong3 {
    public static void main(String[] args) {
        Scanner zc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = zc.nextInt();
        int b = zc.nextInt();
        int c = zc.nextInt();
        int m , n ;
        if (a<b) {
            n = a;
        }
        else{
            n = b;
        }
        if(n<c){
            m = n ;
        }
        else{
            m = c ;
        }
        System.out.println("Least number among the threeis : "+m );
        zc.close();
    }
}
