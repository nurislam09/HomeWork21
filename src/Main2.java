import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("Letter.txt")) {
            for (char letter = 'A', lower = 'a'; letter <= 'Z' && lower <= 'z'; letter++, lower++) {
                fileWriter.write(letter + "" + lower + "\n");
            }
            for (char i = '0'; i <= '9' ; i++) {
                fileWriter.write(i +"\n");
            }
        } catch (IOException e) {
            System.err.println("Error");
        }
        try (FileReader fileReader = new FileReader("Letter.txt")){
            Scanner scanner = new Scanner(fileReader);
            int i =1;
            while (scanner.hasNext()){
                System.out.println(i+"."+scanner.nextLine());
                i++;
            }
        }
        catch (IOException e){
            System.err.println("Error");
        }




    }

}
