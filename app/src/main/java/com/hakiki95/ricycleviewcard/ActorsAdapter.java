package com.hakiki95.ricycleviewcard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by HAKIKI PC on 30/11/2015.
 */
public class ActorsAdapter extends RecyclerView.Adapter<ActorsAdapter.ActorViewHolder> {

    ArrayList<Actors> items;

    public ActorsAdapter(ArrayList<Actors> items) {
        this.items = items;
    }

    @Override
    public ActorViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rows,viewGroup,false);

        ActorViewHolder Actionview = new ActorViewHolder(v);
        return Actionview;
    }

    @Override
    public void onBindViewHolder(ActorViewHolder holder, int position) {

        holder.tvNamaProduk.setText(items.get(position).getNamaproduk());
        holder.tvHargaProduk.setText(items.get(position).getHargaproduk());
        holder.imageProduk.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public  class ActorViewHolder extends RecyclerView.ViewHolder{
        TextView tvNamaProduk, tvHargaProduk;
        ImageView imageProduk;

        public ActorViewHolder(View itemView) {
            super(itemView);

            tvNamaProduk = (TextView) itemView.findViewById(R.id.tvJudul);
            tvHargaProduk = (TextView) itemView.findViewById(R.id.tvHarga);
            imageProduk = (ImageView) itemView.findViewById(R.id.ivProduk);
        }
    }}