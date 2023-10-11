package com.PraktikumPBOL.GUIPerpustakaan;

public class Majalah extends Koleksi {
    protected int volume;
    protected int seri;
    protected String issn;

    @Override
    public String toString() {
        return "Majalah{" +
                "volume=" + volume +
                ", seri=" + seri +
                ", issn='" + issn + '\'' +
                '}';
    }
}
