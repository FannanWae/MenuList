package com.example.menulist;

public class kuliner {
    private String nama, deskripsi, harga;
    private int gambar;

    public kuliner(String nama, String deskripsi, String harga, int gambar){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.gambar = gambar;
    }

    public int getGambar() {
        return gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}

