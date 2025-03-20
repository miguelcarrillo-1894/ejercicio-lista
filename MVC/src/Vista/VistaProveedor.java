
package Vista;

import java.util.Scanner;


public class VistaProveedor {
    private String botonColor;
    private int botonCantidad;
    private int etiquetaCantidad;
    private String etiquetaColor;
    private String fondoColor;
    private Scanner entrada;

    public VistaProveedor() {
        this.botonColor = "azul";
        this.fondoColor = "gris";
        this.etiquetaColor = "verde";
        this.botonCantidad = 4;
        this.etiquetaCantidad = 8;
    }

  
    public int desplegarMenuProveedor() {
        System.out.println("Sistema de Gestión de Proveedores");
        System.out.println("1. Añadir un nuevo proveedor");
        System.out.println("2. Consultar la lista de proveedores");
        System.out.println("3. Buscar proveedor por identificación");
        System.out.println("4. Finalizar");
        this.entrada = new Scanner(System.in);
        System.out.println("Elija una opción: ");
        int opcionSeleccionada = entrada.nextInt();
        return opcionSeleccionada;
    }

    
    public String capturarNombreProveedor() {
        this.entrada = new Scanner(System.in);
        System.out.println("Registro de Proveedor");
        System.out.println("Ingrese el nombre del proveedor:");
        String nombre = entrada.nextLine();
        return nombre;
    }

   
    public String capturarIdProveedor() {
        this.entrada = new Scanner(System.in);
        System.out.println("Ingrese la identificación del proveedor:");
        String identificacion = entrada.nextLine();
        return identificacion;
    }

    
    public String capturarTipoProveedor() {
        this.entrada = new Scanner(System.in);
        System.out.println("Indique el tipo de proveedor:");
        String tipo = entrada.nextLine();
        return tipo;
    }

   
    public String ingresarIdBusqueda() {
        this.entrada = new Scanner(System.in);
        System.out.println("Introduzca el ID del proveedor que desea buscar:");
        String idBusqueda = entrada.nextLine();
        return idBusqueda;
    }
}
