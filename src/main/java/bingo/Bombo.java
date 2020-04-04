/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author adrip
 */
public class Bombo {
    //Añadimos los atributos correspondientes
    //Creamos una lista de bolas

    private ArrayList<Integer> bolas;
    //Añadimos el atributo numeroBolas y lo pondremos final para que no pueda ser modificado, ya que siempre va a ser el mismo
    // Si quisiesemos cambiar el numero de bolas, tendriamos que modificar el atributo
    private final int numeroBolas = 90;

    //Creamos un constructor donde rellenaremos la lista con el tamaño del atributo numero de bolas 
    public Bombo() {
        this.bolas = new ArrayList<>(numeroBolas);
    }
    //Getters y Setters

    public ArrayList<Integer> getBolas() {
        return bolas;
    }

    public void setBolas(ArrayList<Integer> bolas) {
        this.bolas = bolas;
    }


    //ToString
    @Override
    public String toString() {
        return "Bombo{" + "bolas=" + bolas + ", numeroBolas=" + numeroBolas + '}';
    }
    
    //Metodo llenarBombo Recorremos el ArrayList, creamos un for con 90 iteraciones donde añadiremos numeros del 1 al 90
    public void llenarBombo() {
        for (int i = 0; i < 90; i++) {
            bolas.add(i + 1);
        }

    }

     // Metodo sacarBobla, Sacaremos una bola aleatoriamente, mientras el arraylist no esté vacio
    public int sacarBola() {

        Random aleatorio = new Random();
        // Numero aleatorio
        int numeroBolaAleatoria;
        // Condicion si el array no está vacío que entre.
        if (!(bolas.isEmpty())) {
            // Creamos una variable posicionAleatoria donde dependiendo del tamaño del arraylist vaya generando numeros aleatorios
            int posicionAleatoria = aleatorio.nextInt(bolas.size());

            //Guardamos en la variable numeroBolaAleatoria el numero que esté en la posicion de la variable creada anteriormente
            numeroBolaAleatoria = bolas.get(posicionAleatoria);
            // Eliminamos del arraylist el numero de la posicion donde se encuentra
            bolas.remove(posicionAleatoria);
            // Devolvemos el numerode la bola aleatoria
            return numeroBolaAleatoria;

        } else {
            // Lanzamos una excepción cuando el bombo se encuentre vacío 
            throw new IndexOutOfBoundsException("El bombo no contiene más bolas");
        }

    }
    
     // Metodo saberNumeroBolas, devolveremos un entero
    // Recorremos el array y creamos un contador
    // Si el numero de la posicion[i] es igual a 0
    // entonces sumaremos 1 al contador
   public int saberNumeroBolas() {
        int contadorBolasVacias = 0;
        
        for (int i = 0; i < bolas.size(); i++) {
            // Recorremos el bucle for, si el contenido de la posición es 0 el contador suma 1
            if (bolas.get(i) == 0) {
                contadorBolasVacias++;
            }
        }
        // Cuando termine el bucle for, haremos una resta entre el tamaño de la lista y el contador de las bolas vacias
        // el resultado serán las bolas restantes del bombo
        int contadorBolasFinal = bolas.size() - contadorBolasVacias;
        return contadorBolasFinal;
    }
    
    

//    public static void main(String[] args) {
//
//        Bombo j = new Bombo();
//
//        //  j.imprimirBombo();
//        j.llenarBombo();
////        j.imprimirBombo();
////        j.sacarBola();
////        j.imprimirBombo();
////        j.sacarBola();
////        j.imprimirBombo();
////        System.out.println(j.saberNumeroBolas());
//        for (int i = 0; i < 89; i++) {
//            j.sacarBola();
//        }
//
//        j.imprimirBombo();
//        
//        System.out.println(j.saberNumeroBolas());
//    }
}
