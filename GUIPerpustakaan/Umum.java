package com.PraktikumPBOL.GUIPerpustakaan;

public class Umum extends Peminjam{
    protected String nik;

    Umum(String idString, String nama, String alamat, int pinjam) {
        super(idString, nama, alamat, pinjam);
    }

    @Override
    public String toString() {
        return "Umum{" +
                "nik='" + nik + '\'' +
                '}';
    }
}
