package pilas;

/**
 * @author Fernel Moreno
 */
public class Pila {
   int LF;      int LI;
   int C;       int K;
   int BASE;    int TOPE;
   int VPILA[]; int SALIDA[];
   //Constructor
   public Pila(int LF){
       this.C = 1;
       this.K=0;
       this.LF = LF;
       this.LI = 0;
       TOPE = LI - C; 
       BASE = LI;
       VPILA = new int [LF];
       SALIDA = new int [100];
   }
   public String insertar(int elemento){
        String info="";
   	if (TOPE + C >= LF){
   	    info+="Pila Saturada....teclee ENTER.. ";
   	}   
   	else{
          TOPE = TOPE + C;
   	  VPILA[TOPE] = elemento;
          info+="Insertando elemento a la PILA. "+VPILA[TOPE]+"   Tope="+TOPE;
   	}
        return info;
   }
   public String eliminar(){
        String inf=""; 
 	if (TOPE < BASE){
            inf="Pila VACIA....teclee ENTER.. ";
   	 }   
   	 else{
              SALIDA[K++]=VPILA[TOPE];
              inf="Elemento eliminado ["+VPILA[TOPE]+"] Gurdado en cola SALIDA";
              TOPE = TOPE - C;
   	 }
        return inf;
   }
   
   public String displayPila(){
       String dato="Estado PILA Principal\n";
       if (TOPE < BASE){
          dato="Pila Vacía";           		
 	}
        else{
	    for(int i=BASE; i <= TOPE; i++ )
                 dato+="["+VPILA[i]+"] \n";
            dato+="\nEstado Cola Temporal \n";
            for(int i=0; i <= LF; i++ )
                dato+="["+SALIDA[i]+"] ";
            dato+="\n";
        }   	   
      return dato;  
   }
    //Sobreescritura de métodos
    @Override
    public String toString(){
      String datosEmp="";
      /* datosEmp = "Nombre: "+nombre + " Horas Normales: "+horasNormales+" Horas Extras: "+
         horasExtras + " Salario: "+salario+"\n";
       */
      return datosEmp;
    }
   
}
