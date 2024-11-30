class Mythread4 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class MainThread4 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Mythread4 t = new Mythread4();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }

    }
}
