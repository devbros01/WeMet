package com.example.wemet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Cardstack extends RecyclerView.Adapter<Cardstack.ViewHolder> {

    private List<ItemModel> items;

    public Cardstack(List<ItemModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cardstack.ViewHolder holder, int position) {
        holder.seData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name , usia, kota;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.item_image);
            usia=itemView.findViewById(R.id.item_age);
            name=itemView.findViewById(R.id.item_name);
            kota=itemView.findViewById(R.id.item_city);
        }

        public void seData(ItemModel data) {
            Picasso.get()
                    .load(data.getImage())
                    .fit()
                    .centerCrop()
                    .into(image);
            name.setText(data.getName());
            usia.setText(data.getUsia());
            kota.setText(data.getKota());
        }
    }

    public List<ItemModel> getItems() {
        return items;
    }

    public void setItems(List<ItemModel> items) {
        this.items = items;
    }
}
