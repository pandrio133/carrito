
package Modelo;

import java.sql.Date;



public class Pedido {
   
    private int id;
    
    private int nro_Oprc;

    private int id_detalles_pddo;
    
    private String estado;
    
    private Date fech_entrega;
    
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
