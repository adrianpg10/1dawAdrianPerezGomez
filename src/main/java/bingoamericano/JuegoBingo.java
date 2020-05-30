/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.awt.Point;
import java.time.LocalDate;
import java.util.ArrayList;
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

                        System.out.println("Escribe la ID de la partida: ");
                        String partida = teclado.nextLine();

                        cargarPartidaBingoAmericano(cargarPartida(partida));

                        break;
                    case 2:

                        BingoAmericano bingoAmericano = new BingoAmericano(new CartonAmericano(), new BomboAmericano(), generarID(), LocalDate.now(), EleccionNombreJugador());
                        bingoAmericano.getBombo().llenarBombo();
                        bingoAmericano.getCarton().generarCarton();

                        BingoAmericano(bingoAmericano);

                        break;

                }
                break;
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

        if (opcion == 2) {
            guardarPartida(bingoAmericano);
        }

    }

    //Metodo para mostrar la funcionalidad del juego BingoAmericano
    public static void cargarPartidaBingoAmericano(BingoAmericano bingoAmericano) {
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

        if (opcion == 2) {
            //guardarPartida(bingoAmericano);
        }

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

//    Metodo para generarID automatica cogiendo el ultimo id y sumandole 1
    public static String generarID() {
        BingoDAO bingodao = new BingoDAO();
        String id = "";
        int parseID;
        for (BingoVO bingoVO : bingodao.getAll()) {
            
            id = bingoVO.getId();

        }
        parseID = Integer.parseInt(id) + 1;
        id = String.valueOf(parseID);

        return id;
    }

    //Metodo para guardar partida, donde tendremos que crear un objeto bingoVO.
    //En el que le meteremos todos los parametros del BingoAmericano 
    //Una vez creado el objeto bingoVO, crearemos un objeto BingoDAO para acceder al metodo intertBingo que insertará la partida a la base de datos
    public static void guardarPartida(BingoAmericano bingo) {

        BingoVO bingoVO = new BingoVO(bingo.getId(), bingo.getFecha(), bingo.getIdJugador(), 1, bingo.getBombo().toString(), bingo.getCarton().mostrarCartonEnLinea());

        BingoDAO bingoDAO = new BingoDAO();

        bingoDAO.insertBingo(bingoVO);

    }

    //Metodo privado en el que tendremos que pasarle el bombo en un String.
    // Separamos por coma y le añadimos el numero del bombo recorriendo los tokens al bomboAmericano
    // y lo devolvemos
    private static BomboAmericano leerBomboAmericano(String lineaBombo) {

        String[] tokens;
        BomboAmericano bomboAmericano = new BomboAmericano();
        int numeroBombo;

        tokens = lineaBombo.split(",");

        for (int i = 0; i < tokens.length; i++) {

            lineaBombo = tokens[i];

            numeroBombo = Integer.parseInt(lineaBombo);

            bomboAmericano.getBolas().add(numeroBombo);

        }

        return bomboAmericano;

    }

    //Metodo privado en el que tendremos que pasarle el carton en un String
    // Separamos por "," y con el contador sumamos las casillas para que nos vaya recorriendo el numero del carton
    // al final tendremos que devolver un cartonAmericano
    private static CartonAmericano leerCartonAmericano(String lineaCarton) {

        String[] tokens;
        CartonAmericano cartonAmericano = new CartonAmericano();
        int numeroCarton;
        int contador = 0;

        tokens = lineaCarton.split(",");
        for (int j = 0; j < cartonAmericano.getCarton().length; j++) {
            for (int k = 0; k < cartonAmericano.getCarton()[j].length; k++) {

                lineaCarton = tokens[contador];
                numeroCarton = Integer.parseInt(lineaCarton);
                cartonAmericano.getCarton()[j][k] = numeroCarton;

                contador++;
            }
        }

        return cartonAmericano;

    }

    //Metodo cargar partida, donde le pasaremos por parametro la id
    // para que nos recorra la fila, una vez recorrida la fila, tendremos que añadir los atributos al objeto bingoAmericano
    public static BingoAmericano cargarPartida(String id) {
        BingoAmericano bingoAmericano = null;
        String pk;
        LocalDate fecha;
        String idJugador;
        String lineaCarton;
        String bombo;

        BingoDAO bingoDAO = new BingoDAO();

        for (BingoVO bingoVO : bingoDAO.seleccionarFila(id)) {

            pk = bingoVO.getId();
            fecha = bingoVO.getFecha();
            idJugador = bingoVO.getIdJugador();
            lineaCarton = bingoVO.getCarton();
            bombo = bingoVO.getBombo();
            bingoAmericano = new BingoAmericano(leerCartonAmericano(lineaCarton), leerBomboAmericano(bombo), pk, fecha, idJugador);
        }

        return bingoAmericano;

    }

}
