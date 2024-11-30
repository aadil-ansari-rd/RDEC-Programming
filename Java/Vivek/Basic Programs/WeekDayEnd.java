import java.util.Scanner;

public class WeekDayEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        String choice = sc.nextLine();
        switch(choice){
            case "Sunday":
            System.out.println("It is weekend ");
            break;
            case "Saturday":
            System.out.println("It is weekend ");
            break;
            case "Monday":
            System.out.println("It is a week day ");
            break;
            case "Tuesday":
            System.out.println("It is a week day ");
            break;
            case "Wednesday":
            System.out.println("It is a week day ");
            break;
            case "Thursday":
            System.out.println("It is a week day ");
            break;
            case "Friday":
            System.out.println("It is a week day ");
            break;
            default:
            System.out.println("Wrong input");
            sc.close();
        }

    }
}
