package DBConnection;

import java.sql.*;

/**
 *
 * @author Kris
 */
public class Connector {
    private static String id = "CPHAM13";
    private static String pw = "CPHAM13";
    
    public Connection getConnection() {
        Connection con = null;
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           con = DriverManager.getConnection("jdbc:oracle:thin:@delfi.lyngbyes.dk:1521:KNORD", Connector.id, Connector.pw);
        }
        catch (Exception e) {
            System.out.println("error in Connection");
            System.out.println(e);
        }
        return con;
    }
    
}
