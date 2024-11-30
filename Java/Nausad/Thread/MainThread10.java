class Mythread10 extends Thread{
    int total=0;
    public void run(){
        try{
            synchronized(this){
                for(int i=0;i<=100;i++){
                    total = total + i;
                }
                this.notify();//there may be 1000 of lines after this notify method
                // but notification will be given to the waiting thread
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class MainThread10 {
    public static void main(String[] args) {
        try{
            System.out.println("Hello world");
            Mythread10 t = new Mythread10();
            System.out.println(t.isDaemon() + " Before start");
            t.setDaemon(true);
            t.start();
            //t.setDaemon(true);   it will show an exception if we setDaemon after start()
            System.out.println(t.isDaemon() +" After start");
            System.out.println("This is main Thread ...");
            synchronized(t){
                t.wait();
                System.out.println(t.total + " t.total ...");
            }
        
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }      
    }
}
