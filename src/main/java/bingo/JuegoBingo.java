/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Scanner;

/**
 *
 * @author adrip
 */
public class JuegoBingo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Creamos el bombo
        Bombo bombo = new Bombo();
        //Creamos el carton
        Carton carton = new Carton();

        String respuesta = "";
        //Bucle mientras que la respuesta a la pregunta sea "s" podrá seguir jugando
        // El bucle para cuando escribe una letra diferente a "s" o canta bingo
        do {
            //Mostramos el carton
            carton.mostrarCarton();
            //Creamos una variable bola donde almacenará el numero de la bola sacada del bombo
            int bola = bombo.sacarBola();

            System.out.println("La bola sacada del bombo es: " + bola);
            //Llamaremos al metodo tacharCasilla y le pasaremos una bola, variable creada anteriormente
            carton.tacharCasilla(bola);
            //llamamos al metodo comprobar linea
            carton.comprobarSiLinea();
            //Llamaremos al comprobarBingo donde nos devolverá true o false
            System.out.println("¿Ha cantado Bingo? " + carton.comprobarBingo());
            // si comprobarBingo es true, cantará Bingo
            if (carton.comprobarBingo()) {
                System.out.println("¡¡¡Enhorabuena, has cantado BINGO!!!");
                // Paramos el bucle si cantamos bingo
                break;

            }

            System.out.println("¿Quieres sacar otra bola del bombo? s/n");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        if (!(respuesta.equalsIgnoreCase("s"))) {
            System.out.println("Vaya, parece que te has rendido, vuelve a jugar más tarde.");
        }

    }

}
