import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        //1. Load the JDBC Driver: JDBC requires the database-specific driver to be loaded.
        //2. Establish a Connection: Use DriverManager.getConnection() to establish a connection to the database.
        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String username = "root";
        String password = "";


        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful");
            //step 3: create connection statement
            Statement statement = conn.createStatement();
            //step 4

            ResultSet allrecord = statement.executeQuery("SELECT * FROM record");
            while (allrecord.next()){
                String myexam = allrecord.getString("exam");
                int myscore = allrecord.getInt("score");
                System.out.println(myexam);
                System.out.println(myscore);
            }

            //insert query
            statement.executeUpdate("INSERT INTO record(test) VALUES()")
            System.out.println("Inserted sucessfully");
            statement.executeUpdate("UPDATE")


        }
        catch(SQLException e){
            System.out.println(e.getMessage());

        }
         //3. Create a Statement: Use Connection.createStatement() or Connection.prepareStatement() to execute SQL queries.
        //4. Execute Queries: Use methods like executeQuery() for SELECT queries or executeUpdate() for INSERT, UPDATE, and DELETE queries.




    }
}
