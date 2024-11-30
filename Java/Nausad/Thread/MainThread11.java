class Mythread11 extends Thread{
    public void run(){
        try{
            for(int i= 0 ;i<10;i++){
                System.out.println("Child Thread...");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class MainThread11 {
    public static void main(String[] args) {
        System.out.println("Hello");
        Mythread11 p = new Mythread11();
        p.setDaemon(true);
        p.start();
        System.out.println("Main Thread...");
        System.out.println("Thanks for writting the code...");
        //if main thread complete its execution first then the child thread which 
        // is daemon thread will be terminated . so , the child thread will not execute.

    }
}
