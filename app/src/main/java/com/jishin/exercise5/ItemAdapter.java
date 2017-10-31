package com.jishin.exercise5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LanAnh on 31/10/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {
    ArrayList<Item> mItemList = new ArrayList<>();
    public ItemAdapter(ArrayList<Item> list){
        this.mItemList = list;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        ItemHolder itemHolder = new ItemHolder(inflatedView);
        return itemHolder;
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        holder.imageView.setImageResource(mItemList.get(position).getPhoto());
        holder.name.setText(mItemList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        public ItemHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.photo);
            name = (TextView) itemView.findViewById(R.id.txtName);
        }
    }
}
