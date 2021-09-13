package com.farias.tp3_recyclerview_moviles_farias;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterPeliculas extends RecyclerView.Adapter<RecyclerAdapterPeliculas.PeliculasViewHolder>{

    private final Context context;
//    final private ListItemClick miOnclickListener;
    private final List<Pelicula> lista;
    LayoutInflater layoutInflater;

    public RecyclerAdapterPeliculas(Context context,List<Pelicula> objetos) {

        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.lista = objetos;
            }

    public interface  ListItemClick{
        void onListItemClick(int clickedItem);
    }

    @NonNull
    @Override
    public PeliculasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        int layoutIdParaListItem = R.layout.lista_peliculas_fila;
        boolean attachToParentRapido = false;

        View view = layoutInflater.inflate(layoutIdParaListItem,parent,attachToParentRapido);

        PeliculasViewHolder viewHolder = new PeliculasViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PeliculasViewHolder holder, int position) {
        Pelicula pelicula = lista.get(position);
        Log.d("mensajeViewHolder", pelicula.getId()+" o " + position);
        holder.titulo.setText(pelicula.getTitulo());
        holder.resenia.setText(pelicula.getResenia());
        holder.IV_foto.setImageResource(pelicula.getImagenCartelera());
        holder.BT_detalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetallePelicula.class);
                intent.putExtra("id",pelicula.getId());
                Log.d("mensajeViewHolder",pelicula.getId()+"");
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    class PeliculasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Button BT_detalles;
        TextView resenia;
        TextView titulo;
        ImageView IV_foto;


        public PeliculasViewHolder(@NonNull View itemView) {
            super(itemView);

            BT_detalles = itemView.findViewById(R.id.BT_detalles);
            resenia = itemView.findViewById(R.id.TV_resenia);
            titulo = itemView.findViewById(R.id.TV_titulo);
            IV_foto = itemView.findViewById(R.id.IV_foto);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
//            int clickedItem = getAdapterPosition();
//
//            miOnclickListener.onListItemClick(clickedItem);
        }
    }
}
