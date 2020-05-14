/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author adrip
 */
public enum Patron {

    //Lista de puntos son las casillas que hay que rellenar con numeros
    CARTON_LLENO(cartonLleno(), "Carton lleno"),
    FORMA_F(cartonF(), "Carton en forma de F"),
    FORMA_C(cartonC(), "Carton en forma de C"),
    FORMA_CRUZ(cartonCruz(), "Carton en forma de Cruz"),
    FORMA_LINEAS(cartonLineas(), "Carton en forma de Lineas");

    //Atributos
    private ArrayList<Point> casillas;
    private String descripcion;

    //Constructor parametrizado
    private Patron(ArrayList<Point> casillas, String descripcion) {
        this.casillas = casillas;
        this.descripcion = descripcion;
    }

    //Getters
    public ArrayList<Point> getCasillas() {
        return casillas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //ToString
    @Override
    public String toString() {
        return "Patron{" + "casillas=" + casillas + ", descripcion=" + descripcion + '}';
    }

    //Metodos para añadir los puntos que debemos rellenar con numeros.
    //Creamos una lista de puntos y la devolveremos con los puntos añadidos con las formas correspondientes.
    private static ArrayList<Point> cartonLleno() {

        ArrayList<Point> aux = new ArrayList<>();
        aux.add(new Point(0, 0));
        aux.add(new Point(0, 1));
        aux.add(new Point(0, 2));
        aux.add(new Point(0, 3));
        aux.add(new Point(0, 4));

        aux.add(new Point(1, 0));
        aux.add(new Point(1, 1));
        aux.add(new Point(1, 2));
        aux.add(new Point(1, 3));
        aux.add(new Point(1, 4));

        aux.add(new Point(2, 0));
        aux.add(new Point(2, 1));
        aux.add(new Point(2, 2));
        aux.add(new Point(2, 3));
        aux.add(new Point(2, 4));

        aux.add(new Point(3, 0));
        aux.add(new Point(3, 1));
        aux.add(new Point(3, 2));
        aux.add(new Point(3, 3));
        aux.add(new Point(3, 4));

        aux.add(new Point(4, 0));
        aux.add(new Point(4, 1));
        aux.add(new Point(4, 2));
        aux.add(new Point(4, 3));
        aux.add(new Point(4, 4));

        return aux;

    }

    private static ArrayList<Point> cartonF() {

        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(0, 0));
        aux.add(new Point(0, 1));
        aux.add(new Point(0, 2));
        aux.add(new Point(0, 3));
        aux.add(new Point(0, 4));

        aux.add(new Point(1, 0));

        aux.add(new Point(2, 0));
        aux.add(new Point(2, 1));
        aux.add(new Point(2, 2));

        aux.add(new Point(3, 0));
        aux.add(new Point(4, 0));

        return aux;

    }

    private static ArrayList<Point> cartonC() {

        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(0, 0));
        aux.add(new Point(0, 1));
        aux.add(new Point(0, 2));
        aux.add(new Point(0, 3));
        aux.add(new Point(0, 4));

        aux.add(new Point(1, 0));

        aux.add(new Point(2, 0));

        aux.add(new Point(3, 0));

        aux.add(new Point(4, 0));
        aux.add(new Point(4, 1));
        aux.add(new Point(4, 2));
        aux.add(new Point(4, 3));
        aux.add(new Point(4, 4));

        return aux;

    }

    private static ArrayList<Point> cartonCruz() {

        ArrayList<Point> aux = new ArrayList<>();

        aux.add(new Point(0, 2));
        aux.add(new Point(1, 2));

        aux.add(new Point(2, 0));
        aux.add(new Point(2, 1));
        aux.add(new Point(2, 2));
        aux.add(new Point(2, 3));
        aux.add(new Point(2, 4));

        aux.add(new Point(3, 2));

        aux.add(new Point(4, 2));

        return aux;

    }

    private static ArrayList<Point> cartonLineas() {

        ArrayList<Point> aux = new ArrayList<>();
        aux.add(new Point(0, 0));
        aux.add(new Point(0, 1));
        aux.add(new Point(0, 2));
        aux.add(new Point(0, 3));
        aux.add(new Point(0, 4));

        aux.add(new Point(2, 0));
        aux.add(new Point(2, 1));
        aux.add(new Point(2, 2));
        aux.add(new Point(2, 3));
        aux.add(new Point(2, 4));

        aux.add(new Point(4, 0));
        aux.add(new Point(4, 1));
        aux.add(new Point(4, 2));
        aux.add(new Point(4, 3));
        aux.add(new Point(4, 4));

        return aux;

    }
}
