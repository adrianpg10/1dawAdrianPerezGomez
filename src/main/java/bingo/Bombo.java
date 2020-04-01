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

    //Metodo llenarBombo Recorremos el array y lo rellenamos de numeros del 1-90 hasta el tamaño del array
    public void llenarBombo() {
        for (int i = 0; i < bolas.length; i++) {

            bolas[i] = i + 1;

        }

    }

    // Metodo sacarBobla, Sacaremos una bola aleatoriamente, mientras existan bolas dentro.
    // es decir, si el array no es null y es mayor que 0
    public void sacarBola() {
        Random aleatorio = new Random();
        //Creamos una variable bolaAleatoria del 1 al 90
        int bolaAleatoria = aleatorio.nextInt(90) + 1;
        if (bolas != null && bolas.length > 0) {
            for (int i = 0; i < bolas.length; i++) {
                // Reemplazamos el numero que corresponde a la posicion de la variable aleatoria por un 0
                bolas[bolaAleatoria] = 0;
            }
        }

    }

    //ToString
    @Override
    public String toString() {
        return "Bombo{" + "bolas=" + bolas + ", numeroBolas=" + numeroBolas + '}';
    }

}
