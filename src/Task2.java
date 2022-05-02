import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int bajt;
        try (FileInputStream fs = new FileInputStream("emma.txt")) {
            //fs = new FileInputStream("emma.txt");
            do {
                bajt = fs.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != 1);
        } catch (IOException ex) {
            System.out.println("Error creating file");
            ex.printStackTrace();
        }
    }
}
