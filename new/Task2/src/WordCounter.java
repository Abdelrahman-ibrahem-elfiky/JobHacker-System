package Task2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args){


        String filePath = "H:\\JobHacker-System\\week5\\week5 tasks\\src\\Task2\\Lincoln.txt";

        try {
            FileInputStream file = new FileInputStream(filePath);
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next(); // Read the next word
                wordCount++;
            }

            System.out.println("Number of words in the file: " + wordCount);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }


    }
}
