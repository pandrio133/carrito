
package Modelo;


import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "BOLETA") 
@Table(name = "boleta")
public class Boleta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_pedido")
    private int id_pedido;
    @Column(name = "total")
    private double saldo;

    
    public Boleta() {
    }

    public Boleta(int id_pddo, double saldo_total) {
        this.id= id_pddo;
        this.saldo= saldo_total;
    }

    public Boleta(int id, int id_pedido, double saldo) {
        this.id = id;
        this.id_pedido = id_pedido;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void verBoleta(){
        
    }
    
    public void guardarBoleta(){
        
    }
    
}
