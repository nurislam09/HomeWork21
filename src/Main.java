import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try(FileReader fileReader=new FileReader("text.txt")){
            Scanner scanner = new Scanner(fileReader);
            int a =1;
            System.out.println(scanner.nextLine());
            while (scanner.hasNext()){
                System.out.println(a+" "+scanner.nextLine());
                a++;
            }

        }catch (IOException e){
            System.out.println("ERROR!");
        }
    }
}