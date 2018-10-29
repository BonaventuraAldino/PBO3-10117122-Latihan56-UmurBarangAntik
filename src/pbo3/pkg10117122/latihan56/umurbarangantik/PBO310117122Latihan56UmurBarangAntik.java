/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan56.umurbarangantik;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini berisi program untuk menampilkan nama dan 
 *                     usia barang antik dengan menggunakan pendekatan berbasis 
 *                     objek. 
 */
public class PBO310117122Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio barang = new Radio(0);
        System.out.println("Nama barang antik " + barang.getName());
        barang.tampilUmur();
        System.out.println("\n(Developed By : Bonaventura Aldino Senda Seni)");
    }
    
}
