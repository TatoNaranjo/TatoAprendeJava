

import java.util.Vector;

public class Metodos {

    public static Vector<String> infijoAPosfijo(String[] input){
     Vector <String> pilaEntrada = new Vector<>();
     Vector <String> colaSalida = new Vector<>();
     for (String caracter : input) {
         if (esUnNumero(caracter)) {
             colaSalida.add(caracter);
         } else if (esOperador(caracter)) {
             while (!pilaEntrada.isEmpty() && esOperador(pilaEntrada.lastElement())) {
                 if ((esAsociativo(caracter, 0) && comprobarPrecedencia(caracter, pilaEntrada.lastElement()) <= 0) ||
                         (esAsociativo(caracter, 1) && comprobarPrecedencia(caracter, pilaEntrada.lastElement()) < 0)) {
                     colaSalida.add(pilaEntrada.remove(pilaEntrada.size() - 1));
                     continue;
                 }
                 break;
             }
             pilaEntrada.add(caracter);

         } else if (caracter.equals("(")) {
             pilaEntrada.add(caracter);
         } else if (caracter.equals((")"))) {
             while (!pilaEntrada.isEmpty() && !pilaEntrada.lastElement().equals("(")) {
                 colaSalida.add(pilaEntrada.remove(pilaEntrada.size() - 1));
             }
             pilaEntrada.remove(pilaEntrada.size() - 1);
         }
     }
    while(!pilaEntrada.isEmpty()){
        colaSalida.add(pilaEntrada.remove(pilaEntrada.size()-1));
    }



return colaSalida;
    }
    public static boolean esUnNumero(String caracter){
        try{
            Double.parseDouble(caracter);

        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public static boolean esOperador(String caracter){
        return caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/");
    }
    public static boolean esAsociativo(String caracter, int tipo){
        if(!esOperador(caracter)){
            throw new IllegalArgumentException("Caracter Invalido:" + caracter);
        }
        if(caracter.equals("+") || caracter.equals("-")){
            return tipo == 0;
        } else if (caracter.equals("*")|| caracter.equals("/")) {
            return tipo == 1;
        }
        else {
            throw new IllegalArgumentException("Caracter Invalido"+ caracter);
        }
    }

    public static int comprobarPrecedencia(String caracter1, String caracter2){
        if(!esOperador(caracter1) || !esOperador(caracter2)){
            throw new IllegalArgumentException("Caracteres Inválidos: " + caracter1 + " "+ caracter2);
        }
        if(caracter1.equals("*")|| caracter1.equals("/") && caracter2.equals("+")|| caracter2.equals("-")){
            return 1;
        } else if (caracter1.equals("+") || caracter1.equals("-") && caracter2.equals("*") || caracter2.equals("/")) {
        return -1;
        } else{
            return 0;
        }
    }


}


