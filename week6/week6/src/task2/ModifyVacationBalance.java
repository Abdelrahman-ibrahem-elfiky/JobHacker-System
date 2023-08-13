package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ModifyVacationBalance {
    public static void main(String[] args) {

        try{
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/systemunivercity","dbabdo","dbabdo");
            String query="update employee set vacation_balance=45 ";
            PreparedStatement ps=connection.prepareStatement(query);
            ps.addBatch();
            ps.executeBatch();
            connection.close();
            System.out.println("Batch update completed successfully!");

        }catch (Exception EXC)
        {
            System.out.println(EXC.toString());
        }

    }
}
