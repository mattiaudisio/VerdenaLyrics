package com.example.verdenalyrics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CanzoniAdapter extends RecyclerView.Adapter<CanzoniAdapter.MyViewCanzoniHolder>{

    ArrayList<Canzone> arrayCanzone;
    Context mContext;

    public CanzoniAdapter(Context mContext,ArrayList<Canzone> arrayCanzone) {
        this.arrayCanzone = arrayCanzone;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CanzoniAdapter.MyViewCanzoniHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewCanzoniHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.element_album, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CanzoniAdapter.MyViewCanzoniHolder holder, int position) {
        holder.titolo.setText(arrayCanzone.get(position).getTitles());
    }

    @Override
    public int getItemCount() {
        return arrayCanzone.size();
    }

    public static class MyViewCanzoniHolder extends RecyclerView.ViewHolder {
        private final TextView titolo;

        public MyViewCanzoniHolder(@NonNull View itemView) {
            super(itemView);
            this.titolo = itemView.findViewById(R.id.textSong);
        }
    }
}
