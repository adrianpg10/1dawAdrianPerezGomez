/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author adrip
 */
public class JuegoBingo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String respuesta;
        BingoAmericano bingoAmericano = new BingoAmericano(new CartonAmericano(), new BomboAmericano(), "2", LocalDate.now(), "13");
        bingoAmericano.getBombo().llenarBombo();
        bingoAmericano.getCarton().generarCarton();

        System.out.println(
                " B   I   N   G   O" + "\n"
                + bingoAmericano.getCarton().toString());

        do {
            //Mostramos el carton

            //Creamos una variable bola donde almacenará el numero de la bola sacada del bombo
            int bola = bingoAmericano.getBombo().sacarBola();

            System.out.println("La bola es: " + bola);
            System.out.println(bingoAmericano.getCarton().tacharNumero(bola));

            System.out.println(
                    " B   I   N   G   O" + "\n"
                    + bingoAmericano.getCarton().toString());

            System.out.println("¿Es bingo?: " + bingoAmericano.getCarton().esBingo());

            if (bingoAmericano.getCarton().esBingo()) {
                System.out.println("¡¡¡Enhorabuena, has cantado BINGO!!!");
                // Paramos el bucle si cantamos bingo
                break;

            }

            System.out.println("¿Quieres sacar otra bola del bombo? s/n");
            respuesta = teclado.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

    }
}
