package com.PraktikumPBOL.GUIPerpustakaan;

public class Buku extends Koleksi{
    protected int halaman;
    protected String isbn;

    @Override
    public String toString() {
        return "Buku{" +
                "halaman=" + halaman +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
