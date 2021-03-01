/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.interfc;
import Penjualan.entity.Barang;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public interface barangInterface {
    ArrayList<Barang> getAll();
    public void insert(Barang barang);
    public void update(String id, Barang barang);
    public void delete(String id);
    
}
