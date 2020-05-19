/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.util.Random;

/**
 *
 * @author adrip
 */
public final class CartonAmericano extends Carton {
    //Atributos

    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;
    private final Patron premio;

    public CartonAmericano() {
        this.premio = generarPatron();
    }

    public static int getFILAS() {
        return FILAS;
    }

    public static int getCOLUMNAS() {
        return COLUMNAS;
    }

    public Patron getPremio() {
        return premio;
    }

    @Override
    public void generarCarton() {

    }

    //generar metodo privado patron, en el que creamos un numero aleatorio 
    // dependiendo de ese numero generaremos una forma
    private Patron generarPatron() {

        Random aleatorio = new Random();

        int forma = aleatorio.nextInt(5) + 1;

        switch (forma) {
            case 1:
                return premio.CARTON_LLENO;
            case 2:
                return premio.FORMA_C;
            case 3:
                return premio.FORMA_CRUZ;
            case 4:
                return premio.FORMA_F;
            default:
                return premio.FORMA_LINEAS;

        }

    }

    @Override
    public boolean esBingo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "CartonAmericano{" + "premio=" + premio + '}';
    }

}
