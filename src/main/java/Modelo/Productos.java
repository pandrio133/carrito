
package Modelo;





import jakarta.persistence.Column;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "PRODUCTO")
@Table(name = "producto")
public class Productos implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private double precio;
    @Column(name = "stock")
    private int stock;

    public Productos() {
    }

    public Productos(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    public void addProducto(String nombre,double precio, int stock){
        //consulta sql para agrgar producto al carrito
        //INSERT INTO producto(nombre,precio,stock) VALUES ("fresa",5.00,10);
    }
    
    
    public void deletProducto(){}
    
    public void upProducto(){}
    
    public void buscarProducto(int id,String nombre){}

}
