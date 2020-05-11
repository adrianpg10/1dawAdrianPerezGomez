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
public final class BingoAmericano extends Bingo {

    //Atributos
    private CartonAmericano carton;
    private BomboAmericano bombo;

    //Constructor parametrizado
    public BingoAmericano(CartonAmericano carton, BomboAmericano bombo, String id, LocalDate fecha, String idJugador) {
        super(id, fecha, idJugador);
        this.carton = carton;
        this.bombo = bombo;
    }

    //Getters y Setters
    public CartonAmericano getCarton() {
        return carton;
    }

    public void setCarton(CartonAmericano carton) {
        this.carton = carton;
    }

    public BomboAmericano getBombo() {
        return bombo;
    }

    public void setBombo(BomboAmericano bombo) {
        this.bombo = bombo;
    }

    @Override
    public String toString() {
        return "BingoAmericano{" + super.toString() + "carton=" + carton + ", bombo=" + bombo + '}';
    }

}
