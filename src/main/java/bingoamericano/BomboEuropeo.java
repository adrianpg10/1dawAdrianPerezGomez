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
public class BomboEuropeo extends Bombo{
    //Atributo
    private static final int cantidadBolas = 90;

    //Constructor
    public BomboEuropeo() {
        super(cantidadBolas);
    }

    //Getter
    public static int getCantidadBolas() {
        return cantidadBolas;
    }
    
    
    
    
}
