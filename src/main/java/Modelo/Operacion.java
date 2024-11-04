
package Modelo;

public class Operacion {
  
    private int operacion;
   
    private int cliente_id;
   
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
