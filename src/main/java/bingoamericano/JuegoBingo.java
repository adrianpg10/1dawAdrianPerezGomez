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

        cartonAmericano.generarCarton();
        BingoAmericano BingoAmericano = new BingoAmericano(cartonAmericano, bomboAmericano, "1", LocalDate.now(), "J01");

        BingoAmericano.getCarton().mostrarCarton();

    }

}
