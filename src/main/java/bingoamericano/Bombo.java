/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author adrip
 */
public abstract class Bombo {

    //Añadimos los atributos correspondientes
    //Creamos una lista de bolas
    private ArrayList<Integer> bolas;

    //Creamos un constructor donde rellenaremos la lista con el tamaño del atributo numero de bolas 
    public Bombo() {
        this.bolas = new ArrayList<>();

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
        return "Bombo{" + "bolas=" + bolas + '}';
    }

    //Metodo abstracto llenarBombo, lo usaremos en las clases hijas
    public abstract void llenarBombo();

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

        }

        return -1;

    }

    // Metodo saberNumeroBolas, devolveremos un entero
    // Recorremos el array y creamos un contador
    // Si el numero de la posicion[i] es igual a 0
    // entonces sumaremos 1 al contador
    public int bolasDentro() {
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

    //Metodo para imprimir la lista.
    public void imprimirBombo() {

        for (Integer bola : bolas) {
            System.out.println(bola);
        }
    }

    public boolean vacio() {

        if (bolas.isEmpty()) {
            return true;
        }
        return false;

    }


}
