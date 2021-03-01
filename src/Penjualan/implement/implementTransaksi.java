    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.implement;

/**
 *
 * @author HAFIIZH
 */
import Penjualan.koneksi.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class implementTransaksi {
        public int urutanDb(){
        Connection conn = (Connection) Koneksi.getConnection();
        int jml = 0;
        
        try{
            String sql = "SELECT count(*) AS urutan  FROM penjualan";
            Statement rs = (Statement) conn.createStatement();
            ResultSet count = rs.executeQuery(sql);
            
            while (count.next()){
                jml = count.getInt("urutan");
            }
            rs.close();
            count.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ++jml;
    }
    
    public ArrayList<String> viewKdBrg() throws SQLException{
            ArrayList<String> viewNamaBrg = new ArrayList();
            try{
                Statement kt=Koneksi.getConnection().createStatement();
                ResultSet rsKb=kt.executeQuery("SELECT kode_barang,nama_barang from barang");
                while(rsKb.next()){
                    viewNamaBrg.add(rsKb.getString("kode_barang")+ "-" + (rsKb.getString("nama_barang")));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        return viewNamaBrg;   
    }
     
    public ArrayList<String> viewIdPg() throws SQLException{
            ArrayList<String> viewNamaPg = new ArrayList();
            try{
                Statement kt=Koneksi.getConnection().createStatement();
                ResultSet rsKb=kt.executeQuery("SELECT id_pelanggan,nama from pelanggan");
                while(rsKb.next()){
                    viewNamaPg.add(rsKb.getString("id_pelanggan")+ "-" + (rsKb.getString("nama")));
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        return viewNamaPg;   
    }
}
