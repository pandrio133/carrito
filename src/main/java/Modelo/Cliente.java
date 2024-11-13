
package Modelo;

import Conexion.Conexion;

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
    private Conexion cons = new Conexion();
    
    public void pedir(){
        
    }
    
    public void cancelarPedido(){
        
    }
    public void pagar(){
        
    }
    public void verStdPedido(){

        
    }
    public void verDatos(){
        // tabla a utilizar es --> "cliente" <-- tal como esta
        cons.Read("cliente", 5);
        
    }
    
    public void guadarDatos(Cliente nv){
        System.out.println(nv.getCorreo());
        System.out.println(nv.getNombre());
        System.out.println(nv.getDni());
        System.out.println(nv.getTel());

// tabla a utilizar es --> "cliente" <-- tal como esta
        
        cons.Create("cliente");
        
        
       
    }
    
    public void guardarTarjeta(int tarjeta){
        
        
    }

    
    
    
    
    
}
