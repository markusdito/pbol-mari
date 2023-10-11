package com.PraktikumPBOL.GUIPerpustakaan;

import java.util.Arrays;
import java.util.Date;

public class Transaksi {
    protected int idTransaksi;
    protected Date tglPinjam;
    protected Date tglKembali;
    protected Float denda;
    protected Koleksi[] koleksi;
    protected Peminjam peminjam;

    public void pinjam(){
        peminjam = new Peminjam();


    }

    public void kembali(){

    }


    @Override
    public String toString() {
        return "Transaksi{" +
                "idTransaksi=" + idTransaksi +
                ", tglPinjam=" + tglPinjam +
                ", tglKembali=" + tglKembali +
                ", denda=" + denda +
                ", koleksi=" + Arrays.toString(koleksi) +
                ", peminjam=" + peminjam +
                '}';
    }
}
