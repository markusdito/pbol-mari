package com.PraktikumPBOL.GUIPerpustakaan;

public class Dosen extends Peminjam {
    protected String nim;

    Dosen(String idString, String nama, String alamat, int pinjam) {
        super(idString, nama, alamat, pinjam);
    }

    @Override
    public String toString() {
        return "Dosen{" +
                "nim='" + nim + '\'' +
                '}';
    }
}
