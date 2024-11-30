import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
        System.out.println("Type a letter");
        char let = ic.next().charAt(0);

        if ((let=='a')||(let=='A'))
        {
            System.out.println(" This is a vowel");
        }
        else if ((let=='e')||(let=='E'))
        {
            System.out.println(" This is a vowel");
        }
        else if ((let=='i')||(let=='I'))
        {
            System.out.println(" This is a vowel");
        }
        else if ((let=='o')||(let=='O'))
        {
            System.out.println(" This is a vowel");
        }
        else if ((let=='u')||(let=='U'))
        {
            System.out.println(" This is a vowel");
        }
        else
        {
            System.out.println("This is not a vowel");
        }
        ic.close();


    }
}
