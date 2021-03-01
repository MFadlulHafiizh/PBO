/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penjualan.entity;

/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private int id_pelanggan;
    private String nama;
    private String jeniskel;
    private String alamat;
    private String notlp;
    String idpel = String.valueOf(id_pelanggan);
    public String getId_pelanggan() {
        return idpel;
    }
    public void setId_pelanggan(String id_pelanggan) {
        this.idpel = id_pelanggan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJeniskel() {
        return jeniskel;
    }
    public void setJeniskel(String jeniskel) {
        this.jeniskel = jeniskel;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNotlp() {
        return notlp;
    }
    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }
    
}
