package com.example.menulist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView rec_kuliner;
    private ArrayList<kuliner> listmakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_kuliner = findViewById(R.id.rec_makanan);
        initdata();
        rec_kuliner.setAdapter(new Adapter(listmakanan));
        rec_kuliner.setLayoutManager(new LinearLayoutManager(this));
    }
    public void initdata(){
        this.listmakanan = new ArrayList<>();
        listmakanan.add(new kuliner("Bakso Urat Pak Gigi",
                "Makanan sehat dan bergizi bakso urat","Rp.40000",R.drawable.bakso));
        listmakanan.add(new kuliner("Nasi Goreng Balaraja",
                "Nasi Goreng kerbau balaraja","Rp.25000",R.drawable.makanan1));
        listmakanan.add(new kuliner("Mie setang berkeringat",
                "setan aja makan ini berkeringat, apalagi kamu","Rp.30000",R.drawable.mie));
        listmakanan.add(new kuliner("Sop iga Kuda Pak Gigi",
                "Sop iga kuda sangat lezat dan bergizi","Rp.20500",R.drawable.sop));
    }
}