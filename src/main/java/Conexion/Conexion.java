
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private String bd = "bd_carrito";
    private String user = "root";
    private String pass = "";
    private String url = "jdbc:mysql://localhost:3306/" + bd;

    public Conexion() {
    }
    
    private Connection con;
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection(url, user, pass);
            System.out.println("conectado");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            System.out.println("error");
        }
        return con; 
    }
    
    
    public void Desconectar(){
        try {
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    
}
