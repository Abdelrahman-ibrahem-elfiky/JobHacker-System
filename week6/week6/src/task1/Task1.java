package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) {

        try
        {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/systemunivercity","dbabdo","dbabdo");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select* from doctors");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("user_name") + " " + resultSet.getInt("password")
                        + " " + resultSet.getString("department"));
            }
            connection.close();

        }
        catch (Exception exc)
        {
            System.err.println(exc.toString());
        }



    }
}
