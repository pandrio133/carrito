
package Modelo;

public class Detalles_Pedido  {
   
    private int id;
    
    private int producto;
    
    private int cantidad;

    private double monto;
    

    public Detalles_Pedido() {
    }

    public Detalles_Pedido(int id, int producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId_DP(int id) {
        this.id = id;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void buscarProducto(){}
    public void verificarStock(){}
    public void addDetalleProduct(){}
    public void deletProduct(){}
    public void calculoMontoProducto(){}
    public void calculoMontoTotal(){}    
    public void listaProductos(){}  
    
}
