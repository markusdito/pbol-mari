package com.PraktikumPBOL.GUIPerpustakaan;

public class Disk extends Koleksi{
    protected String format;
    protected String isbn;

    @Override
    public String toString() {
        return "Disk{" +
                "format='" + format + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
