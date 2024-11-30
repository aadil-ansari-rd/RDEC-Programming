class Display8{
    public void show(String name){
        try{
            ;;;;;;;;;//some lines of lines
            synchronized(this){
                for(int i =0 ;i<10;i++){
                    System.out.println("Hello");
                    Thread.sleep(1000);
                    System.out.println(name);
                }
            }
            //some lines of lines
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
class MyThread8 extends Thread{
    Display d;
    String name;
    public MyThread8(Display d , String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.show(name);
    }
}
public class MainThread8 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Display d = new Display();
        MyThread6 t1 = new MyThread6(d, "Ram");
        MyThread6 t2= new MyThread6(d, "Shyam");
        t1.start();
        t2.start();
    }
}
