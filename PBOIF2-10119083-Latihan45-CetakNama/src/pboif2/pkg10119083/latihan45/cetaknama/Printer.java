/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan45.cetaknama;

/**
 *
 * @Nama     : Rafsan Zen Mustaofa
 * NIM       : 10119083
 * Kelas     : IF2
 * Deskripsi : Menampilkan program untuk cetak nama
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.printf("Nama Anda : %s\n", nama);
    }
    
    public void cetak(int jlmCetak, String nama){
        int i = 0;
        
        System.out.printf("Hasil Cetak : \n");
        while(i < jmlCetak){
           System.out.printf("%d. %s\n", i+1 ,nama);
           i++;
        }
    }  
}
