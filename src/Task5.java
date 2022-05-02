import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
public class Task5 {
    public static void main(String[] args) throws IOException {
        String  UserAccountNum;
        URL url= new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");


        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter 3 digits of your bank account: ");
        UserAccountNum=br.readLine();


        try (BufferedReader buffR= new BufferedReader(new InputStreamReader(url.openStream()))){
            String lines;
            System.out.println("Reading data from the File");

            while ((lines= buffR.readLine()) != null){
                String words[]= lines.split("\\t+");
                String bankNumber= words[0].trim();
                String bankName=words[1].trim();

                if (bankNumber.equals(UserAccountNum)){
                    System.out.println("Bank Number: " + bankNumber +"\n"+ "Name of your bank is: " +bankName);
                    break;
                }
            }

        }catch (IOException ex){
            System.out.println("An error occurred loading the data");

        }

    }
}
