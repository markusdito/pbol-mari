package com.PraktikumPBOL.GUIPerpustakaan;

public class Koleksi {
    protected String idKoleksi;
    protected String judul;
    protected String penerbit;
    protected boolean statusPinjam;

    @Override
    public String toString() {
        return "Koleksi{" +
                "id_koleksi='" + idKoleksi + '\'' +
                ", judul='" + judul + '\'' +
                ", penerbit='" + penerbit + '\'' +
                ", status_pinjam=" + statusPinjam +
                '}';
    }
}
