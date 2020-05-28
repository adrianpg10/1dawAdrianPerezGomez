/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.awt.Point;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author adrip
 */
public class JuegoBingo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------BINGO----------");
        System.out.println("¿Qué tipo de Bingo eliges?");
        System.out.println("1.- Bingo Americano");
        System.out.println("2.- Bingo Europeo");
        int opcionBingo = teclado.nextInt();

        switch (opcionBingo) {

            case 1:

                System.out.println("¿Quieres cargar la partida anterior o jugar una partida nueva?");
                System.out.println("1.-Cargar Partida");
                System.out.println("2.-Jugar nueva partida");
                int opcionPartida = teclado.nextInt();

                switch (opcionPartida) {
                    case 1:
                        System.out.println("Cargando Partida....");
                        break;
                    case 2:

                        teclado.nextLine();

                        BingoAmericano bingoAmericano = new BingoAmericano(new CartonAmericano(), new BomboAmericano(), "2", LocalDate.now(), EleccionNombreJugador());
                        bingoAmericano.getBombo().llenarBombo();
                        bingoAmericano.getCarton().generarCarton();

                        BingoAmericano(bingoAmericano);

                        break;

                }

            case 2:

                System.out.println("....");

                break;
        }
    }

    //Metodo para mostrar la funcionalidad del juego BingoAmericano
    public static void BingoAmericano(BingoAmericano bingoAmericano) {
        Scanner teclado = new Scanner(System.in);
        Point punto = new Point(-1, -1);
        String respuesta;
        int opcion = 0;

        System.out.println(
                " B   I   N   G   O" + "\n"
                + bingoAmericano.getCarton().toString());

        System.out.println("-----------------------------------");

        do {
            //Mostramos el carton

            //Creamos una variable bola donde almacenará el numero de la bola sacada del bombo
            int bola = bingoAmericano.getBombo().sacarBola();

            System.out.println("Ha salido la bola: " + bola);
            if (bingoAmericano.getCarton().tacharNumero(bola).equals(punto)) {
                System.out.println("La bola no se encuentra en el carton, sigue sacando bolas");
            } else {
                System.out.println("La bola se encuentra en el cartón, sigue tirando para cantar bingo");
            }

            System.out.println(
                    " B   I   N   G   O" + "\n"
                    + bingoAmericano.getCarton().toString());

            System.out.println("¿Has cantado bingo? " + bingoAmericano.getCarton().esBingo());

            if (bingoAmericano.getCarton().esBingo()) {
                System.out.println("¡¡¡Enhorabuena, has cantado BINGO!!!");
                // Paramos el bucle si cantamos bingo
                break;

            }

            System.out.println("¿Ahora que quieres hacer?");
            System.out.println("1.- Sacar Bola");
            System.out.println("2.- GuardarPartida");
            opcion = teclado.nextInt();

        } while (opcion == 1);

    }

    //Metodo para elegir el nombre del jugador
    public static String EleccionNombreJugador() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un nombre para tu Jugador: ");
        String nombre = teclado.nextLine();

        System.out.println("Nombre asignado con éxito...........");
        System.out.println("");

        return nombre;

    }

}
