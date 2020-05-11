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
public final class CartonAmericano extends Carton {
    //Atributos

    private static final int FILAS = 5;
    private static final int COLUMNAS = 5;
    private Patron patron;

    public CartonAmericano(Patron patron, int[][] carton, int filas, int columnas) {
        super(carton, filas, columnas);
        this.patron = patron;
    }

    //Getters y Setters
    public Patron getPatron() {
        return patron;
    }

    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    
    @Override
    public String toString() {
        return "CartonAmericano{" + super.toString() + "patron=" + patron + '}';
    }

    @Override
    public void generarCarton() {
        
    }

}
