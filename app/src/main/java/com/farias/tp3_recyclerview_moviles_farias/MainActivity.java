package com.farias.tp3_recyclerview_moviles_farias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView mRVPeliculas;
    private RecyclerAdapterPeliculas mAdapter;
    private PeliculaViewModel peliculaViewModel;

    private ArrayList<Pelicula> lista = new ArrayList<>();
    private Toast miToast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancio un nuevo view model del tipo pelicula
        peliculaViewModel = new PeliculaViewModel();

        // llamo al RecyclerView peliculas
        mRVPeliculas = findViewById(R.id.RVpeliculas);

        // Instancio el linear layout que va a utilizar el Recycler View
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRVPeliculas.setLayoutManager(linearLayoutManager);
        mRVPeliculas.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        // Instancio un adaptador y se lo seteo al RecyclerView
        RecyclerAdapterPeliculas mAdapter = new RecyclerAdapterPeliculas(this,peliculaViewModel.getLista());
        mRVPeliculas.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void bienvenido(){
        String  mensajeToast = "Bienvenido";
        miToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        miToast.show();

    }

}