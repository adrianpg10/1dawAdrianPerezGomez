/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.time.LocalDate;

/**
 *
 * @author adrip
 */
public class JuegoBingo {

    public static void main(String[] args) {

        CartonAmericano cartonAmericano = new CartonAmericano();
        BomboAmericano bomboAmericano = new BomboAmericano();
        BingoAmericano bingoAmericano = new BingoAmericano(cartonAmericano, bomboAmericano, "1", LocalDate.now(), "J01");
        bingoAmericano.getBombo().llenarBombo();

        bingoAmericano.getCarton().generarCarton();

        
        System.out.println(
                " B   I   N   G   O"+"\n"+
                bingoAmericano.getCarton().toString());

        int bola = bingoAmericano.getBombo().sacarBola();

        System.out.println("La bola es: " + bola);
        System.out.println(bingoAmericano.getCarton().tacharNumero(bola));

           System.out.println(
                " B   I   N   G   O"+"\n"+
                bingoAmericano.getCarton().toString());

        System.out.println("¿Es bingo?: " + bingoAmericano.getCarton().esBingo());

        System.out.println("---------JUEGO BINGO AMERICANO----------");

    }

}
