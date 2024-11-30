import java.io.*;
class DFile{
    public void copy (){
        try{
            int ch ;
            FileInputStream k = new FileInputStream("abczxculk.txt");
            FileOutputStream k1 = new FileOutputStream("rapid.txt" );
            while (true) {
                ch= k.read();
                if(ch==-1){
                    break;
                }
                else{
                    if(ch>=67 &&ch<71){
                        k1.write(ch);
                    }
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
}