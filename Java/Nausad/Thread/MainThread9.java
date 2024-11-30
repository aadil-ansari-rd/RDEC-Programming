class Mythread9 extends Thread{
    int total = 0;
    public void run(){
        for(int i=0;i<=100;i++){
            total = total +i;
            
        }
        
    }  
}
public class MainThread9 {
    public static void main(String[] args) {
        try{
        System.out.println("Hello world");
        Mythread9 t = new Mythread9();
        t.start();
        t.join();
        System.out.println(t.total + " Total ....");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
