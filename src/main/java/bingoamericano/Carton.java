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
    public Carton(int filas, int columnas) {

        this.carton = new int[filas][columnas];

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

    //Método que devuelve un punto, si el numero pasado por parametro es igual que el numero de i y j 
    //pues pondremos en esa posicion a 0 y devolveremos un punto de tipo Point
    //Si no encuentra el numero devolverá otro punto en este caso será -1,-1
    public Point tacharNumero(int numero) {

        Point aux = new Point(-1, -1);

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {

                if (this.carton[i][j] == numero) {
                    this.carton[i][j] = 0;
                    aux.setLocation(j, i);
                    return aux;
                }

            }
        }

        return aux;

    }

    public abstract boolean esBingo();

    //ToString donde recorremos el carton y lo imprimimos
    @Override
    public String toString() {

        String numero = "";

        for (int i = 0; i < this.carton.length; i++) {
            for (int j = 0; j < this.carton[i].length; j++) {
                int tamanyo = String.valueOf(carton[i][j]).length();

                if (tamanyo == 1) {
                    numero += "[" + this.carton[i][j] + " ]";
                } else {
                    numero += "[" + this.carton[i][j] + "]";
                }

            }

            numero += "\n";

        }

        return numero;
    }

    //Metodo Para mostrar los numeros del carton en una sola linea, para poder añadirlo a la base de datos
    // posteriormente
    public String mostrarCartonEnLinea() {

        String numero = "";

        for (int i = 0; i < this.carton.length; i++) {
            for (int j = 0; j < this.carton[i].length; j++) {

                numero += this.carton[i][j] + ",";

            }

        }

        return numero;

    }

}
