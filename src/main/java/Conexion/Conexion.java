
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
        
        String c_1,c_2,c_3,c_4,c_5,c_6;
        ArrayList<String> re = new ArrayList<String>();
        
        try {
            st = Conectar().createStatement();
            rs = st.executeQuery(query);
            
            switch (NColumnas) {
                case 1:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);

                        System.out.println(
                            c_1+"\n"+
                            "-------"
                        );
                        
                        re.add(c_1);
                        re.add("------------");
                    }
                    break;
                case 2:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);
                        c_2 = rs.getString(2);

                        System.out.println(
                            c_1+"\n"+
                            c_2+"\n"+
                            "-------"
                        );
                        re.add(c_1);
                        re.add(c_2);
                        re.add("------------");
                    }
                    break;
                case 3:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);
                        c_2 = rs.getString(2);
                        c_3 = rs.getString(3);

                        System.out.println(
                            c_1+"\n"+
                            c_2+"\n"+
                            c_3+"\n"+
                            "-------"
                        );
                        re.add(c_1);
                        re.add(c_2);
                        re.add(c_3);
                        re.add("------------");
                    }
                     
                    break;
                case 4:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);
                        c_2 = rs.getString(2);
                        c_3 = rs.getString(3);
                        c_4 = rs.getString(4);

                        System.out.println(
                            c_1+"\n"+
                            c_2+"\n"+
                            c_3+"\n"+
                            c_4+"\n"+
                            "-------"
                        );
                        re.add(c_1);
                        re.add(c_2);
                        re.add(c_3);
                        re.add(c_4);
                        re.add("------------");
                    }
                    
                    break;
                case 5:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);
                        c_2 = rs.getString(2);
                        c_3 = rs.getString(3);
                        c_4 = rs.getString(4);
                        c_5 = rs.getString(5);

                        System.out.println(
                            c_1+"\n"+
                            c_2+"\n"+
                            c_3+"\n"+
                            c_4+"\n"+
                            c_5+"\n"+
                            "-------"
                        );
                        
                        re.add(c_1);
                        re.add(c_2);
                        re.add(c_3);
                        re.add(c_4);
                        re.add(c_5);
                        re.add("------------");
                    }
                    break;
                case 6:
                    while (rs.next()) {                
                        c_1 = rs.getString(1);
                        c_2 = rs.getString(2);
                        c_3 = rs.getString(3);
                        c_4 = rs.getString(4);
                        c_5 = rs.getString(5);
                        c_6 = rs.getString(6);

                        System.out.println(
                            c_1+"\n"+
                            c_2+"\n"+
                            c_3+"\n"+
                            c_4+"\n"+
                            c_5+"\n"+
                            c_6+"\n"+
                            "-------"
                        );
                        
                        re.add(c_1);
                        re.add(c_2);
                        re.add(c_3);
                        re.add(c_4);
                        re.add(c_5);
                        re.add(c_6);
                        re.add("------------");
                    }
                    break;
                default:
                      while (rs.next()) {                
                        c_1 = rs.getString(1);
                        System.out.println(
                            c_1+"\n"+
                            "-------"
                             
                        );
                        re.add(c_1);
                        re.add("------------");
                      }
                     
                    break;
                    
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
