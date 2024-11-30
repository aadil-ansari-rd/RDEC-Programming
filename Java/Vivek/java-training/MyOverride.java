class Parent{
    int a = 10 ;
    public void show(){
        System.out.println("Parent");
    }
    public void take(){
        System.out.println("Hello Parent");
    }
}
class Child extends Parent{
    int a = 100 ;
    public void give(){
        System.out.println("My Properties");
    }
    public void show(){
        System.out.println("Child");
    }
}


public class MyOverride {
    public static void main(String[] args) {
        Parent k = new Child();
        k.take();
        //k.give();
        k.show();
        System.out.println(k.a );
    }
}
