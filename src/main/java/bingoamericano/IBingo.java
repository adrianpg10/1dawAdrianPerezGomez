/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author adrian
 */
public interface IBingo {
    // Método para obtener todos los registros de la tabla

    List<BingoVO> getAll();

    // Méodo para obtener un registro a partir de la PK
    BingoVO findByPk(String pk);

    // Método para insertar un registro
    int insertBingo(BingoVO bingo);

    // Método para insertar varios registros
    int insertBingo(List<BingoVO> lista);


    // Método para modificar un bingo. Se modifica un bingo que tenga esa 'pk'
    // con los nuevos datos que traiga el bingo 'nuevosDatos'
    int updateBingo(String pk, BingoVO nuevosDatos);
    
    
      List<BingoVO> seleccionarFila(String pk);

}
