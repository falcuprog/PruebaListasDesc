package com.seminnova.mvpar.pruebalistasdesc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lLayout = new LinearLayoutManager(getParent());

        List<ItemObjectMonAbs> rowListItem = new ArrayList<ItemObjectMonAbs>();
        rowListItem.add(new ItemObjectMonAbs("Nombre","Sierra Nevada: Montaña Sagrada",""));
        rowListItem.add(new ItemObjectMonAbs("Autor", "Gabriel Beltrán",""));
        rowListItem.add(new ItemObjectMonAbs("Medidas", "4.5 mts Alto\n6.0 mts Largo\n4.5 mts Ancho",""));
        rowListItem.add(new ItemObjectMonAbs("Ubicación","Plazoleta de Banderas Gobernación del Cesar",""));
        rowListItem.add(new ItemObjectMonAbs("Categoría", "Abstractos",""));
        rowListItem.add(new ItemObjectMonAbs("Técnica","Acero 304 ensamblado, soldado y bruñido. Ensamble y armado en el sitio determinado",""));
        rowListItem.add(new ItemObjectMonAbs("Reseña","","Este monumento representa a la sierra nevada de Santa Marta, donde  se resaltan los pisos térmicos, maravillos paisajes y el agua que brota desde esta sierra. Desde esta montaña nacen innumerables ríos que alimentan el agua de la región."));

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view_monabs);
        rView.setLayoutManager(lLayout);



        RecyclerViewAdapterMonAbs rcAdapter = new RecyclerViewAdapterMonAbs(getApplicationContext(), rowListItem);
        rView.setAdapter(rcAdapter);

    }
}
