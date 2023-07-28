package Task2;

import java.io.*;

public class run {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("H:\\Lincoln.txt");) {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            int numberOfWord = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] word = line.split("\\s+");
                numberOfWord += word.length;
            }

            bufferedReader.close();
            System.out.println("Number of words: " + numberOfWord);

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }}