/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.awt.Point;

/**
 *
 * @author adrip
 */
public abstract class Carton {

    //Atributos
    private int[][] carton;
    private int filas;
    private int columnas;

    //Constructor parametrizado
    public Carton(int[][] carton, int filas, int columnas) {
        this.carton = carton;
        this.filas = filas;
        this.columnas = columnas;
    }
//Getters y Setters

    public int[][] getCarton() {
        return carton;
    }

    public void setCarton(int[][] carton) {
        this.carton = carton;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    //Metodos
    public abstract void generarCarton();

    public Point tacharNumero(int numero) {
        return null;

    }
    
    public boolean esLinea(int numeroFila){
        return false;
        
    }
    
    public boolean esBingo(){
        return false;
        
    }

    @Override
    public String toString() {
        return "Carton{" + "carton=" + carton + ", filas=" + filas + ", columnas=" + columnas + '}';
    }
    
    
    

}
