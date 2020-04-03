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

//ToString

    @Override
    public String toString() {
        return "Carton{" + "cartones=" + cartones + '}';
    }

}
