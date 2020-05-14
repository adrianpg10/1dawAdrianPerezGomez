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
public class BomboEuropeo extends Bombo {

    //Atributo
    private static final int cantidadBolas = 90;

    //Constructor
    public BomboEuropeo() {

        //Llamada al metodo llenarBombo y le pasamos la cantidadBolas por parametro
        llenarBombo(cantidadBolas);
    }

    //Getter
    public static int getCantidadBolas() {
        return cantidadBolas;
    }

    //Metodo sobreescrito para llenar de bolas el bomboEuropeo
    @Override
    public void llenarBombo(int numero) {

        for (int i = 0; i < numero; i++) {
            getBolas().add(i + 1);
        }
    }

  

}
