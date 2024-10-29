
package Modelo;


import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "OPERACION")
@Table(name = "operacion")
public class Operacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int operacion;
    @Column(name = "id_cliente")
    private int cliente_id;
    @Column(name = "direccion")
    private String direc_envio;

    public Operacion() {
    }

    public Operacion(int operacion, int cliente_id, String direc_envio) {
        this.operacion = operacion;
        this.cliente_id = cliente_id;
        this.direc_envio = direc_envio;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getDirec_envio() {
        return direc_envio;
    }

    public void setDirec_envio(String direc_envio) {
        this.direc_envio = direc_envio;
    }
    
    
    public void guardarOperacion(){
        
    } 
}
