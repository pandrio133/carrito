
package Modelo;


import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;


@Entity(name = "PEDIDO")
@Table(name = "pedido")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_operacion")
    private int nro_Oprc;
    @Column(name = "id_detalles")
    private int id_detalles_pddo;
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fech_entrega;
    
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.DATE)
    private Date fech_pddo;

    public Pedido() {
    }

    public Pedido(int id, int nro_Oprc, int id_detalles_pddo, String estado, Date fech_entrega, Date fech_pddo) {
        this.id = id;
        this.nro_Oprc = nro_Oprc;
        this.id_detalles_pddo = id_detalles_pddo;
        this.estado = estado;
        this.fech_entrega = fech_entrega;
        this.fech_pddo = fech_pddo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNro_Oprc() {
        return nro_Oprc;
    }

    public void setNro_Oprc(int nro_Oprc) {
        this.nro_Oprc = nro_Oprc;
    }

    public int getId_detalles_pddo() {
        return id_detalles_pddo;
    }

    public void setId_detalles_pddo(int id_detalles_pddo) {
        this.id_detalles_pddo = id_detalles_pddo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFech_entrega() {
        return fech_entrega;
    }

    public void setFech_entrega(Date fech_entrega) {
        this.fech_entrega = fech_entrega;
    }

    public Date getFech_pddo() {
        return fech_pddo;
    }

    public void setFech_pddo(Date fech_pddo) {
        this.fech_pddo = fech_pddo;
    }
    
    
    
    public void upEstado(){
        
    }
    public  void tiempoEntrega(){
        
    }
    
    public void modificarTiempoEntrega(){
        
    }

}
