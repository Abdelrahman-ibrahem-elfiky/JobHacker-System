package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
          String createTable="create table employee("+
                  "id int primary key auto_increment,"+
                "F_Name varchar(50),"+
                  "L_Name varchar(50),"+
                  "Sex varchar(20),"+
                  "Age int ,"+
                "Address varchar(30),"+
                  "Phone_Number int ,"+
                  "Vacation_Balance int default 30)";
          try {
              Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/systemunivercity","dbabdo","dbabdo");
            Statement statement =connection.createStatement();
            statement.executeUpdate(createTable);
            System.out.println("Table created successfully.");

          }
          catch (Exception exc)
          {
              System.out.println(exc.toString());
          }
    }

}
