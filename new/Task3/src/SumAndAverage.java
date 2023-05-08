package Task3;


import com.sun.org.apache.regexp.internal.RE;
import sun.security.krb5.internal.PAData;

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SumAndAverage {
    public static void main(String[] args)
    {
        String pathUrl="http://liveexample.pearsoncmg.com/data/Scores.txt ";//url web
        String filePath="H:\\JobHacker-System\\week5\\week5 tasks\\src\\Task3\\Scores.txt";
        readFromWebToFile(pathUrl);
        getSum(filePath);
         getAverage(filePath);


    }

    public static void readFromWebToFile(String URL)
    {
        try {
            String pathfile="H:\\JobHacker-System\\week5\\week5 tasks\\src\\Task3\\Scores.txt";
            URL url=new URL(URL);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer=new BufferedWriter(new FileWriter(pathfile));
            String word;
            while ((word= reader.readLine())!=null)
            {
                writer.write(word);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Successfully");


        }catch (Exception e)
        {
            System.err.println(e);
        }
    }
    public static void getSum(String filePath)
    {
        int sum=0;
        try{
            File file=new File(filePath);
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextInt())
            {
                int number=scanner.nextInt();
                sum+=number;
            }
            BufferedWriter writer=new BufferedWriter(new FileWriter(filePath,true));
            writer.write("sum ="+sum);
            writer.newLine();
            scanner.close();
            writer.close();
            System.out.println("Successfully");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    public static void getAverage(String filePath)
    {
        int count=0;
        double average=0.0,sum=0.0;
        try{
            File file=new File(filePath);
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextInt())
            {
                int number=scanner.nextInt();
                count++;
                sum+=number;
            }
            average=sum/count;
            BufferedWriter writer=new BufferedWriter(new FileWriter(filePath,true));
            writer.write("average ="+average);
            writer.newLine();
            scanner.close();
            writer.close();
            System.out.println("Successfully");
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
