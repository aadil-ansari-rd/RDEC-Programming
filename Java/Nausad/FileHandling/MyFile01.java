/*import java.io.*;
class DFile{
    public void copy (){
        try{
            int ch ;
            FileInputStream k = new FileInputStream("abc.txt");
            FileOutputStream k1 = new FileOutputStream("pqr.pdf" , true);
            while (true) {
                ch= k.read();
                if(ch==-1){
                    break;
                }
                else{
                    k1.write(ch);
                }
                
            }
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
class MyFile{
    public static void main(String[] args) {
        DFile k = new DFile();
        k.copy();
    }
}*/