package com.seminnova.mvpar.pruebalistasdesc;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHoldersMonAbs extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView personName;
    public TextView personAddress;

    public RecyclerViewHoldersMonAbs(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        personName = (TextView)itemView.findViewById(R.id.person_name_monabs);
        personAddress = (TextView)itemView.findViewById(R.id.person_address_monabs);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Monumento " + getPosition(), Toast.LENGTH_SHORT).show();

    }
}
