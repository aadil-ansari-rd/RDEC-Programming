import java.util.Scanner;

public class SeasonDet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month : ");
        String choice = sc.nextLine();
        switch(choice){
            case "January" :
            case "February" :
            case "November" :
            case "December" :
            System.out.println("Winter");
            break;
            case "March" :
            case "April" :
            System.out.println("Spring");
            break;
            case "May" :
            case "June" :
            case "July" :
            case "August" :
            System.out.println("Summer");
            break;
            case "September" :
            case "October" :
            System.out.println("Fall");
            break;
            default:
            System.out.println("Wrong input");
            break;
        }
        sc.close();
    }
}
