package Penjualan.koneksi;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    public static Connection conn;
    public static Connection getConnection(){
        if(conn == null){
            try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost/db_pbo_mvc","root","");
            } catch (Exception e) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return conn;
    }
}
