/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.util.Collections;

/**
 *
 * @author adrip
 */
public final class BomboAmericano extends Bombo {

    //Atributo
    private static final int cantidadBolas = 75;

    //Constructor
    public BomboAmericano() {
        super();
    }

    //Getter
    public static int getCantidadBolas() {
        return cantidadBolas;
    }

    //Metodo sobreescrito para llenar de bolas el bomboAmericano, y las mezcla
    @Override
    public void llenarBombo() {

        for (int i = 0; i < cantidadBolas; i++) {
            getBolas().add(i + 1);
        }

        Collections.shuffle(super.getBolas());
    }

}
