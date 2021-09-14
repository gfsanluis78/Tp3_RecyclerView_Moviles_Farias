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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.detalle_pelicula);
        Intent intent = getIntent();

        peliculasListaViewModel = new PeliculasListaViewModel();
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

            PeliculaModel p = peliculasListaViewModel.getPeliculaXId(idDetalle);
            Log.d("mensajes", p.getTitulo()+" "+p.getActoresPrincipales()+" " +p.getDirector());

            TV_titulo.setText(p.getTitulo());
            foto.setImageResource(p.getImagenCartelera());
            TV_resenia.setText(p.getResenia());
            TV_actores.setText(p.getActoresPrincipales());
            TV_director.setText(p.getDirector());
    }
}
