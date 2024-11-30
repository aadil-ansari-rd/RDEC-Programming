import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the colour of traffic light : Red , Yellow or Green ?");
        String choice = sc.nextLine();
        switch(choice){
            case "Red":
            System.out.println("Next color : Yellow");
            break;
            case "Yellow":
            System.out.println("Next color : Green ");
            break;
            case "Green":
            System.out.println("Next color : Red ");
            break;
            default:
            System.out.println("Wrong Input");
            sc.close();
        }

    }
}
