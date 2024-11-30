class MyExp{
    public void take(){
        try{
            System.out.println("Take method");
            int a=10, b=0,c;
            c= a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Problem during calculation1....");
        }
        catch(Exception e){
            System.out.println("Problem during calculation ....");
        }
    }
    public void show(){
        try{
            take();
            System.out.println("Show Method");
            System.out.println("Working fine");
            int a[]={10,23,21,46,11};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Problem in array");
        }
    }
}
public class Exception2 {
    public static void main(String[] args) {
        MyExp m = new MyExp();
        m.show();
        System.out.println("Hello world");
    }
}
