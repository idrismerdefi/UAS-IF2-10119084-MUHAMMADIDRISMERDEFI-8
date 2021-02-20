/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author
 * Nama  : Muhammad Idris Merdefi
 * NIM   : 10119084
 * Kelas : IF-2
 * Tanggal : 20-2-2021
 * No.soal = 8
 */
public abstract class PersegiPanjang implements BangunDatar {
    
    private int luas;
    private final int panjang;
    private final int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public int hitungLuas() {
        return (panjang*lebar);
    }
}
