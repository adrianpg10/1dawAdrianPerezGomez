/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Random;

/**
 *
 * @author adrip
 */
public class Bombo {
    //Añadimos los atributos correspondientes
    //Creamos un array de bolas

    private int[] bolas;
    //Añadimos el atributo numeroBolas y lo pondremos final para que no pueda ser modificado, ya que siempre va a ser el mismo
    // Si quisiesemos cambiar el numero de bolas, tendriamos que modificar el atributo
    private final int numeroBolas = 90;

    //Creamos un constructor donde rellenaremos el array con el tamaño del atributo numero de bolas 
    public Bombo() {
        this.bolas = new int[numeroBolas];

    }
    //Getters y Setters

    public int[] getBolas() {
        return bolas;
    }

    public void setBolas(int[] bolas) {
        this.bolas = bolas;
    }

    public int getNumeroBolas() {
        return numeroBolas;
    }

    //ToString
    @Override
    public String toString() {
        return "Bombo{" + "bolas=" + bolas + ", numeroBolas=" + numeroBolas + '}';
    }

}
