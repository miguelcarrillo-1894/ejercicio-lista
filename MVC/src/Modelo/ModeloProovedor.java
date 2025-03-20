
package Modelo;


import java.util.Scanner;

public class ModeloProovedor {
    
    private String[] proveedores;
    private String[] identificaciones;
    private String[] tiposProveedores;
    private String tipoProveedor;
    private String identificacion;
    private String nombre;
    private int contador;

    public ModeloProovedor() {
        this.identificacion = " ";
        this.proveedores = new String[3];
        this.nombre = " ";
        this.identificaciones = new String[3];
        this.contador = 0;
        this.tiposProveedores = new String[3];
        this.tipoProveedor = " ";
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(String tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }

    public String[] getListaTiposProveedores() {
        return tiposProveedores;
    }

    public String[] getListaProveedores() {
        return proveedores;
    }

    public String[] getListaIdentificaciones() {
        return identificaciones;
    }


    public void registrarProveedor(String nombreProveedor, String identificacionProveedor, String tipoProveedor) {
        if (this.contador < this.proveedores.length) {
            for (int i = 0; i < this.contador; i++) {
                if (proveedores[i].equals(nombreProveedor) || identificaciones[i].equals(identificacionProveedor)) {
                    System.out.println("Error: El proveedor o ID ya existe: " + nombreProveedor + " - " + identificacionProveedor);
                    return;
                }
            }

            
            this.proveedores[this.contador] = nombreProveedor;
            this.identificaciones[this.contador] = identificacionProveedor;
            this.tiposProveedores[this.contador] = tipoProveedor;
            this.contador++;
            System.out.println("Proveedor registrado correctamente.");
        } else {
            System.out.println("Capacidad máxima alcanzada. No se pueden agregar más proveedores.");
        }
    }

   
    public void mostrarProveedores() {
        for (int i = 0; i < this.proveedores.length; i++) {
            System.out.println("Proveedor: " + this.proveedores[i]);
            System.out.println("ID: " + this.identificaciones[i]);
            System.out.println("Tipo: " + this.tiposProveedores[i]);
            System.out.println("-----------------------------");
        }
    }

   
    public void buscarProveedor(String idBuscada) {
        for (int i = 0; i < this.contador; i++) {
            if (identificaciones[i].equals(idBuscada)) {
                System.out.println("Proveedor encontrado:");
                System.out.println("Nombre: " + this.proveedores[i]);
                System.out.println("ID: " + this.identificaciones[i]);
                System.out.println("Tipo: " + this.tiposProveedores[i]);
                return;
            }
        }
        System.out.println("Proveedor no encontrado con el ID: " + idBuscada);
    }
}

