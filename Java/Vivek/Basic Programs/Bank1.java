import java.util.Scanner;

public class Bank1 {
    public static void main(String[] args) {
        Scanner xc = new Scanner(System.in);
        System.out.println("Enter your account balance :");
        int bal = xc.nextInt();
        System.out.println("What do you want to do ? ");
        System.out.println("For checking your balance press 1 ");
        System.out.println("For deposite money press 2 ");
        System.out.println("For withdrawing money press 3 ");
        int ch = xc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Your account balance : "+bal);
                
                break;
            case 2:
                System.out.println("Enter the amount you want to deposite ");
                int dep = xc.nextInt();
                int c = bal + dep;
                System.out.println("Deposite Successfully");
                System.out.println("Your current balance : " +c );
                break;
            case 3 :
                System.out.println("Enter the amount you want to withdraw ");
                int w = xc.nextInt();
                if (w<bal) {
                    int cb = bal-w ;
                    System.out.println("Withdrawal Successfully");
                    System.out.println("Your current balance : " +cb );
                }
                else{
                    System.out.println("Your current balance is low");
                }
                break;
            default:
            System.out.println("Wrong Choice");
                break;

        }
        xc.close();

    }
}
