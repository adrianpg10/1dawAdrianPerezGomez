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
