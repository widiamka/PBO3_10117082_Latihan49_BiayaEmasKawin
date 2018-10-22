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
public class PBO3_10117082_Latihan49_BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EmasKawin ek = new EmasKawin();
       ek.setBerat(15.7);
       ek.setHarga(570000);
        System.out.println("Hendi membeli emas kawin untuk mahar dengan berat "
                +ek.getBerat()+" gram");
        System.out.println("1 gram emas per bulan Oktober adalah Rp. "+ek.getHarga());
        System.out.println("Maka, Total bayar yang harus dikeluarkan Hendi adalah Rp. "
        +ek.hitungTotalBayar());
      
    }
    
}
