
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell Inspirion 5558
 */
public class conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
        + "database = registros;"
                +"user=sa;"
                +"password=12341234jr;";
        
        try {
            
        Connection con = DriverManager.getConnection(url);
        return con;
           
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
    
}
