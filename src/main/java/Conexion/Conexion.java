
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    private final String bd = "ventas_mg";
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/" + bd;
    
    //variables de consulta Statement y ResultSet
    private Statement st;
    private ResultSet rs;

    public Conexion() {
    }
    
    private Connection con;
    public Connection Conectar(){
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
    
    // C-R-U-D
    
    //create
    public void Create( String tabla){
        
        String query = "select * from "+tabla+" ;";

        try {
            st = Conectar().createStatement();
            rs = st.executeQuery(query);
            System.out.println("Ingreso realizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }
    
    //read
    
    
    //update
    
    
    //delete
    
    
}
