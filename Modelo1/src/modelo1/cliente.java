
package modelo1;

public class cliente {
    // se crean los atributos 
    private static String Nombre;
    private static String Apellido;
    private static String Sexo;
    
    // se crea el metodo constructor
    public cliente (String datoSexo, String datoApellido) {
        cliente.Sexo = datoSexo;
        cliente.Apellido = datoApellido;
    }//crear el metodo getter y setter
    public static void setNombre_cliente (String datoNombre){
        cliente.Nombre=datoNombre;
    }
    public static String getNombre_cliente(){
        String auxNombre = cliente.Nombre;
        return auxNombre;
    }
}
