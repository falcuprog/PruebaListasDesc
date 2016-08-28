package com.seminnova.mvpar.pruebalistasdesc;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class RecyclerViewHoldersMonAbs extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView personName;
    public TextView personAddress;
    public JustifyTextView personAddress2;

    public RecyclerViewHoldersMonAbs(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);

        personName = (TextView) itemView.findViewById(R.id.person_name_monabs);
        personAddress = (TextView) itemView.findViewById(R.id.person_address_monabs);
        personAddress2 = (JustifyTextView) itemView.findViewById(R.id.person_address_monabs2);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Monumento " + getPosition(), Toast.LENGTH_SHORT).show();

    }
}
