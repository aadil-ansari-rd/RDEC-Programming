import java.util.Scanner;

class Pallindrome{
    public void show(String S){
        String r = "";
        for( int i = S.length() -1 ;i>= 0;i--){
            r= r+ S.charAt(i);

        }
        if(r.equals(S)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
    public void show2(String S){
        int i = 0 , m = 1 ;
        int j = S.length() - 1 ;
        while (j>i) {
            if(S.charAt(i)!=S.charAt(j)){
                m=0;
            }
            i++ ; j--;
        }
        if(m==1){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
}
public class StringPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        Pallindrome a = new Pallindrome();
        a.show(s);
        a.show2(s);
        sc.close();
    }
}
