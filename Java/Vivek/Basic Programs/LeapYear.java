import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner dc = new Scanner (System.in);
        
        // A leap year is divisible by 4 , but not by 100 unless it is also divisible by 400

        System.out.println(" Enter the year");
        int yr = dc.nextInt();
        if(yr%4==0){
            if(yr%100==0){
              if(yr%400==0){
                System.out.println("Leap year");
              }
              else{
                System.out.println("Not leap year");
              }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not leap year");
        }

      dc.close();

    }
    
}
