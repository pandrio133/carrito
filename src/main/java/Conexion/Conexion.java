
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
    public ArrayList Read (String tabla, int NColumnas){
        
        String query = "select * from "+tabla+" ;";
        
        String col;
        ArrayList<String> re = new ArrayList<String>();
        
        try {
            st = Conectar().createStatement();
            rs = st.executeQuery(query);
            int i=1;
            while(rs.next()) {
                while (i<=NColumnas) {                    
                    col = rs.getString(i);
                        re.add(col);
                        ++i;
                }
                i=1;
            }
            
            
            System.out.println("Consulta realizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return re;
    }
//------------------------------------------------------------------------------  
    public ArrayList Read (String tabla, String columna){
        String query = "select "+columna+" from "+tabla+" ;";
        
        String col;
        ArrayList<String> re = new ArrayList<String>();
        
        try {
            st = Conectar().createStatement();
            rs = st.executeQuery(query);
            
           while (rs.next()) {                
                        col = rs.getString(1);
                        
                        re.add(col);
                    }
            System.out.println("Consulta realizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return re;
    }
//------------------------------------------------------------------------------
    public ArrayList Read (String tabla,int NColumnas ,String columnaWhere, String dato){
        String query = "select * from "+tabla+" where "+columnaWhere+"="+dato+";";
        
        String col;
        ArrayList<String> re = new ArrayList<String>();
        
        try {
            st = Conectar().createStatement();
            rs = st.executeQuery(query);
            int i=1;
            while(rs.next()) {
                while (i<=NColumnas) {                    
                    col = rs.getString(i);
                        re.add(col);
                        ++i;
                }
                i=1;
            }
            System.out.println("Consulta realizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return re;
    }
    
    
    
    
    //update
    
    
    //delete
    
    
}
