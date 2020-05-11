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
public abstract class Bingo {
    //Atributos
    
    String id;
    LocalDate fecha;
    String idJugador;

    //Constructor parametrizado
    public Bingo(String id, LocalDate fecha, String idJugador) {
        this.id = id;
        this.fecha = fecha;
        this.idJugador = idJugador;
    }
    
   //Getters y Setters

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

    //ToString
    
    @Override
    public String toString() {
        return "Bingo{" + "id=" + id + ", fecha=" + fecha + ", idJugador=" + idJugador + '}';
    }
    
    
    
}
