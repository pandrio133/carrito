
import Conexion.Conexion;
import Modelo.Cliente;

public class test {

    public static void main(String[] args) {
//       
//        Conexion con= new Conexion();
//        con.Conexion(); 
        
        Cliente nvC = new Cliente(123, "correo", "nombre", 123);
        
        nvC.guadarDatos(nvC);
    }
    
}
