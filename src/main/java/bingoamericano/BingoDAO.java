/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingoamericano;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class BingoDAO implements IBingo {

    private Connection con = null;

    public BingoDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<BingoVO> getAll() {
        List<BingoVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from tablaBingo");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                BingoVO bingo = new BingoVO();
                // Recogemos los datos deL bingo, guardamos en un objeto

                bingo.setId(res.getString("id"));
                bingo.setFecha(res.getDate("fecha").toLocalDate());
                bingo.setId(res.getString("idJugador"));
                bingo.setTipo(res.getInt("tipo"));
                bingo.setBombo(res.getString("bombo"));
                bingo.setCarton(res.getString("carton"));

                //Añadimos el objeto a la lista
                lista.add(bingo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public BingoVO findByPk(String pk) {
        ResultSet res = null;
        BingoVO bingo = new BingoVO();

        String sql = "select * from tablaBingo where id=?";

        try ( PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto

                bingo.setId(res.getString("id"));
                bingo.setFecha(res.getDate("fecha").toLocalDate());
                bingo.setIdJugador(res.getString("idJugador"));
                bingo.setTipo(res.getInt("tipo"));
                bingo.setBombo(res.getString("bombo"));
                bingo.setCarton(res.getString("carton"));

                return bingo;
            }

            return null;
        } catch (SQLException ex) {
            Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int insertBingo(BingoVO bingo) {

        int numFilas = 0;
        String sql = "insert into tablaBingo values (?,?,?,?,?,?)";

        if (findByPk(bingo.getId()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, bingo.getId());
                prest.setDate(2, Date.valueOf(bingo.getFecha()));
                prest.setString(3, bingo.getIdJugador());
                prest.setInt(4, bingo.getTipo());
                prest.setString(5, bingo.getBombo());
                prest.setString(6, bingo.getCarton());

                numFilas = prest.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return numFilas;
        }

    }

    @Override
    public int insertBingo(List<BingoVO> lista) {
        int numFilas = 0;

        for (BingoVO tmp : lista) {
            numFilas += insertBingo(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteBingo(BingoVO bingo) {
        int numFilas = 0;

        String sql = "delete from tablaBingo where pk=?";

        // Sentencia parametrizada
        try ( PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setString(1, bingo.getId());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numFilas;
    }

    @Override
    public int deleteBingo() {

        String sql = "delete from tablaBingo";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try ( Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;
    }

    @Override
    public int updateBingo(String pk, BingoVO nuevosDatos) {
        int numFilas = 0;
        String sql = "update tablaBingo set id = ?, fecha = ?, idJugador = ?, tipo = ?, bombo = ?, carton = ? where pk=?";

        if (findByPk(pk) == null) {
            // El bingo a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setDate(1, Date.valueOf(nuevosDatos.getFecha()));
                prest.setString(2, nuevosDatos.getId());
                prest.setInt(3, nuevosDatos.getTipo());
                prest.setString(4, nuevosDatos.getBombo());
                prest.setString(5, nuevosDatos.getCarton());
                prest.setString(6, pk);

                numFilas = prest.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return numFilas;
        }
    }

    @Override
    public List<BingoVO> seleccionarFila(String pk) {
         

        List<BingoVO> lista = new ArrayList<>();
        ResultSet res = null;
        BingoVO bingo = new BingoVO();

        String sql = "select * from tablaBingo where id=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Preparamos la sentencia parametrizada
            prest.setString(1, pk);

            while (res.next()) {
                BingoVO b = new BingoVO();
                // Recogemos los datos del bingo, guardamos en un objeto
                b.setId(res.getString("id"));
                b.setFecha(res.getDate("fecha").toLocalDate());
                b.setIdJugador(res.getString("idjugador"));
                b.setTipo(res.getInt("tipo"));
                b.setBombo(res.getString("bombo"));
                b.setCarton(res.getString("carton"));
              

                //Añadimos el objeto a la lista
                lista.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BingoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    
    }

}
