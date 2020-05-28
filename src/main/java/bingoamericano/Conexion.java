/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adrian
 */
public class Conexion {
    
    
    private static final String SERVIDOR = "jdbc:mysql://192.168.1.66/";
    private static final String NOMBRE_BASE_DATOS = "bingo";
    private static final String USER = "adrian";
    private static final String PASS = "adrian10";

    private static Connection instancia = null;
    
    // Constructor privado no accesible desde otras clases
    private Conexion() {

    }

    // Método de clase para acceder a la instancia del objeto Connection
    public static Connection getInstance() {
        // Si el objeto Connection no está creado, se crea
        if (instancia == null) {
            try {

                // Se crea el objeto Connection	
                instancia = DriverManager.getConnection(SERVIDOR + NOMBRE_BASE_DATOS, USER, PASS);

                System.out.println("Conexión realizada con éxito.");

            } catch (SQLException e) {

                // Error en la conexión
                System.out.println("Conexión fallida: " + e.getMessage());
            }
        }
        return instancia;
    }
}
