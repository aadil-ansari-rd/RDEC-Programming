class MyEcp{
    public void show(){
        int a[]= {10,20,30,40,50};
        for(int i=0;i<7;i++){
            System.out.println(a[i]);
        }
    }
    public void show2(){
        
    }
}
public class Exception1 {
    public static void main(String[] args) {
        MyEcp a = new MyEcp();
        a.show();
        System.out.println("End");
    }
}
