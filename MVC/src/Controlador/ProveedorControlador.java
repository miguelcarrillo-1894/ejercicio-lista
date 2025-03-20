
package Controlador;


import Modelo.ModeloProovedor;
import Vista.VistaProveedor;

public class ProveedorControlador {
    private ModeloProovedor modelo;
    private VistaProveedor vista;

    public ProveedorControlador(ModeloProovedor modelo, VistaProveedor vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

   
    public void iniciarFormulario() {
        int opcion = 0;
        do {
            opcion = this.vista.desplegarMenuProveedor();
            switch (opcion) {
                case 1:
                    String nombre = this.vista.capturarNombreProveedor();
                    String identificacion = this.vista.capturarIdProveedor();
                    String tipo = this.vista.capturarTipoProveedor();
                    this.modelo.registrarProveedor(nombre, identificacion, tipo);
                    break;
                case 2:
                    this.modelo.mostrarProveedores();
                    break;
                case 3:
                    String idBusqueda = this.vista.ingresarIdBusqueda();
                    this.modelo.buscarProveedor(idBusqueda);
                    break;
                case 4:
                    System.out.println("Cerrando el sistema...");
                    break;
                default:
                    System.out.println("Opción no reconocida, intente de nuevo.");
            }
        } while (opcion != 4);
    }
}

