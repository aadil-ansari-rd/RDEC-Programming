class Array1{
    public void show(){
        // Continuous(english) ==> continuous memory allocation  ==> array(continuous)
        // Array : We can create the array only for the data types : int , byte , short , char
        

        // 1.  Array Declaration
        //int[] x;  
        //int x[];  
        //int []x;   // we can not paas the length of array at the time of array declaration
        //particuar element ko access karne ke lie jitne script ki jarut hogi aaray utne dimension ka hoga

        // 2.  Array Declaration with initialisation

        int []x = new int[5];  // Array Creation + Memory Allocation 
        

        // 3. Specifications 

        System.out.println(x.getClass().getName());   // Output : "[I"   (class = array , class name = Integer )
        System.out.println(x.length);   // Array length
        System.out.println(x);   // Output : "[I@4617c264"  (class namw + hash code (reference of first element of array))
        
        
    }

    public void show2(){
        //int[] a ,b ;  // iska mtlb ki a or b do lag alg 1 D array hai 
        int[]x = new int[5];
        for(int i=0;i<x.length;i++){
            x[i]=i+10;
        }
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        
    }
}
public class MyArray{
    public static void main(String[] args) {
        Array1 t = new Array1();
        //t.show();
        t.show2(); 
    }
    
}