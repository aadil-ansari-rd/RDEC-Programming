import java.util.Scanner;

public class TemperatureConver {
    public static void main(String[] args) {
        
        Scanner hc = new Scanner(System.in);
        System.out.println(" What is the temperature :- ");
        float t =  hc.nextFloat();
        System.out.println("Enter the conversion unit");
        char u = hc.next().charAt(0);
        if(u == 'C')
        {
          float f = (9*t/5)+ 32 ;
             System.out.println(" Your temperature in Fahrenheit is = " +f );  
        }
        else if(u=='F'){
            float c = (t - 32)*5/9;
            System.out.println(" Your temperature in Celcius id = " +c );
        }
        else 
        {
            System.out.println(" Wrong Choice");
        }
        hc.close();
    }
}
