class Volume {
    Volume(int a){
        int volume = a*a*a ;
        System.out.println("Volume "+ volume);
    }
    Volume(int l , int b , int h){
        int volume = l*b*h;
        System.out.println("Volume "+ volume);
    }
    Volume(int r , int h){
        double vol = 3.14*r*r*h*1/3;
        System.out.println("Volume "+ vol);
    }
    Volume(float r){
        double volume = (4/3)*3.14*r*r*r ;
        System.out.println("Volume "+ volume);
    }
}
public class MyVolume {
    public static void main(String[] args) {
        Volume v1 = new Volume(10);
        Volume v2 = new Volume(10 , 11 , 12);
        Volume v3 = new Volume(21 , 100);
        Volume v4 = new Volume(7);
    }
}
