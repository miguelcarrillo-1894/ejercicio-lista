
package mvc;

import Controlador.Controlador;
import Controlador.ProveedorControlador;
import Vista.Vista;
import Vista.VistaProveedor;
import Modelo.Cliente;
import Modelo.ModeloProovedor;


public class PRICNCIPAL {

 
    public static void main(String[] args) {
       Cliente objCliente = new Cliente();
       Vista objFormulario = new Vista();
       Controlador objControlador = new Controlador (objCliente, objFormulario);
       objControlador.iniciarFormulario();
       
       
       ModeloProovedor objprov = new ModeloProovedor();
       VistaProveedor objvprov= new VistaProveedor();
       ProveedorControlador objconPov = new ProveedorControlador(objprov,objvprov);
       objconPov.iniciarFormulario();
       
       
       
       
    }
    
}
