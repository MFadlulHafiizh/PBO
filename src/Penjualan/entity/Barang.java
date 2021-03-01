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
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBarang;
    
    public Barang(String kode, String nama, int harga, int jumlah){
        kodeBarang = kode;
        namaBarang = nama;
        hargaBarang = harga;
        jumlahBarang = jumlah;
    }
    
    public Barang(){
        
    }  

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    
}
