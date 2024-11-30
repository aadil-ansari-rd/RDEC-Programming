class Display{
    public synchronized void show(String name){
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
class MyThread6 extends Thread{
    Display d;
    String name;
    public MyThread6(Display d , String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.show(name);
    }
}
public class MainThread6 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Display d = new Display();
        MyThread6 t1 = new MyThread6(d, "Ram");
        MyThread6 t2= new MyThread6(d, "Shyam");
        t1.start();
        t2.start();
        System.out.println("kabhi ram le ra kabhi shayaam a ra h koi bole hello koi bole lelo");
    }
}
