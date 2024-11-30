class Display7{
    public void show(String name){
        try{
            for(int i =0 ;i<10;i++){
                System.out.println("Hello");
                Thread.sleep(1000);
                System.out.println(name);
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
class MyThread7 extends Thread{
    Display d;
    String name;
    public MyThread7(Display d , String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.show(name);
    }
}
public class MainThread7 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello world");
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread6 t1 = new MyThread6(d1, "Ram");
        MyThread6 t2= new MyThread6(d2, "Shyam");
        t1.start();
        t2.start();
        //since the threads are working on different objects
        // therefore there is no significance of symchronize here
    }
}
