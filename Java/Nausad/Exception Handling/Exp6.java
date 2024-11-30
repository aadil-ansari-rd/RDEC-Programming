class MyEx6{
    public void take(){
        try{
            int a[]= {10, 40,12,11, 14};
            System.out.println( a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch code ...");
        }
        finally{
            System.out.println("Finally code here ...");
        }
    }
    public void show(){
        try{
            System.out.println("Welcome to exception");
            int a= 10, b=0, c;
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Problem created");
        }
        finally{
            System.out.println("Finally code one ....");
        }
        

    }
}
public class Exp6 {
    public static void main(String[] args) {
       try {System.out.println("Hello world"); 
       MyEx6 p = new MyEx6();
       p.show();
       System.out.println("After show method");
        }
        catch(Exception e){
            System.out.println("Exception in main");
        }
        finally{
            System.out.println("Finally in main ...");
        }
    }
}
