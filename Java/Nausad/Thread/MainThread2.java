class AvgThread extends Thread{
    public void run(){
        int a1=10,a2=20,a3=30,a4=40,a5=50;
        double avg =(a1+a2+a3+a4+a5)/5;
        System.out.println(avg);
    }
}
class AreaThread extends Thread{
    public void run(){
        int l=20, b=5;
        double area = l*b/2;
        System.out.println(area);
    }
}
public class MainThread2 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        AvgThread p = new AvgThread();
        AreaThread q = new AreaThread();
        p.start();
        q.start();
        p.start();
    }

}
































