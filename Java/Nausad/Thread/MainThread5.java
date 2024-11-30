class MyThread5 extends Thread{
    public void run(){
        try{
            System.out.println("Child Thread");
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error...");
        }
    }
}
public class MainThread5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world");
        MyThread5 t = new MyThread5();
        t.start();
        t.join();
        for(int i=0;i<10;i++){
            System.out.println("Parent Thread");
        }
    }
}
