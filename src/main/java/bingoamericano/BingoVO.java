/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.time.LocalDate;

/**
 *
 * @author adrian
 */
public class BingoVO {

    private String id;
    private LocalDate fecha;
    private String idJugador;
    private int tipo;
    private String bombo;
    private String carton;

    public BingoVO(String id, LocalDate fecha, String idJugador, int tipo, String bombo, String carton) {
        this.id = id;
        this.fecha = fecha;
        this.idJugador = idJugador;
        this.tipo = tipo;
        this.bombo = bombo;
        this.carton = carton;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getBombo() {
        return bombo;
    }

    public void setBombo(String bombo) {
        this.bombo = bombo;
    }

    public String getCarton() {
        return carton;
    }

    public void setCarton(String carton) {
        this.carton = carton;
    }

    @Override
    public String toString() {
        return "BingoVO{" + "id=" + id + ", fecha=" + fecha + ", idJugador=" + idJugador + ", tipo=" + tipo + ", bombo=" + bombo + ", carton=" + carton + '}';
    }
    
    

}
