

package modelo1;
// se crea la clase 
public class persona_modelo {
    // se crean los atributos de la clase
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;
    // se crea el metodo constructor
    public persona_modelo (String datoNombre, String datoApellido, int datoEdad ) {
        this.nombrePersona = datoNombre;
        this.apellidoPersona = datoApellido;
        this.edadPersona = datoEdad;
        //metod de visualizar datos
    }
    public void imprimirDatos(){
        System.out.println("Nombre es: " + this.nombrePersona);
        System.out.println("Apellido es: " + this.apellidoPersona);
        System.out.println("Edad es: " + this.edadPersona);
    }
    // metodo de la clase setter y getter
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona){
        this.nombrePersona = nombrePersona;
        
    }
    public String getApellidoPersona(){
        return apellidoPersona;
    }
}
