import java.util.Scanner;

public class Insurence {
    static void Premium( String gen , int age , String city ){
        if(((age>25) && (age<=35))&& (gen.equals("Male"))&&(city.equals("Metro"))){
           System.out.println("Premium is 6%"); 
        }
        else if(((age>25) && (age<=40))&& (gen.equals("Male"))&&(city.equals("Non-Metro"))){
           System.out.println("Premium is 4%"); 
        }
        else if(((age>25) && (age<=42))&& (gen.equals("Female"))&&(city.equals("Metro"))){
           System.out.println("Premium is 3%"); 
        }
        else if(((age>25) && (age<=45))&& (gen.equals("Female"))&&(city.equals("Non-Metro"))){
           System.out.println("Premium is 2%"); 
        }
        else{
            System.out.println("Not Insured");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        //char let = sc.next().charAt(0);
        String name = sc.nextLine();
        System.out.println("Enter Your Gender : Male / Female");
        String gen = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your City Type : Metro / Non-Metro");
        String city = sc.nextLine();
        System.out.println(name);
        Premium(gen, age, city);
        sc.close();
    }
}
