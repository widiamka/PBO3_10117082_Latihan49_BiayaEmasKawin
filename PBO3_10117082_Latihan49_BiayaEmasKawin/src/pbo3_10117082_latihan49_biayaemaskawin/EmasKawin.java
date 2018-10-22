/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan49_biayaemaskawin;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan total bayar 
* dari membeli emas kawin sebagai mahar nikah sesuai harga dan berat yg sudah 
* ditentukan
 */
public class EmasKawin {
    private double berat;
    private int harga;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public double hitungTotalBayar(){
        return berat*harga;
        
    }
}
