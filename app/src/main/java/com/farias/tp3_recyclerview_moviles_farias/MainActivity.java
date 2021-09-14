package com.farias.tp3_recyclerview_moviles_farias;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.farias.tp3_recyclerview_moviles_farias.adapter.RecyclerAdapterPeliculas;
import com.farias.tp3_recyclerview_moviles_farias.databinding.ActivityMainBinding;
import com.farias.tp3_recyclerview_moviles_farias.model.PeliculaModel;
import com.farias.tp3_recyclerview_moviles_farias.viewmodel.PeliculasListaViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView mRVPeliculas;

//    private final ArrayList<PeliculaModel> lista = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRVPeliculas = findViewById(R.id.RVpeliculas);

        // Instancio el linear layout que va a utilizar el Recycler View
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRVPeliculas.setLayoutManager(linearLayoutManager);
        mRVPeliculas.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        PeliculasListaViewModel model = new ViewModelProvider(this).get(PeliculasListaViewModel.class);
        model.getPeliculas().observe(this, peliculas ->{

            // Instancio un adaptador y se lo seteo al RecyclerView
            RecyclerAdapterPeliculas mAdapter = new RecyclerAdapterPeliculas(this, peliculas);
            mRVPeliculas.setAdapter(mAdapter);

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void bienvenido(){
        String  mensajeToast = "Bienvenido";
        Toast miToast = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        miToast.show();

    }

}