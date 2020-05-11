/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

/**
 *
 * @author adrip
 */
public final class BomboAmericano extends Bombo {

    //Atributos
    private static final int cantidadBolas = 75;

    public BomboAmericano() {
        super(cantidadBolas);
    }

    //Getter
    public static int getCantidadBolas() {
        return cantidadBolas;
    }

}
