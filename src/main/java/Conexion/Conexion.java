
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
    
    //variables de consulta Statement, PrepareStatement y ResultSet
    private Statement st;
    private PreparedStatement pst;
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
    public void Create( String tabla,String columna,String valor){
        String query="insert into "+tabla+"("+columna+") value (?)";
        try {
            pst=Conectar().prepareStatement(query); 
            pst.setString(1,valor);
            pst.executeUpdate();
            System.out.println("Insertado");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
//------------------------------------------------------------------------------
    public void Create( String tabla,String columna,int valor){
        String query="insert into "+tabla+"("+columna+") value (?)";
        try {
            pst=Conectar().prepareStatement(query); 
            pst.setInt(1,valor);
            pst.executeUpdate();
            System.out.println("Insertado");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
//------------------------------------------------------------------------------
    public void Create( String tabla,String colId,int id,String columna,String valor){
        String query="insert into "+tabla+"("+colId+","+columna+") value (?,?)";
        try {
            pst=Conectar().prepareStatement(query); 
            pst.setInt(1,id);
            pst.setString(2,valor);
            pst.executeUpdate();
            System.out.println("Insertado");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
//------------------------------------------------------------------------------
     public void Create( String tabla,String colId,int id,String columna,int valor){
        String query="insert into "+tabla+"("+colId+","+columna+") value (?,?)";
        try {
            pst=Conectar().prepareStatement(query); 
            pst.setInt(1,id);
            pst.setInt(2,valor);
            pst.executeUpdate();
            System.out.println("Insertado");
        } catch (Exception e) {
            System.err.println(e);
        }
    }  
//------------------------------------------------------------------------------
//     public void Create( String tabla, columna,int valor){
//        String query="insert into "+tabla+"("+columna+") value (?,?)";
//        try {
//            pst=Conectar().prepareStatement(query); 
//            pst.setInt(1,id);
//            pst.setInt(2,valor);
//            pst.executeUpdate();
//            System.out.println("Insertado");
//        } catch (Exception e) {
//            System.err.println(e);
//        }
//    }  
     
     
     
     
     
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
    public void Update (String tabla , String nomId,int id, String columna,String valor){
//  el parametros tabla indica la tabla de la base de datos
//  el parametro nomId es como se llama la columna que llevas las llaves primarias
//  el parametro id seleciona la fila que contega el volor id indicado
//  el parametro colummna seleciona la coluna a cambiar
//  el parametro ingresa el valor que se va a ingresar
        String query = "update "+tabla+" set "+columna+" = ? where "+nomId+" = ?;";        
        try {
             pst=Conectar().prepareStatement(query);
             pst.setString(1,valor);
             pst.setInt(2, id);
             pst.executeUpdate();
             System.out.println("Usuario actualizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
// -----------------------------------------------------------------------------
    public void Update (String tabla , String nomId,int id, String columna,int valor){
        String query = "update "+tabla+" set "+columna+" = ? where "+nomId+" = ?;";        
        try {
             pst=Conectar().prepareStatement(query);
             pst.setInt(1,valor);
             pst.setInt(2, id);
             pst.executeUpdate();
             System.out.println("Usuario actualizado correctamente.");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
// -----------------------------------------------------------------------------
    
    
    
    
    //delete
    
    
    
}
