import java.util.Scanner;

public class Digitp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while(num!=0){
            int r = num%10;
            num= num/10;
            System.out.println(r);
        }
        sc.close();
    }
}
