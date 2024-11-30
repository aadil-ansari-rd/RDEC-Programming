import java.util.Scanner;

public class DiscountCalculater{
    public static void main(String[] args) {
        Scanner jc = new Scanner(System.in);
        System.out.println("Enter the total amount = ");
        int totP = jc.nextInt();
        int disc = 1 ; 
        if((totP>=1000)&&(totP<5000))
        {
            disc = 5 ;
            System.out.println(" Your discount is 5% ");

        }
        else if((totP>=5000)&&(totP<10000))
        {
            disc = 10 ;
            System.out.println(" Your discount is 10% ");

        }
        else if((totP>=10000)&&(totP<20000))
        {
            disc = 15 ;
            System.out.println(" Your discount is 15% ");

        }
        else if(totP>=20000)
        {
            disc = 25 ;
            System.out.println(" Your discount is 25% ");

        }
        else{
            System.out.println("Error");
        }
        float discount = (totP * disc )/100;
    
        float pay = totP - discount; 

        System.out.println(" Your payable amount is = " +pay );
        jc.close();


    }
}
