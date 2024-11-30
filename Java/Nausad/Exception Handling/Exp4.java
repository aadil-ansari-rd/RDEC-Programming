import java.io.*;
class E1{
    public void show(){
        InputStreamReader k = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(k);
        System.out.println("Enter the name ...");
        String s1 ; 
        try{
             s1 = br.readLine();
        }catch(Throwable e){
            System.out.println("no no");
             s1 = "Null";
        }
        
        System.out.println("Your Entered name is : "+ s1);
    }
}

public class Exp4 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        E1 e = new E1();
        e.show();
    }
}
