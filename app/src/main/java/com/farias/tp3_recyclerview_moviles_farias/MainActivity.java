package com.farias.tp3_recyclerview_moviles_farias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RecyclerAdapterPeliculas.ListItemClick{

    private RecyclerView mRVPeliculas;

    private static final int lista_numeros = 100;

    private Toast miToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRVPeliculas = findViewById(R.id.RVpeliculas);

        mRVPeliculas.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        mRVPeliculas.setLayoutManager(linearLayoutManager);

        RecyclerAdapterPeliculas mAdapter = new RecyclerAdapterPeliculas(lista_numeros, this);

        mRVPeliculas.setAdapter(mAdapter);

    }

    @Override
    public void onListItemClick(int clickedItem) {

        if(miToast != null){
            miToast.cancel();
        }
        String  mensajeToast = "Item "+ clickedItem + " clickeado";
        miToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        miToast.show();



    }
}