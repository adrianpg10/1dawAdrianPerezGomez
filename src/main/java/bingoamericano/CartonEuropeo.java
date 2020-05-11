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
public final class CartonEuropeo extends Carton{
    //Atributos
    private static final int FILAS = 3;
    private static final int COLUMNAS = 9;

    //Constructor
    public CartonEuropeo(int[][] carton, int filas, int columnas) {
        super(carton, filas, columnas);
    }

    //Getters
    public static int getFILAS() {
        return FILAS;
    }

    public static int getCOLUMNAS() {
        return COLUMNAS;
    }

    //Metodo
    @Override
    public void generarCarton() {
        
    }

 
    

    
    
    
    
    
    
    
    
}
