import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
public class Task3 {
    public static void main(String[] args) {
        int bajt;
        try (FileInputStream fs = new FileInputStream("emma.txt");
        FileOutputStream fo = new FileOutputStream("donkor.txt")) {
            //fs = new FileInputStream("emma.txt");
            do {
                bajt = fs.read();
                if (bajt == ' ')  bajt = '_';
                if(bajt != -1 ) fo.write(bajt);
            } while (bajt != 1);
        } catch (IOException ex) {
            System.out.println("Error creating file");
            ex.printStackTrace();
        }
    }
}
