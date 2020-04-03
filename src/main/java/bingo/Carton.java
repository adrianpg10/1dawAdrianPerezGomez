/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author adrip
 */
public class Carton {
// Asignamos atributos Array String cartomnes y bolas del bombo

    private String[][] cartones;

    private Bombo bolas;
// Creamos un constructor por defecto con 3 filas y 9 columnas

    public Carton() {
        this.cartones = new String[3][9];
        this.bolas = bolas;
    }

    //Metodo rellenarCarton
    // Rellenamos las filas y las columnas de la matriz
    private void rellenarCarton() {
        Random aleatorio = new Random();
        for (int i = 0; i < cartones.length; i++) {
            // En la columna 0 de la matriz, rellenamos numeros aleatoriamente del 1 al 9
            cartones[i][0] = String.valueOf(aleatorio.nextInt(9) + 1);
            // En la columna 1 de la matriz, rellenamos numeros aleatoriamente del 10 al 19
            // Rellenamos de la misma manera las otras columnas pero con otro rango aleatorio
            cartones[i][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
            cartones[i][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
            cartones[i][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
            cartones[i][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
            cartones[i][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
            cartones[i][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
            cartones[i][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
            cartones[i][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);

        }
    }

    // Metodo mostrarCarton, donde recorremos la matriz y la imprimimos
    public void mostrarCarton() {

        for (int i = 0; i < cartones.length; i++) {
            System.out.print("|");
            for (int j = 0; j < cartones[i].length; j++) {
                System.out.print(cartones[i][j] + "|");
            }
            System.out.println("");
        }
    }

    // Metodo generarCarton, donde ordena los numeros para que no se repitan y 
    // Si una columna guarda un número X, no puede haber números superiores a X en esa misma columna en filas inferiores. 
    public void generarCarton() {
        Random aleatorio = new Random();
        int numeroNuevo;

        //Llamamos al metodo rellenarCarton
        rellenarCarton();

        //Bucle, mientras los numeros de las posiciones sean iguales a las posteriores y biceversa, 
        //o si el numero de la posicion anterior es menor que a la posicion posterior
        // genere nuevos numeros aleatorios en su rango
        // El bucle no acaba hasta que no se repiten los numeros, y hasta que se ordenen de menor a mayor
        while (cartones[1][0].equals(cartones[0][0]) || cartones[2][0].equals(cartones[0][0]) || cartones[2][0].equals(cartones[1][0])
                || Integer.parseInt(cartones[1][0]) < Integer.parseInt(cartones[0][0]) || Integer.parseInt(cartones[2][0]) < Integer.parseInt(cartones[1][0])) {
            cartones[0][0] = String.valueOf(aleatorio.nextInt(9) + 1);
            cartones[1][0] = String.valueOf(aleatorio.nextInt(9) + 1);
            cartones[2][0] = String.valueOf(aleatorio.nextInt(9) + 1);

        }
        // Mismo procedimiento con los siguientes bucles
        while (cartones[1][1].equals(cartones[0][1]) || cartones[2][1].equals(cartones[0][1]) || cartones[2][1].equals(cartones[1][1])
                || Integer.parseInt(cartones[1][1]) < Integer.parseInt(cartones[0][1]) || Integer.parseInt(cartones[2][1]) < Integer.parseInt(cartones[1][1])) {
            cartones[0][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
            cartones[1][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
            cartones[2][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
        }

        while (cartones[1][2].equals(cartones[0][2]) || cartones[2][2].equals(cartones[0][2]) || cartones[2][2].equals(cartones[1][2])
                || Integer.parseInt(cartones[1][2]) < Integer.parseInt(cartones[0][2]) || Integer.parseInt(cartones[2][2]) < Integer.parseInt(cartones[1][2])) {
            cartones[0][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
            cartones[1][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
            cartones[2][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
        }

        while (cartones[1][3].equals(cartones[0][3]) || cartones[2][3].equals(cartones[0][3]) || cartones[2][3].equals(cartones[1][3])
                || Integer.parseInt(cartones[1][3]) < Integer.parseInt(cartones[0][3]) || Integer.parseInt(cartones[2][3]) < Integer.parseInt(cartones[1][3])) {
            cartones[0][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
            cartones[1][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
            cartones[2][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
        }

        while (cartones[1][4].equals(cartones[0][4]) || cartones[2][4].equals(cartones[0][4]) || cartones[2][4].equals(cartones[1][4])
                || Integer.parseInt(cartones[1][4]) < Integer.parseInt(cartones[0][4]) || Integer.parseInt(cartones[2][4]) < Integer.parseInt(cartones[1][4])) {
            cartones[0][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
            cartones[1][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
            cartones[2][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
        }

        while (cartones[1][5].equals(cartones[0][5]) || cartones[2][5].equals(cartones[0][5]) || cartones[2][5].equals(cartones[1][5])
                || Integer.parseInt(cartones[1][5]) < Integer.parseInt(cartones[0][5]) || Integer.parseInt(cartones[2][5]) < Integer.parseInt(cartones[1][5])) {
            cartones[0][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
            cartones[1][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
            cartones[2][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
        }

        while (cartones[1][6].equals(cartones[0][6]) || cartones[2][6].equals(cartones[0][6]) || cartones[2][6].equals(cartones[1][6])
                || Integer.parseInt(cartones[1][6]) < Integer.parseInt(cartones[0][6]) || Integer.parseInt(cartones[2][6]) < Integer.parseInt(cartones[1][6])) {
            cartones[0][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
            cartones[1][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
            cartones[2][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
        }

        while (cartones[1][7].equals(cartones[0][7]) || cartones[2][7].equals(cartones[0][7]) || cartones[2][7].equals(cartones[1][7])
                || Integer.parseInt(cartones[1][7]) < Integer.parseInt(cartones[0][7]) || Integer.parseInt(cartones[2][7]) < Integer.parseInt(cartones[1][7])) {
            cartones[0][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
            cartones[1][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
            cartones[2][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
        }

        while (cartones[1][8].equals(cartones[0][8]) || cartones[2][8].equals(cartones[0][8]) || cartones[2][8].equals(cartones[1][8])
                || Integer.parseInt(cartones[1][8]) < Integer.parseInt(cartones[0][8]) || Integer.parseInt(cartones[2][8]) < Integer.parseInt(cartones[1][8])) {
            cartones[0][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);
            cartones[1][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);
            cartones[2][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);
        }
        // Llamada al metodo generarBlancos
        // generarBlancos();

    }

//ToString
    @Override
    public String toString() {
        return "Carton{" + "cartones=" + cartones + '}';
    }

}
