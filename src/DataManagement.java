import java.io.*;
import java.io.FileReader;
import java.io.IOException;
public class DataManagement {
    String userName;
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    void ReadData() throws IOException {
        System.out.println("Please write your first name and last name: ");
        userName= br.readLine();
    }

    void WriteToFile(){
        try( BufferedWriter bw = new BufferedWriter(new FileWriter("Task4_Emma.txt"))) {
            bw.write(userName+"\n");


        }catch (IOException e){
            System.out.println("An error occurred");
        }

    }
    void ReadFromFile() {
        try(BufferedReader br= new BufferedReader(new FileReader("Task4_Emma.txt"))){
            while ((userName = br.readLine()) != null){
                System.out.println(userName);
            }

        }catch (IOException e) {
            System.out.println("An error occurent while reading the file");
            e.printStackTrace();
        }

    }
}
