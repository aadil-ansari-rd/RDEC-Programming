import java.util.Scanner;

public class Number2Binary {
    static void convert(int number){
        int[] a = new int [32];
        int b=0;
        if(number%2==0){
            a[b]=1;
            number = number/2;
            b++;
        }
        while (number!=0) {
            if(number==1){
                a[b]=0;
                number=number/2;
            }
            int r = number%2;
            a[b]= r;
            b++;
            number= number/2;
        }
        for(int i=0;i<b;i++){
            System.out.print(a[i]);
        } 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Binary Number Is : ");
        convert(number);
        sc.close();
    }
}
