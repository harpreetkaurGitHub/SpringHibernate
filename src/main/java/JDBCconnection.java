import java.sql.*;
import static java.sql.DriverManager.*;

public class JDBCconnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/emp";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement  = null;

       try {
           connection = DriverManager.getConnection(DB_URL,USER,PASS);
           statement = connection.createStatement();
           String sql = "SELECT * FROM EMPLOYEE";
           ResultSet resultSet = statement.executeQuery(sql);

           while (resultSet.next()){
               System.out.println(resultSet.getInt("id")+": " + resultSet.getString("first")+": "+resultSet.getString("last"));
           }

       }
       catch (Exception e){

       }
    }
}
