package com.example.menulist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    ImageView gambar;
    TextView nama, deskripsi, harga;
    String namaM,deskripsiM,hargaM;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        gambar = findViewById(R.id.gambarMKN);
        nama = findViewById(R.id.namaMKN);
        deskripsi = findViewById(R.id.deskMKN);
        harga = findViewById(R.id.hargaMKN);

        namaM = getIntent().getStringExtra("namaMakanan");
        deskripsiM = getIntent().getStringExtra("deskMakanan");
        hargaM = getIntent().getStringExtra("hargaMakanan");
        img = getIntent().getIntExtra("gambarMakanan",0);
        nama.setText(namaM);
        deskripsi.setText(deskripsiM);
        harga.setText(hargaM);

    }
}