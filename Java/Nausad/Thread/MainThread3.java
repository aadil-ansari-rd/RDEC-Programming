class MyThread3 extends Thread{
    public void run(){
        System.out.println("Priority of second thread is : "+ Thread.currentThread().getPriority());
        for(int i=0; i<10;i++){
            System.out.println("My Thread ...");
        }
    }
}
public class MainThread3 {
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("Priority of Main thread is : "+ Thread.currentThread().getPriority());
        MyThread3 t = new MyThread3();
        t.setPriority(10);
        t.start();
        
        for(int i=0; i<10;i++){
            System.out.println("Main Thread ...");
        }
    }
}
