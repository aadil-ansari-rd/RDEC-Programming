class MyArray{
    public void show(){
        int a[]={10, 20, 30, 40,50};
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    // Sum of array 
    public void sum(){
        int a[]={10, 20, 30, 40,50};
        int sum=0;
        for(int i =0;i<a.length;i++){
            sum =sum+a[i];
        }
        System.out.println("Sum of array element : "+sum);
    }
    public void max(){
        int a[]={10, 20, 30, 40,50};
        int max=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Maximum element : "+max);
    }
    public void min(){
        int a[]={10, 20, 30, 40,50};
        int min=a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Minimun element : "+min);
    }
    
    
    public void AddTwoArr(){
        int a[]={10, 20, 30, 40,50};
        int b[]={10, 20, 30, 40,50};
        int c[]= new c[10];
        for(int i =0;i<a.length;i++){
            c[i]= a[i]+b[i];
            System.out.println(c[i]);
        }
    }
}
public class Array1 {
    public static void main(String[] args) {
        MyArray z = new MyArray();
        // z.show();
        // z.sum();
        // z.max();
        // z.min();
        z.AddTwoArr();
       
    }
}
