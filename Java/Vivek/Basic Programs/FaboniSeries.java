import java.util.Scanner;

public class FaboniSeries {
    public static void main(String[] args) {
        Scanner oc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int t = oc.nextInt();
        int i , a=0 , b=1 , c  ;
        if(t<1){
            System.out.println("Wromg Input");
        }
        else if ( t == 1){
        System.out.println(" 0 ");}
        else if (t==2){
            System.out.println(" 0  1 ");
        }
        else if(t>2){
            System.out.print("0 1 ");
            
            for(i=1 ; i <=t-2 ; i++){
                c = a + b ;
                a = b;
                b= c;
                System.out.print(  + c +"  " );
            }

        }
        oc.close();

    }
}
