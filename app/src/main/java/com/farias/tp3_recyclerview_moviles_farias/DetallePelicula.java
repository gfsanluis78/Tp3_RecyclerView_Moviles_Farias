package com.farias.tp3_recyclerview_moviles_farias;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.farias.tp3_recyclerview_moviles_farias.model.PeliculaModel;
import com.farias.tp3_recyclerview_moviles_farias.viewmodel.PeliculasListaViewModel;

public class DetallePelicula extends AppCompatActivity {

    private PeliculasListaViewModel peliculasListaViewModel;
    private TextView TV_titulo,TV_resenia,TV_actores,TV_director;
    private ImageView foto;
    private int idDetalle;
    private PeliculaModel peliculaModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_pelicula);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras().getBundle("bundle");
        peliculaModel = (PeliculaModel) bundle.getSerializable("pelicula");   // casteo el bundle object a PeliculaModel

        idDetalle = intent.getExtras().getInt("id");
        Log.d("mensajeOnCreate",idDetalle+"");
        traerVistas();
        setearVistaDetalle();

    }

        private void traerVistas() {
            // Traigo las vistas
            TV_titulo = findViewById(R.id.TV_titulo_detalle);
            foto = findViewById(R.id.IV_foto_detalle);
            TV_resenia = findViewById(R.id.TV_resenia_detalle);
            TV_actores = findViewById(R.id.TV_actores);
            TV_director = findViewById(R.id.TV_director);
    }


        private void setearVistaDetalle(){
        // las seteo

            Log.d("mensajes", peliculaModel.getTitulo()+" "+peliculaModel.getActoresPrincipales()+" " +peliculaModel.getDirector());

            TV_titulo.setText(peliculaModel.getTitulo());
            foto.setImageResource(peliculaModel.getImagenCartelera());
            TV_resenia.setText(peliculaModel.getResenia());
            TV_actores.setText(peliculaModel.getActoresPrincipales());
            TV_director.setText(peliculaModel.getDirector());
    }
}
