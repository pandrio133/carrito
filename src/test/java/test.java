
import Conexion.Conexion;
import Modelo.Cliente;

public class test {

    public static void main(String[] args) {
//       
//        Conexion con= new Conexion();
//        con.Conexion(); 
        
        Cliente nvC = new Cliente();
        
        nvC.setDni(123);
        nvC.setCorreo("correoJuan");
        nvC.setNombre("pedro");
        nvC.setTel(1234);
        
        
        nvC.verDatos();
    }
    
}
