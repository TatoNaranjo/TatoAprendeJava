import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 0, dato = 0, i;
        Scanner sc = new Scanner(System.in);
        int[] vector = {};
        Lista lista = new Lista(vector);
    while (op != 9){
        System.out.println("\n1 MANEJO DE LISTAS ENCADENADAS");
        System.out.println("   1.- CREAR LISTA ");
        System.out.println("   2.- MODIFICAR LISTA");
        System.out.println("   3.- ELIMINAR LISTA ");
        System.out.println("   4.- MOSTRAR LA LISTA");
        System.out.println("   5.- ORDENAR LA LISTA");
        System.out.println("   6.- INSERTAR UN ELEMENTO");
        System.out.println("   9.- FINALIZAR ");
        System.out.print("      ESCOJA LA OPCION: ");
        op=sc.nextInt();

        switch(op){
            case 1 :{
                i=0;
                while(dato != -1){
                    dato=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite elemento -1 para finalizar."));
                    if(dato == -1){
                        break;
                    }
                    lista.agregarAlFinal(dato);
                }
                System.out.println("LISTA CREADA");
                break;
            }
            case 2 :{
                System.out.println("INGRESE EL ELEMENTO QUE DESEA MODIFICAR");
                int elementoAModificar = sc.nextInt();
                System.out.println("INGRESE EL NUEVO ELEMENTO A REEMPLAZAR");
                int nuevoElemento = sc.nextInt();
                lista.modificarElemento(elementoAModificar,nuevoElemento);
                System.out.println("ELEMENTO MODIFICADO");
                break;
            }
            case 3 :{
                if(lista.cab == null){
                    System.out.println("LA LISTA ESTÁ VACÍA, INSERTA UN ELEMENTO");
                    break;
                }
                lista.imprimir();
                System.out.println("Ingresa el valor de la lista que quieres eliminar");
                int valor = sc.nextInt();
                lista.eliminar(valor);
                System.out.println("VALOR ELIMINADO CORRECTAMENTE");
                break;
            }
            case 4 :{
                if(lista.cab == null){
                    System.out.println("LA LISTA ESTÁ VACÍA, INSERTA UN ELEMENTO");
                    break;
                }
                    lista.imprimir();
                break;
            }
            case 5 :{
                if(lista.cab == null){
                    System.out.println("LA LISTA ESTÁ VACÍA, INSERTA UN ELEMENTO");
                    break;
                }
                lista.ordenarListaDoble();
                System.out.println("LISTA ORDENADA CORRECTAMENTE");
                break;
            }
            case 6 :{
                if(lista.indord == 0){
                    System.out.println("LA LISTA NO ESTA ORDENADA, ORDENE LA LISTA ANTES DE INGRESAR UN NUEVO ELEMENTO");
                } else{
                    System.out.println("Ingrese el elemento que quiere agregar a la lista, recuerde que debe ser un número");
                    int elemento = sc.nextInt();

                    lista.agregarAlFinal(elemento);
                    System.out.println("ELEMENTO AGREGADO AL FINAL DE LA LISTA");

                }

                }
                break;
            }



        }
    }



    }

