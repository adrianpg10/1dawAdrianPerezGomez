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
    
    
    
//ToString

    @Override
    public String toString() {
        return "Carton{" + "cartones=" + cartones + '}';
    }

}
