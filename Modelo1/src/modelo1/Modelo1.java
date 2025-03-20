
package modelo1;

public class Modelo1 {
    //se declaran los atributos de la clase
    //private static String[] listaNombre_clientes;
    private static persona_modelo[] listaNombres_clientes;
    // se crea el metodo constructor de la clase
    public static void main(String[] args) {
        // todo el codigo se va a ejecutar
        Modelo1.crearArreglo_estatico();
        Modelo1.imprimirArreglo_estatico();
        
    }//metodos de la clase
    public static void crearArreglo_estatico(){
        Modelo1.listaNombres_clientes = new persona_modelo [3];
        persona_modelo objPersona = new persona_modelo ( "JUANES", "ARBELADES",  33);
        Modelo1.listaNombres_clientes [0] = objPersona;
        Modelo1.listaNombres_clientes [1] = new persona_modelo ( "PEDRO", "RAMIREZ" , 27);
        Modelo1.listaNombres_clientes [2] = new persona_modelo ("MARIO", "JAIMES",  35);
        //Modelo1.listaNombres_clientes [3] ="MARIO";
        System.out.println("se creo el array exitosamente. ");
        
    }
    public static void imprimirArreglo_estatico(){
        for(int i=0; i<Modelo1.listaNombres_clientes.length; i++){
            persona_modelo auxPersona = Modelo1.listaNombres_clientes[i];
            if (auxPersona!= null){
                System.out.println((i+1)+". Persona.-----");
                auxPersona.imprimirDatos();
            }
            else{
                System.out.println("No existen personas....");
            }
        }
        Modelo1.Modificar_Nombre();
        Modelo1.recorrer_foreach();
    }
    //metodo para modific ar atributo de la clase modelo persona
    public static void Modificar_Nombre(){
        Modelo1.listaNombres_clientes[0].setNombrePersona("MIGUEL ANTONIO");
        String auxNombre = listaNombres_clientes[0].getNombrePersona ();
        System.out.println("Se modifica el nombre de persona por: " + auxNombre);
    }
    public static void recorrer_foreach(){
       for(persona_modelo cliente: Modelo1.listaNombres_clientes){
           System.out.println("Cliente es: "+cliente);
           if(cliente != null){
               cliente.imprimirDatos();
           }
       }
    }
   
    
    
    
}
