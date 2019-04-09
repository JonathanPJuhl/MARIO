
package businesslogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;

/* @author hassanainali
 */
public class DatabaseTest {
    
    public static void main(String [] args) throws Exception {
        String user = "root";
        String password = "123456";
        String IP = "localhost";
        String PORT = "3306";
        String DATABASE = "TestDB";
        String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE;
        
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        
        
    }
    
}
