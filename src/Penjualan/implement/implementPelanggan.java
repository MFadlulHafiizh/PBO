/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.implement;

import Penjualan.entity.Pelanggan;
import Penjualan.interfc.pelangganInterface;
import Penjualan.koneksi.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HAFIIZH
 */
public class implementPelanggan implements pelangganInterface{
    public Pelanggan insert(Pelanggan o) throws SQLException{
        PreparedStatement st=Koneksi.getConnection().prepareStatement("insert into pelanggan values(?,?,?,?,?)");
        st.setString(1,o.getId_pelanggan());
        st.setString(2,o.getNama());
        st.setString(3,o.getJeniskel());
        st.setString(4,o.getAlamat());
        st.setString(5,o.getNotlp());
        st.executeUpdate();
        return o;
    }
    
    public void update(Pelanggan o) throws SQLException{
        PreparedStatement st=Koneksi.getConnection().prepareStatement("update pelanggan set nama=?,jk=?,alamat=?,no_telepon=? where id_pelanggan=?");
        st.setString(1,o.getNama());
        st.setString(2,o.getJeniskel());
        st.setString(3,o.getAlamat());
        st.setString(4,o.getNotlp());
        st.setString(5,o.getId_pelanggan());
        st.executeUpdate();
    }
    
     public void delete(String id_pelanggan) throws SQLException{
        PreparedStatement st=Koneksi.getConnection().prepareStatement
        ("delete from pelanggan where id_pelanggan=?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
    }
    
    public List<Pelanggan> getAll() throws SQLException{
        Statement st=Koneksi.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from pelanggan ");  
        List<Pelanggan>list=new ArrayList<Pelanggan>();
        while(rs.next()){
            Pelanggan plg=new Pelanggan();
            plg.setId_pelanggan(rs.getString("id_pelanggan"));
            plg.setNama(rs.getString("nama"));
            plg.setJeniskel(rs.getString("jk"));
            plg.setAlamat(rs.getString("alamat"));
            plg.setNotlp(rs.getString("no_telepon"));
            list.add(plg);
        }
        return list;
        
    }

}
