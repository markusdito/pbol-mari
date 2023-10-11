package com.PraktikumPBOL.GUIPerpustakaan;

public class Peminjam {
    protected String idString;
    protected String nama;
    protected String alamat;
    protected int makPinjam;

    @Override
    public String toString() {
        return "Peminjam{" +
                "id_string='" + idString + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", mak_pinjam=" + makPinjam +
                '}';
    }
}
