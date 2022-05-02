import java.io. FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
public class Task1 {
    public static void main(String[] args){
        FileInputStream fs;
        int bajt;
        try{
            fs = new FileInputStream("emma.txt");
        }
        catch(FileNotFoundException ex){
            System.out.println( "There is no file found");
            return;
        }
        try{
            do{
                bajt = fs.read();
                if(bajt != -1) System.out.println( (char) bajt);
            }while (bajt != 1);
        }
        catch(IOException ex){
            System.out.println( "Error creating file");
        }
        finally {
            try{
                fs.close();
            }
            catch(IOException ex){
                System.out.println( "Error!");
            }
        }
    }
}

