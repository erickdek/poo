package controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class DBConnect {
    private static final String drive = "com.mysql.jdbc.Drive";
    private static final String user = "root";
    private static final String user_pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/poo_p3_db1_estudiante";
    
    Connection conect = null;
    public Connection Conectar (){
        try {
            Class.forName
        } catch (Exception e){
            
        }
        return conect;
    }
}
