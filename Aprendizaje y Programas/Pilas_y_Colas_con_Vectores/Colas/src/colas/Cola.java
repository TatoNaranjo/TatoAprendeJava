package colas;
/**
 * @author Fernel Moreno
 */
public class Cola {
    int LF;      int LI;
    int C;       int K;
    int CABZ;    int COLA;
    int VCOLA[]; int SALIDA[];
	//Constructor
    public Cola(int LF){
        this.C = 1;
        this.K=0;
        this.LF = LF;
        this.LI = 0;
        CABZ = LI - C;
        COLA = CABZ; 
        VCOLA = new int [LF];
        SALIDA = new int [100];
   }
   public String insertar(int elemento){
         String info="";
   	 if (COLA + C >= LF){
    	    info="Cola Saturada....teclee ENTER.. ";
  	 }   
   	 else{
   	 	if (CABZ < LI){
   	 	   CABZ = LI;
   	 	   COLA = LI;
   	 	} else COLA = COLA + C;
   	 	VCOLA[COLA] = elemento;
                info="Insertando elemento a la Cola. "+VCOLA[COLA]+"   Tope="+COLA;
   	 }
         return info;
   }
   public String eliminar(){
        String inf=""; 
 	if (CABZ < LI){
            inf+="Cola VACIA..... ";
        }   
   	else{
            SALIDA[K++]=VCOLA[CABZ];
            CABZ = CABZ + C;
            inf+="Elemento eliminado ["+VCOLA[COLA]+"] Gurdado en cola SALIDA\n";
            if (CABZ >= COLA){
               CABZ = LI - C;
               COLA = CABZ;
            }
   	}
        return inf;
   }
   public String displayCola(){
       String Dato="Estado COLA Principal\n";
 	if (CABZ < LI){
                Dato+="Cola Vacía...";
 	}else{
	  for(int i=CABZ; i <= COLA; i++ )
                 Dato+="["+VCOLA[i]+"] ";

          Dato+="\nEstado de Indicadores CABZ = "+CABZ+" COLA= "+COLA+"\n";
          Dato+="Estado Cola Temporal \n";
	  for(int i=0; i <= LF; i++ )
              Dato+="["+SALIDA[i]+"] \n";
        }   
       return Dato; 
   }
}
