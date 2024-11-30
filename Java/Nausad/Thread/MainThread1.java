class SimpleIntrestThread extends Thread{
    public void run(){
        int p= 1000, r=5, t=2;
        double si = (p*r*t)/100;
        System.out.println(si);
        run(10003);
    }
    public void run(int i){
        System.out.println(i);
    }
}
public class MainThread1 {
    public static void main(String[] args) {
        System.out.println("Welcome");
        SimpleIntrestThread t = new SimpleIntrestThread();
        t.start();
        System.out.println("hi");

    }
}
