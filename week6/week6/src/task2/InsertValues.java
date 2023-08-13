package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertValues {
    public static void main(String[] args) {

        try
        {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/systemunivercity","dbabdo","dbabdo");

            String query="INSERT INTO Employee (F_Name, L_Name, Sex, Age, Address, Phone_Number)" +
                    " VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps=connection.prepareStatement(query);
            for (int i=0;i<5;i++)
          {
               Scanner in=new Scanner(System.in);
            System.out.println("enter first name");
            String firstName=in.next();
            System.out.println("enter last name");
            String lastName=in.next();
            System.out.println("enter gender");
            String sex=in.next();
            System.out.println("enter Age");
            int age=in.nextInt();
            System.out.println("enter address");
            String address=in.next();
            System.out.println("enter phone number");
            int phoneNumber=in.nextInt();
            ps.setString(1,firstName);
            ps.setString(2,lastName);
            ps.setString(3,sex);
            ps.setInt(4,age);
            ps.setString(5,address);
            ps.setInt(6,phoneNumber);
            //ps.addBatch();
            int j=ps.executeUpdate();
            System.out.println(j+" records inserted");
          }

        }
        catch (Exception ecx)
        {
            System.err.println(ecx.toString());
        }
    }
}
