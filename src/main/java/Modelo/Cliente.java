
package Modelo;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cliente {
  
    private int dni;

    private String nombre;

    private String correo;

    private int tel;

    private int tarjeta;
    
    //
    
    public Cliente() {
    }
    
    public Cliente(int dni, String correo, String nombre, int tel, int tarjeta) {
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.tel = tel;
        this.tarjeta = tarjeta;

    }
    
    public Cliente(int dni, String correo, String nombre, int tel) {
        this.dni = dni;
        this.correo = correo;
        this.nombre = nombre;
        this.tel = tel;
        this.tarjeta = tarjeta;
           
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    //metodos personalizados
    
    
    public void pedir(){
        
    }
    
    public void cancelarPedido(){
        
    }
    public void pagar(){
        
    }
    public void verStdPedido(){
        
    }
    public void guadarDatos(Cliente nv){
        String query = "insert into cliente(dni, nombre, correo,  tel) values ("+ nv.getDni() +","+ nv.getNombre() +","+ nv.getCorreo() +","+ nv.getTel() +");";
        String query2 = "select dni from cliente where dni="+nv.getDni()+";";
        Conexion con = new Conexion();
       try {
            Statement st = con.Conexion().createStatement();
            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query2);
            if (rs.next()) {
                System.out.println("cliente registrado");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void guardarTarjeta(int tarjeta){
        
        
    }

    
    
    
    
    
}
