package com.PraktikumPBOL.GUIPerpustakaan;

public class Mahasiswa extends Peminjam{
    protected String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public Mahasiswa(String idMahasiswa, String nama, String alamat, int pinjam, String nim) {
        super(idMahasiswa, nama, alamat, pinjam);
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                '}' + "Peminjam{" +
                "id_string='" + idString + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", mak_pinjam=" + makPinjam +
                '}';
    }
}
