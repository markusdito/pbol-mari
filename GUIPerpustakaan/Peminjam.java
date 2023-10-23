package com.PraktikumPBOL.GUIPerpustakaan;

public class Peminjam {
    protected String idString;
    protected String nama;
    protected String alamat;
    protected int makPinjam;

    Peminjam(){

    }

    Peminjam(String idString, String nama, String alamat, int pinjam){
        this.idString = idString;
        this.nama = nama;
        this.alamat = alamat;
        this.makPinjam = pinjam;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMakPinjam() {
        return makPinjam;
    }

    public void setMakPinjam(int makPinjam) {
        this.makPinjam = makPinjam;
    }

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
