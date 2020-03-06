package com.agisti.listview;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListViewHolder> {

    private ArrayList<Makanan>listmakanan;


    public ListMakananAdapter(ArrayList<Makanan>list){
        this.listmakanan = list;

    }

    @NonNull
    @Override
    public ListMakananAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListMakananAdapter.ListViewHolder holder, int position) {
        final Makanan makanan = listmakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
        holder.tvMakanan.setText(makanan.getMakanan());
        holder.tvDetail.setText(makanan.getDetail());

        holder.buat(listmakanan.get(position));


    }

    @Override
    public int getItemCount() {
        return listmakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvMakanan, tvDetail;

        public ListViewHolder(View itemView){
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            tvMakanan = itemView.findViewById(R.id.tv_makanan);
            tvDetail = itemView.findViewById(R.id.tv_detail);

        }
        public void buat(final Makanan item){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), HalamanDetail.class);

                    intent.putExtra(HalamanDetail.MAKANAN, item.getMakanan());
                    intent.putExtra(HalamanDetail.DETAIL, item.getDetail());
                    intent.putExtra(HalamanDetail.FOTO, item.getFoto());
                    itemView.getContext().startActivity(intent);
                }
            });
        }

    }


}

