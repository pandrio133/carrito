
package Modelo;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "CLIENTE")
@Table(name = "cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "tel")
    private int tel;
    @Column(name = "tarjeta")
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
       
    }
    
    public void guardarTarjeta(int tarjeta){
        
        
    }

    
    
    
    
    
}
