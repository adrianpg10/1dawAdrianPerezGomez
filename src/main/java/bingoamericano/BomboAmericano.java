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

    //Atributo
    private static final int cantidadBolas = 75;

    //Constructor
    public BomboAmericano() {
        //Llamada al metodo llenarBombo y le pasamos la cantidadBolas por parametro
        llenarBombo(cantidadBolas);
    }

    //Getter
    public static int getCantidadBolas() {
        return cantidadBolas;
    }

    //Metodo sobreescrito para llenar de bolas el bomboAmericano
    @Override
    public void llenarBombo(int numero) {

        for (int i = 0; i < numero; i++) {
            getBolas().add(i + 1);
        }
    }

}
