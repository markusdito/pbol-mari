package com.PraktikumPBOL.GUIPerpustakaan;

import java.util.ArrayList;

public class listPeminjam {
    ArrayList<Peminjam> daftarPeminjam;

    listPeminjam(){
        daftarPeminjam = new ArrayList<>();
    }

    public void displayListPeminjam(){
        for (Peminjam p : daftarPeminjam){
            System.out.println(p);
        }
    }

    public void addPeminjam(Peminjam peminjam){
        daftarPeminjam.add(peminjam);
    }
}
