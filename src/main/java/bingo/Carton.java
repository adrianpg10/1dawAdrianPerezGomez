/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author adrip
 */
public class Carton {
// Asignamos atributos Array String cartomnes y bolas del bombo

    private String[][] cartones;

    private Bombo bolas;
// Creamos un constructor por defecto con 3 filas y 9 columnas

    public Carton() {
        this.cartones = new String[3][9];
        generarCarton();
        rellenarArrayBlanco();
    }

    //Metodo rellenarCarton
    // Rellenamos las filas y las columnas de la matriz
    private void rellenarCarton() {
        Random aleatorio = new Random();
        for (int i = 0; i < cartones.length; i++) {
            // En la columna 0 de la matriz, rellenamos numeros aleatoriamente del 1 al 9
            cartones[i][0] = String.valueOf(aleatorio.nextInt(9) + 1);
            // En la columna 1 de la matriz, rellenamos numeros aleatoriamente del 10 al 19
            // Rellenamos de la misma manera las otras columnas pero con otro rango aleatorio
            cartones[i][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
            cartones[i][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
            cartones[i][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
            cartones[i][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
            cartones[i][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
            cartones[i][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
            cartones[i][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
            cartones[i][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);

        }
    }

    // Metodo mostrarCarton, donde recorremos la matriz y la imprimimos
    public void mostrarCarton() {
        
        for (int i = 0; i < cartones.length; i++) {

            for (int j = 0; j < cartones[i].length; j++) {
                //Creamos una variable tamanyo para sacar el tamaño del contenido de i y j
                int tamanyo = cartones[i][j].length();
                // Si tiene un tamaño de 1 le pondremos un espacio, esto es para que cuadre el carton y
                // se pueda apreciar mejor.
                if (tamanyo == 1) {
                    System.out.print("[" + cartones[i][j] + " ]");
                } else {

                    System.out.print("[" + cartones[i][j] + "]");
                }
            }
            System.out.println("");
        }

    }

    // Metodo generarCarton, donde ordena los numeros para que no se repitan y 
    // Si una columna guarda un número X, no puede haber números superiores a X en esa misma columna en filas inferiores. 
    private void generarCarton() {
        Random aleatorio = new Random();

        //Llamamos al metodo rellenarCarton
        rellenarCarton();

        //Bucle, mientras los numeros de las posiciones anteriores sean iguales a las posteriores y biceversa, 
        //o si el numero de la posicion anterior es menor que a la posicion posterior
        // genere nuevos numeros aleatorios en su rango
        // El bucle no acaba hasta que no se repiten los numeros, y hasta que se ordenen de menor a mayor
        while (cartones[1][0].equals(cartones[0][0]) || cartones[2][0].equals(cartones[0][0]) || cartones[2][0].equals(cartones[1][0])
                || Integer.parseInt(cartones[1][0]) < Integer.parseInt(cartones[0][0]) || Integer.parseInt(cartones[2][0]) < Integer.parseInt(cartones[1][0])) {
            // bucle for donde recorremos la matriz y rellenamos en la columna correspondiente en este caso la fila 0
            for (int i = 0; i < cartones.length; i++) {
                cartones[i][0] = String.valueOf(aleatorio.nextInt(9) + 1);
            }
        }

        // Mismo procedimiento con los siguientes bucles
        while (cartones[1][1].equals(cartones[0][1]) || cartones[2][1].equals(cartones[0][1]) || cartones[2][1].equals(cartones[1][1])
                || Integer.parseInt(cartones[1][1]) < Integer.parseInt(cartones[0][1]) || Integer.parseInt(cartones[2][1]) < Integer.parseInt(cartones[1][1])) {
            //mismo procedimiento que el anterior
            for (int i = 0; i < cartones.length; i++) {
                cartones[i][1] = String.valueOf(aleatorio.nextInt(19 - 10 + 1) + 10);
            }
        }

        while (cartones[1][2].equals(cartones[0][2]) || cartones[2][2].equals(cartones[0][2]) || cartones[2][2].equals(cartones[1][2])
                || Integer.parseInt(cartones[1][2]) < Integer.parseInt(cartones[0][2]) || Integer.parseInt(cartones[2][2]) < Integer.parseInt(cartones[1][2])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][2] = String.valueOf(aleatorio.nextInt(29 - 20 + 1) + 20);
            }
        }

        while (cartones[1][3].equals(cartones[0][3]) || cartones[2][3].equals(cartones[0][3]) || cartones[2][3].equals(cartones[1][3])
                || Integer.parseInt(cartones[1][3]) < Integer.parseInt(cartones[0][3]) || Integer.parseInt(cartones[2][3]) < Integer.parseInt(cartones[1][3])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][3] = String.valueOf(aleatorio.nextInt(39 - 30 + 1) + 30);
            }
        }

        while (cartones[1][4].equals(cartones[0][4]) || cartones[2][4].equals(cartones[0][4]) || cartones[2][4].equals(cartones[1][4])
                || Integer.parseInt(cartones[1][4]) < Integer.parseInt(cartones[0][4]) || Integer.parseInt(cartones[2][4]) < Integer.parseInt(cartones[1][4])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][4] = String.valueOf(aleatorio.nextInt(49 - 40 + 1) + 40);
            }
        }

        while (cartones[1][5].equals(cartones[0][5]) || cartones[2][5].equals(cartones[0][5]) || cartones[2][5].equals(cartones[1][5])
                || Integer.parseInt(cartones[1][5]) < Integer.parseInt(cartones[0][5]) || Integer.parseInt(cartones[2][5]) < Integer.parseInt(cartones[1][5])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][5] = String.valueOf(aleatorio.nextInt(59 - 50 + 1) + 50);
            }
        }

        while (cartones[1][6].equals(cartones[0][6]) || cartones[2][6].equals(cartones[0][6]) || cartones[2][6].equals(cartones[1][6])
                || Integer.parseInt(cartones[1][6]) < Integer.parseInt(cartones[0][6]) || Integer.parseInt(cartones[2][6]) < Integer.parseInt(cartones[1][6])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][6] = String.valueOf(aleatorio.nextInt(69 - 60 + 1) + 60);
            }
        }

        while (cartones[1][7].equals(cartones[0][7]) || cartones[2][7].equals(cartones[0][7]) || cartones[2][7].equals(cartones[1][7])
                || Integer.parseInt(cartones[1][7]) < Integer.parseInt(cartones[0][7]) || Integer.parseInt(cartones[2][7]) < Integer.parseInt(cartones[1][7])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][7] = String.valueOf(aleatorio.nextInt(79 - 70 + 1) + 70);
            }
        }

        while (cartones[1][8].equals(cartones[0][8]) || cartones[2][8].equals(cartones[0][8]) || cartones[2][8].equals(cartones[1][8])
                || Integer.parseInt(cartones[1][8]) < Integer.parseInt(cartones[0][8]) || Integer.parseInt(cartones[2][8]) < Integer.parseInt(cartones[1][8])) {

            for (int i = 0; i < cartones.length; i++) {
                cartones[i][8] = String.valueOf(aleatorio.nextInt(90 - 80 + 1) + 80);
            }
        }

        // Llamada al metodo generarBlancos
        generarBlancos();

    }

//ToString
    @Override
    public String toString() {
        return "Carton{" + "cartones=" + cartones + '}';
    }
//Creamos un array nuevo con el contenido del original sin blancos
    private String[][] clon = new String[3][9];

//Metodo generarBlancos, metodo privado donde generaremos 4 blancos por cada fila del array
    private void generarBlancos() {
        Random aleatorio = new Random();
        //Rellenamos el array clonado con los numeros del array original
        for (int i = 0; i < cartones.length; i++) {
            for (int j = 0; j < cartones[i].length; j++) {
                clon[i][j] = cartones[i][j];
            }
        }
        //Variable(numeroNuevo1) donde almacenamos el valor de numeroAleatorio1
        int numeroNuevo1 = 0;
        int numeroAleatorio1 = 0;
        //Variable(numeroAleatorio1) donde almacenamos el valor de numeroAleatorio2
        int numeroNuevo2 = 0;
        int numeroAleatorio2 = 0;
        //Bucle for que se realizará 4 veces
        for (int i = 0; i < 4; i++) {
            //Guardamos en la variable(numeroNuevo) la variable numeroaleatorio
            numeroNuevo1 = numeroAleatorio1;
            //Generamos un numero aleatoriio del 0 al 9(las filas del array)
            numeroAleatorio1 = aleatorio.nextInt(9);
            //Bucle while para que mientras que numero aleatorio sea igual a numeronuevo 
            // genere un nuevo numero aleatorio
            // Este bucle sirve para que no se repitan las posiciones aleatorias y pueda generar 4 blancos en diferentes posiciones del array
            while (cartones[0][numeroAleatorio1].equals(cartones[0][numeroNuevo1])) {

                numeroAleatorio1 = aleatorio.nextInt(9);
            }
            //Añadimos un " " en la posicion aleatoria
            cartones[0][numeroAleatorio1] = " ";

        }
//Mismo for que el primero
        for (int i = 0; i < 4; i++) {

            numeroNuevo2 = numeroAleatorio2;
            numeroAleatorio2 = aleatorio.nextInt(9);
            //Mismo bucle que el primero
            while (cartones[1][numeroAleatorio2].equals(cartones[1][numeroNuevo2])) {
                numeroAleatorio2 = aleatorio.nextInt(9);
            }
            //Condicion de que si la posicion de la fila 1 está vacia/blanca 
            // y la posicion de la fila 1 es igual que la posicion de la fila 0
            // entonces genere un nuevo numero aleatorio para que se genere un blanco en otra posicion

            if (cartones[1][numeroAleatorio2].equals(" ") && cartones[1][numeroAleatorio2].equals(cartones[0][numeroAleatorio1])) {

                numeroAleatorio2 = aleatorio.nextInt(9);
                cartones[1][numeroAleatorio2] = " ";
                //Si no pasa esto, entonces se queda con el numero anteriormente generado
            } else {
                cartones[1][numeroAleatorio2] = " ";
            }

        }
        //Contador de blancos
        int contadorblancos = 0;

        //Recorremos el array carton
        for (int i = 0; i < cartones.length; i++) {
            for (int j = 0; j < cartones[i].length; j++) {
                // si la fila 0 de la posicion j y la fila 1 de la posicion j es blanco
                // entonces rellenamos esa posicion con la posicion del array previamente clonado
                if (cartones[0][j].equals(" ") && cartones[1][j].equals(" ")) {
                    cartones[2][j] = clon[2][j];

                }

            }
        }
        //Recorremos el array cartones
        for (int z = 0; z < cartones.length; z++) {
            for (int k = 0; k < cartones[z].length; k++) {
                // Si en la fila 1 es un numero y la fila 0 es un numero, pondremos un blanco
                if (!(cartones[1][k].equals(" ")) && !(cartones[0][k].equals(" "))) {
                    cartones[2][k] = " ";

                }

            }

        }

// Contador de blancos de la 3 fila     
        for (int i = 0; i < cartones.length; i++) {
            for (int j = 0; j < cartones[i].length; j++) {
                switch (i) {
                    case 2:
                        if (cartones[2][j].equals(" ")) {
                            contadorblancos++;
                        }

                        break;
                }
            }
        }

        //Nuevo contador donde le pondremos 4 porque son los 4 blancos que debe haber en la fila
        int contador = 4;

        //Recorremos el array carton 
        for (int i = 0; i < cartones.length; i++) {
            for (int j = 0; j < cartones[i].length; j++) {

                // Si la fila 0 es un numero y la fila 1 es blanco o la fila 1 es un numero y la fila 0 es un blanco
                // y además si contadorblancos (que cuenta los blancos (switch creado anteriormente) es menor que contador)
                // entonces le añadimos un blanco a la posicion indicada
                // y le sumamos 1 al contadordeblancos 
                // este bucle acaba hasta que contadorblancos sea 4
                if ((!(cartones[0][j].equals(" ")) && cartones[1][j].equals(" ")
                        || !(cartones[1][j].equals(" ")) && cartones[0][j].equals(" ")) && contadorblancos < contador) {
                    cartones[2][j] = " ";
                    contadorblancos++;
                }

            }
        }

    }

//Creamos un array con el mismo tamaño que el original (cartones)
    private String[][] arrayBlanco = new String[3][9];

    private void rellenarArrayBlanco() {
        //Rellenamos todo el array (arrayBlanco) con blancos 
        for (int i = 0; i < arrayBlanco.length; i++) {
            for (int j = 0; j < arrayBlanco[i].length; j++) {
                arrayBlanco[i][j] = " ";
            }
        }

    }

//Metodo tacharCasilla, si el numero indicado es igual que el numero del carton
    // escribiremos una X al nuevo arrayBlanco creado anteriormente
    public void tacharCasilla(int numero) {

        //Recorremos el array original (cartones)
        for (int i = 0; i < cartones.length; i++) {
            for (int j = 0; j < cartones[i].length; j++) {
                //Si el numero es igual que algun numero de la posicion del arrayCartones
                // Le pondremos una X al arrayBlanco en la misma posicion que el arrayOriginal(cartones)
                if (String.valueOf(numero).equals(cartones[i][j])) {
                    arrayBlanco[i][j] = "X";
                }
            }
        }
        //Imprimimos el arrayBlanco donde aparecerán las x o no dependiendo si el numero coincide
        System.out.println("----CARTÓN PARA TACHAR----");
        for (int i = 0; i < arrayBlanco.length; i++) {
            for (int j = 0; j < arrayBlanco[i].length; j++) {
                System.out.print("[" + arrayBlanco[i][j] + "]");
            }
            System.out.println("");
        }

    }

    //Metodo comprobarSiLinea, devolverá true si ha encontrado linea o false si no
    public boolean comprobarSiLinea() {
        //Creamos 3 contadores
        int contadorXlinea1 = 0;
        int contadorXlinea2 = 0;
        int contadorXlinea3 = 0;

        //Recorremos el arrayBlanco
        for (int i = 0; i < arrayBlanco.length; i++) {
            for (int j = 0; j < arrayBlanco[i].length; j++) {
                //Creamos un switch dependiendo de la fila
                switch (i) {
                    case 0:
                        //Si en la fila 0 hay una x le añadimos 1 al contador
                        if (arrayBlanco[0][j].equals("X")) {
                            contadorXlinea1++;
                        }

                        break;

                    case 1:
                        //Si en la fila 1 hay una x le añadimos 1 al contador
                        if (arrayBlanco[1][j].equals("X")) {
                            contadorXlinea2++;
                        }

                        break;

                    case 2:
                        //Si en la fila 2 hay una x le añadimos 1 al contador
                        if (arrayBlanco[2][j].equals("X")) {
                            contadorXlinea3++;
                        }
                        break;

                }
            }
        }

        //Devuelve true si algunos de los contadores es 5 (cantaría linea)
        return contadorXlinea1 == 5 || contadorXlinea2 == 5 || contadorXlinea3 == 5;

    }

    //Metodo comprobar si bingo devuelve true si es bingo o false si no es bingo
    public boolean comprobarBingo() {
        //Creamos 3 contadores
        int contadorXlinea1 = 0;
        int contadorXlinea2 = 0;
        int contadorXlinea3 = 0;
//Recorremos el bucle arrayBlanco
        for (int i = 0; i < arrayBlanco.length; i++) {
            for (int j = 0; j < arrayBlanco[i].length; j++) {
                //Creamos un switch dependiendo de la fila
                switch (i) {
                    case 0:
                        //Si en la fila 0 hay una x le añadimos 1 al contador
                        if (arrayBlanco[0][j].equals("X")) {
                            contadorXlinea1++;
                        }

                        break;

                    case 1:
                        //Si en la fila 1 hay una x le añadimos 1 al contador
                        if (arrayBlanco[1][j].equals("X")) {
                            contadorXlinea2++;
                        }

                        break;

                    case 2:
                        //Si en la fila 2 hay una x le añadimos 1 al contador
                        if (arrayBlanco[2][j].equals("X")) {
                            contadorXlinea3++;
                        }
                        break;

                }
            }
        }
        //Devuelve true si todos los contadores son 5, sino false
        return contadorXlinea1 == 5 && contadorXlinea2 == 5 && contadorXlinea3 == 5;

    }

    // Metodo main
//    public static void main(String[] args) {
//
//        Carton a = new Carton();
//
//        // a.mostrarCarton();
//        a.generarCarton();
//        a.mostrarCarton();
//
//        a.tacharCasilla(5);
//        System.out.println(a.comprobarSiLinea());
//        System.out.println(a.comprobarBingo());
//
//    }
}
