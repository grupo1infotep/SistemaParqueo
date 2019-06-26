package Controllers;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionController {
   
    private Connection connection;
    
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_parqueo_bd","root","");
            return connection; 
        } catch (Exception ex) {
            return null;
        }
    }
    
    public boolean Desconectar(){
        try {
            connection.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
}
