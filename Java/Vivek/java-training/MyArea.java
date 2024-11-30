class Area{
    Area(int k){
        int area = k*k;
        System.out.println(area + " Area ");
    }
    Area(int l , int b){
        int area = l* b;
        System.out.println(area);
    }
}
public class MyArea {
    public static void main(String[] args) {
        byte b1 = 100 ;
        Area a1 = new Area(b1);
        Area a2 = new Area(10, 20);

    }
    
}