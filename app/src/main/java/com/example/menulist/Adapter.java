package com.example.menulist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<kuliner> listmakanan;

    public Adapter(ArrayList<kuliner> listmakanan) {
        this.listmakanan = listmakanan;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_makanan,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        kuliner kuliner = listmakanan.get(position);
        holder.txtNama.setText(kuliner.getNama());
        holder.txtDesk.setText(kuliner.getDeskripsi());
        holder.txtHarga.setText(kuliner.getHarga());
        holder.gambar.setImageResource(kuliner.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),detail.class);
                intent.putExtra("gambarMakanan", kuliner.getGambar());
                intent.putExtra("namaMakanan", kuliner.getNama());
                intent.putExtra("deskMakanan", kuliner.getDeskripsi());
                intent.putExtra("hargaMakanan", kuliner.getHarga());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNama, txtDesk, txtHarga;
        public ImageView gambar;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.namaMakanan);
            txtDesk = (TextView) itemView.findViewById(R.id.deskMakanan);
            txtHarga = (TextView) itemView.findViewById(R.id.hargaMakanan);
            gambar = (ImageView) itemView.findViewById(R.id.gambarMakanan);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.container);
        }
    }
}
