import java.util.Scanner;

public class nums {

    static void ser(int x){
        int n = x ;
        int count=0 ,d = 1;
        while(x!=0){
            x=x/10;
            count++ ;
        }
        for(int i = 1 ; i<=count;i++){
            d=d*10;
        }
        for(int i=1;i<=count;i++){
            
            System.out.println(n%d);
            n=n-d;
            d=d/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        ser(num);
        sc.nextInt();
        sc.close();

    }
}
