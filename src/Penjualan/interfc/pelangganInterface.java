/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.interfc;

import Penjualan.entity.Pelanggan;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author HAFIIZH
 */
public interface pelangganInterface {
    Pelanggan insert (Pelanggan o) throws SQLException;
    void update (Pelanggan o) throws SQLException;
    void delete (String id_pelanggan) throws SQLException;
    List getAll() throws SQLException;
    
}
