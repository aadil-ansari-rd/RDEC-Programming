class MyArray1{

    //Insert elements in 2D array and display the array
    public void show(){
        int[][] a = new int[3][3]; // 36 bytes , continuous 1001,1005,....
        int i, j;
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=i+j; // data is being inserted
            }
        }
        System.out.println("Matrix entered by you ....");
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Sum of elements , sum of even numbers and sum of odd numbers of 2D array 
    public void add(){
        int sum=0 ;
        int[][] a = new int[3][3]; // 36 bytes , continuous 1001,1005,....
        int i, j;
        int even=0,odd=0;
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=i+j;// data is being inserted

            }
        }    
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                sum = sum + a[i][j];
                if(a[i][j]%2==0){
                    even = even + a[i][j];
                }
                else{
                    odd = odd + a[i][j];
                }
            }        
        }
        System.out.println("Sum : "+ sum);
        System.out.println("Even Number Sum : "+even); // evan barrow ki book for sql
        System.out.println("Odd Number Sum : "+odd);
    }

    //Greatest element and smallest element in 2D array
    public void minMax(){
        int[][] a = new int[3][3]; // 36 bytes , continuous 1001,1005,....
        int i, j;
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=i+j;// data is being inserted
            }
        }
        int max= a[0][0],min = a[0][0];
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                    
                }
                if(a[i][j]<min){
                    min = a[i][j];
                }
                
            }
            
        }
        System.out.println("Greatest Element : "+ min);
        System.out.println("Smallest Element : "+ min);
        
    }

    //Greatest and smallest element in 2D array ( row wise and column wise )
    public void rowCol(){
        int[][] a = new int[3][3]; // 36 bytes , continuous 1001,1005,....
        int i, j;
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=i+j;// data is being inserted
            }
        }
        for( i =0;i<3;i++){
            int max = a[i][0];
            for(j=0;j<3;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
            System.out.println("Greatest element of row "+i +": "+max);
            
        }
        for( i =0;i<3;i++){
            int max = a[0][i];
            for(j=0;j<3;j++){
                if(a[j][i]>max){
                    max = a[j][i];
                }
            }
            System.out.println("Greatest element of column "+i +": "+max);
            
        }
        for( i =0;i<3;i++){
            int min = a[i][0];
            for(j=0;j<3;j++){
                if(a[i][j]<min){
                    min = a[i][j];
                }
            }
            System.out.println("Smallest element of row "+i +": "+min);
            
        }
        for( i =0;i<3;i++){
            int min = a[0][i];
            for(j=0;j<3;j++){
                if(a[j][i]<min){
                    min = a[j][i];
                }
            }
            System.out.println("Smallest element of column "+i +": "+min);
            
        }
    }

    //Travers the elements of diagonal of matrix also print the greatest and smallest element of the diagonal
    public void diagonal(){
        int[][] a = new int[3][3]; // 36 bytes , continuous 1001,1005,....
        int i, j;
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=i+j;// data is being inserted
            }
        }
        int min = a[0][0],max= a[0][0];
        System.out.print("Diagonal elements are : ");
        for( i =0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    if(a[i][j]>max){
                        max = a[i][j];
                    }
                    if(a[i][j]<min){
                        min = a[i][j];
                    }
                    System.out.print(a[i][j]+ " ");
                }
            }
        }
        System.out.println();
        System.out.println("Greatest element in the diagonal : "+ max);
        System.out.println("Smallest element in the diagonal : "+ min);
    }
}
public class TwoDArray {
    public static void main(String[] args) {
        MyArray1 m = new MyArray1(); 
        m.show();
        m.add();
        m.diagonal();
        m.minMax();
        m.rowCol();
        
    }
}
