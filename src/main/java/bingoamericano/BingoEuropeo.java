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
public final class BingoEuropeo extends Bingo {

    //Atributos
    private CartonEuropeo carton;
    private BomboEuropeo bombo;

    //Constructor parametrizado
    public BingoEuropeo(CartonEuropeo carton, BomboEuropeo bombo, String id, LocalDate fecha, String idJugador) {
        super(id, fecha, idJugador);
        this.carton = carton;
        this.bombo = bombo;
    }

    //Getters y Setters
    public CartonEuropeo getCarton() {
        return carton;
    }

    public void setCarton(CartonEuropeo carton) {
        this.carton = carton;
    }

    public BomboEuropeo getBombo() {
        return bombo;
    }

    public void setBombo(BomboEuropeo bombo) {
        this.bombo = bombo;
    }

    //ToString
    @Override
    public String toString() {
        return "BingoEuropeo{" + super.toString() + "carton=" + carton + ", bombo=" + bombo + '}';
    }

}
