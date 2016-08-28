package com.seminnova.mvpar.pruebalistasdesc;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapterMonAbs extends RecyclerView.Adapter<RecyclerViewHoldersMonAbs> {

    private List<ItemObjectMonAbs> itemList;
    private Context context;


    public RecyclerViewAdapterMonAbs(Context context, List<ItemObjectMonAbs> itemList) {
        this.itemList = itemList;
        this.context = context;

    }

    @Override
    public RecyclerViewHoldersMonAbs onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_monabs, null);
        RecyclerViewHoldersMonAbs rcv = new RecyclerViewHoldersMonAbs(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHoldersMonAbs holder, int position) {
        holder.personName.setText(itemList.get(position).getName());
        holder.personAddress.setText(itemList.get(position).getAddress());
        holder.personAddress2.setText(itemList.get(position).getAddress2());

        //holder.itemView.findViewById(R.id.separador).setBackgroundColor(0xffffffff);

        if (itemList.get(position).getAddress2().equals("")) {
            holder.itemView.findViewById(R.id.separador2).setBackgroundColor(Color.TRANSPARENT);
        } else {
            holder.itemView.findViewById(R.id.separador).setBackgroundColor(Color.TRANSPARENT);
        }

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
