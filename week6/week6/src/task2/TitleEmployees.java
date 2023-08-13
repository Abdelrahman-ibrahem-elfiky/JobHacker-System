package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TitleEmployees {
    public static void main(String[] args) {
        try{

            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/systemunivercity","dbabdo","dbabdo");
            String query="UPDATE Employee SET F_Name = CONCAT('Mr/Mrs. ', F_Name)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            connection.close();
            System.out.println("successfully...");

        }catch (Exception exc)
        {
            System.out.println(exc.toString());
        }
    }
}
