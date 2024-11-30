class MyEx2{
    public void show(){
        try{
            int a=10;
            int b=0;
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Problem");          
            e.printStackTrace();                // print exception class name + name of type of exceptiion + stack(Method + LIne number)
            System.out.println();
            System.out.println(e.toString());   // print exception class name + the name of type of exception
            System.out.println();
            System.out.println(e.getMessage()); // print only the name of type of exception
        }
    }
}
public class Exception3 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MyEx2 r = new MyEx2();
        r.show();
    }
}
