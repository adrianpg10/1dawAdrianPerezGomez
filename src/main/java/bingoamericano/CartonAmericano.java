/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.awt.Point;
import java.util.ArrayList;
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

    //Constructor
    public CartonAmericano() {
        super(FILAS, COLUMNAS);
        this.premio = generarPatron();

    }

    //Getters
    public static int getFILAS() {
        return FILAS;
    }

    public static int getCOLUMNAS() {
        return COLUMNAS;
    }

    public Patron getPremio() {
        return premio;
    }

    //Creamos un arrayList donde guardaremos todos los numeros de la matriz
    private ArrayList<Integer> numerosanteriores = new ArrayList<>();

    //Creamos una matriz con el mismo tamaño que la matriz original, para llenarla despues con las coordenadas
    private int[][] clon = new int[FILAS][COLUMNAS];

    //Metodo en el que evitaremos que los numeros de cada columna se repitan y haremos un patron
    @Override
    public void generarCarton() {
        Random aleatorio = new Random();
        rellenarCarton();

        for (int i = 0; i < this.getCarton().length; i++) {
            for (int j = 0; j < this.getCarton()[i].length; j++) {

                switch (j) {

                    case 0:

                        do {
                            this.getCarton()[i][j] = aleatorio.nextInt(15) + 1;

                        } while (numerosanteriores.contains(this.getCarton()[i][j]));
                        numerosanteriores.add(this.getCarton()[i][j]);

                        break;

                    case 1:

                        do {
                            this.getCarton()[i][j] = aleatorio.nextInt(30 - 16 + 1) + 16;

                        } while (numerosanteriores.contains(this.getCarton()[i][j]));
                        numerosanteriores.add(this.getCarton()[i][j]);

                        break;
                    case 2:

                        do {
                            this.getCarton()[i][j] = aleatorio.nextInt(45 - 31 + 1) + 31;

                        } while (numerosanteriores.contains(this.getCarton()[i][j]));
                        numerosanteriores.add(this.getCarton()[i][j]);
                        break;

                    case 3:
                        do {
                            this.getCarton()[i][j] = aleatorio.nextInt(60 - 46 + 1) + 46;

                        } while (numerosanteriores.contains(this.getCarton()[i][j]));
                        numerosanteriores.add(this.getCarton()[i][j]);

                        break;

                    case 4:

                        do {
                            this.getCarton()[i][j] = aleatorio.nextInt(75 - 61 + 1) + 61;

                        } while (numerosanteriores.contains(this.getCarton()[i][j]));
                        numerosanteriores.add(this.getCarton()[i][j]);

                        break;

                }
            }
        }

        int numero1;
        int numero2;

        for (int i = 0; i < this.getCarton().length; i++) {
            for (int j = 0; j < this.getCarton()[i].length; j++) {

//               //Recorremos el patron de puntos
                for (Point punto : this.premio.getCasillas()) {

//
//                  //Hacemos un casting a la cordenada de x e y, ya que son double y la matriz es int
                    numero1 = (int) punto.getLocation().getX();
                    numero2 = (int) punto.getLocation().getY();

//                      
                    //Rellenamos las coordenadas con numeros
                    this.clon[numero1][numero2] = this.getCarton()[i][j];
                }
//                Comparamos las dos matrices y si el numero de la posicion(i, j) es diferente,
//                        meteremos un 0 a la matriz original
                if (this.getCarton()[i][j] != this.clon[i][j]) {
                    this.getCarton()[i][j] = 0;

//
                }
            }
        }

    }

    //Metodo privado para rellenar el carton de numeros. Dependiendo de cada columna, tendrán unos numeros u otros
    //Añadiremos dichos numeros en la lista creada anteriormente
    private void rellenarCarton() {
        Random aleatorio = new Random();
        for (int i = 0; i < this.getCarton().length; i++) {
            for (int j = 0; j < this.getCarton()[i].length; j++) {

                switch (j) {

                    case 0:

                        getCarton()[i][j] = aleatorio.nextInt(15) + 1;
                        numerosanteriores.add(getCarton()[i][j]);
                        break;
                    case 1:

                        getCarton()[i][j] = aleatorio.nextInt(30 - 16 + 1) + 16;
                        numerosanteriores.add(getCarton()[i][j]);
                        break;
                    case 2:

                        getCarton()[i][j] = aleatorio.nextInt(45 - 31 + 1) + 31;
                        numerosanteriores.add(getCarton()[i][j]);
                        break;

                    case 3:
                        getCarton()[i][j] = aleatorio.nextInt(60 - 46 + 1) + 46;
                        numerosanteriores.add(getCarton()[i][j]);

                        break;
                    case 4:

                        getCarton()[i][j] = aleatorio.nextInt(75 - 61 + 1) + 61;
                        numerosanteriores.add(getCarton()[i][j]);
                        break;
                }

            }

        }

    }

    //generar metodo privado patron, en el que creamos un numero aleatorio 
    // dependiendo de ese numero generaremos una forma
    private Patron generarPatron() {

        Random aleatorio = new Random();

        int forma = aleatorio.nextInt(5) + 1;

        switch (forma) {
            case 1:
                return Patron.CARTON_LLENO;
            case 2:
                return Patron.FORMA_C;
            case 3:
                return Patron.FORMA_CRUZ;
            case 4:
                return Patron.FORMA_F;
            default:
                return Patron.FORMA_LINEAS;

        }

    }

    @Override
    public boolean esBingo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //ToString
    @Override
    public String toString() {
        return "CartonAmericano{" + "premio=" + premio + '}';
    }

//    public static void main(String[] args) {
//        CartonAmericano a = new CartonAmericano();
//
//        a.generarCarton();
//        a.mostrarCarton();
//
//    }
}
