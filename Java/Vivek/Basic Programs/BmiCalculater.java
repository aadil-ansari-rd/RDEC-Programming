import java.util.Scanner;

public class BmiCalculater {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter you weight in kg ");
        System.out.println("Enter your height in meters");
        float w = pc.nextFloat();
        float h = pc.nextFloat();
        float b = w/(h*h);
        System.out.println("Your BMI is : " + b );
        if (b<18.5){
            System.out.println("You are underweight");
        }
        else if (b>=18.5 && b <=24.9){
            System.out.println("You are normal weight");
        }
        else if (b>=25.0 && b <=29.9){
            System.out.println("You are overweight");
        }
        else if (b>=30.0 && b <=34.9){
            System.out.println("You are in obesity class 1 ");
        }
        else if (b>=35 && b <=39.9){
            System.out.println("You are in obesity class 2");
        }
        else if (b> 40){
            System.out.println("You are in obesity class 3");
        }
        else
        {
            System.out.println("You are not alive");
        }
        
        pc.close();
    }
    
}
