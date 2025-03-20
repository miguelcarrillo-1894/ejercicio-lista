
package Modelo;


public class Cliente {
    
     private String nombreCliente;
     private String[] listaCliente;
     private int contador;


 
  public Cliente (){
   this.nombreCliente=" ";
   this.listaCliente = new String [3];
   this.contador=0;
  }
 


 public String getNombreCliente(){
  return nombreCliente;
 }
 public void setNombreCliente(String nombreCliente){
 this.nombreCliente=nombreCliente;
}
 public String[] getListaCliente(){
  return listaCliente;
}


public void GuardarClinete(String datoNombre){
  if(this.contador<this.listaCliente.length){
    this.listaCliente[this.contador]=datoNombre;
   this.contador++;
      System.out.println("informacion guardada....");
  }
}
public void imprimirCliente(){
 for(int i =0; i<this.listaCliente.length; i++ ){
     System.out.println("XXX: " + this.listaCliente[i]);
}

}


}
